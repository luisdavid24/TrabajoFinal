package Logica;

import java.io.IOException;
import java.io.RandomAccessFile;


public class IngresarProductos {
	
	public IngresarProductos(String identificacion, String nombre,String cantidad,String valor )  
	{ 
		try  
		{ 	
			RandomAccessFile archivo = new  RandomAccessFile("C:\\Users\\Asus\\Documents\\Taller-de-lenguajes-de-programacion-1\\Restaurante\\datos\\informacion.txt","rw"); 
			archivo.seek(archivo.length()); 
			archivo.writeUTF(identificacion); 
			archivo.writeUTF(nombre); 
			archivo.writeUTF(cantidad); 
			archivo.writeUTF(valor); 
			archivo.close(); 
		}catch(IOException e) {System.out.print(e);} 
	} 

}