package Logica;


import java.io.IOException;
import java.io.RandomAccessFile;

public class MostrarProductos {
	public MostrarProductos() 
	{ 
		String wcadena=""; 
	try  
	{ 
		RandomAccessFile archivo = new RandomAccessFile("C:\\Users\\Asus\\Documents\\Taller-de-lenguajes-de-programacion-1\\Restaurante\\datos\\informacion.txt","r"); 
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

}
