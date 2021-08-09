package Logica;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MostrarProductos {

	public MostrarProductos() throws ClassNotFoundException{
		try {
			FileInputStream ruta_entrada = new FileInputStream("datos\\informacion.txt");
			ObjectInputStream leer_datos = new ObjectInputStream(ruta_entrada);
			alimentos[] datos_leidos = (alimentos[]) leer_datos.readObject();
			leer_datos.close();
			for(alimentos e : datos_leidos) {
				System.out.println("Nombre: "+e.getNombre()+" Id: "+e.getId()+" Cantidad: "+e.getCantidad()+"Kg Valor: "+e.getValor()+"$"+" Cantidad minima: "+e.getVerificarCantidad());
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
//Aqui se va traer la informacion



/*
public MostrarProductos() 
	{ 
		String wcadena=""; 
	try  
	{ 
		RandomAccessFile archivo = new RandomAccessFile("datos\\informacion.txt","r"); 
		archivo.seek(0); 
		while(archivo.getFilePointer() < archivo.length()) 
		{ 
			wcadena = "Codigo: "+archivo.readUTF() + " "; 
			wcadena += archivo.readUTF() + " "; 
			wcadena += archivo.readUTF() + "Kg  "; 
			wcadena += archivo.readUTF() + "$ "; 
			System.out.println(wcadena); 
		}
		archivo.close(); 
	}catch(IOException e) {System.out.print(e);} 
	} 


*/