package Logica;

import java.io.IOException;
import java.io.RandomAccessFile;


public class Verificar {
	
	private String identificacion;
	private int cantidadMenos;
	
	public Verificar() {}
	
	public Verificar(String identificacion, int cantidadMenos) {
		
		this.identificacion = identificacion;
		this.cantidadMenos = cantidadMenos;
	}


	public String getIdentificacion() {
		return identificacion;
	}


	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}


	public int getCantidadMenos() {
		return cantidadMenos;
	}


	public void setCantidadMenos(int cantidadMenos) {
		this.cantidadMenos = cantidadMenos;
	}
	
	


	public String VerificarInventario(String getIdentificacion,  int getCantidadMenos ) { // cantidad menos es lo que se utiliza para una preparacion, este parametro se debe pasar siempre que se prepare un producto
		
		int condicion=1;
		int cantidadMinima = 1000;
		String mostrar ="";
		boolean p= true;
		
		
		try  
		{ 	
			RandomAccessFile archivo = new  RandomAccessFile("C:\\Users\\rober\\Desktop\\Programas_Eclipse\\informacion.txt","r"); 
			archivo.seek(0);
			
		    while(archivo.getFilePointer() < archivo.length()){
		        	String codigo=archivo.readUTF();
		        	if(codigo.equals(getIdentificacion)) {
		        		String comida=archivo.readUTF();
		        		int cantidad=Integer.parseInt(archivo.readUTF());
		        		cantidad-=getCantidadMenos;
		        		if(cantidad<=cantidadMinima) {
		        			mostrar = "no";
		        			p=false;
		           			//condicion=2;
		        		}
		        		else {
		        			mostrar = "si";
		        			p=true;
		        		}
		        	}
		   }
		   archivo.close(); 
		   /*if(condicion==1) {
			   	new ConsumirComida(identificacion,cantidadMenos);
		   }*/
		}catch(IOException e) {System.out.print(e);} 
		
		return mostrar; 
	
	}

	@Override
	public String toString() {
		return "Verificar [identificacion=" + identificacion + "]";
	}
	
}

