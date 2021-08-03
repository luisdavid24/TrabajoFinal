package Logica;

import java.io.IOException;
import java.io.RandomAccessFile;


public class Verificar {
	
	public Verificar(String identificacion, int cantidadMinima,int cantidadMenos)  
	{ 	int condicion=1;
		try  
		{ 	
			RandomAccessFile archivo = new  RandomAccessFile("datos\\informacion.txt","r"); 
			archivo.seek(0);
			
		    while(archivo.getFilePointer() < archivo.length()){
		        	String codigo=archivo.readUTF();
		        	if(codigo.equals(identificacion)) {
		        		String comida=archivo.readUTF();
		        		int cantidad=Integer.parseInt(archivo.readUTF());
		        		cantidad-=cantidadMenos;
		        		if(cantidad<=cantidadMinima) {
		        			System.out.println("No se tiene la cantidad minima de "+comida);
		        			System.out.println("Por favor agrega mas cantidad de "+comida);
		           			condicion=2;
		        		}
		        	}
		   }
		   archivo.close(); 
		   /*if(condicion==1) {
			   	new ConsumirComida(identificacion,cantidadMenos);
		   }*/
		}catch(IOException e) {System.out.print(e);} 
	} 

}


/*
 * 
 * informacion.txt
 * salsa.txt
 * comidas.txt
 * 
 * funcion preparacion()
 * RandomAccessFile comida
 * ['arroz-coco','aceite','arroz','coco','salsa-coco'] 
 * 
 * funcion preparcion2(20 b2 40 c4 50 5f)
 * RandomAccessFile salsa
 * ['salsa-coco','coco','vailla]
 * 30 c1 20 c4
 * 
 * 
 * funcion preparcion3(40,c1 )
 * RandomAccessFile informacion
 * [coco 20,vailla 40]
 * bloqueo
 * 
 * 
 * Logica2
 * 
 * 
 * menu->salsa->inventario.
 * */

