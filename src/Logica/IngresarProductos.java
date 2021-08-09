package Logica;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;




public class IngresarProductos {
	
	public IngresarProductos() {}
	
	public IngresarProductos(ArrayList<alimentos> alimentosIntroduccido) {
		alimentos[] arregloAlimento = new alimentos[alimentosIntroduccido.size()];
		for(int i=0;i<alimentosIntroduccido.size();i++) {
			arregloAlimento[i]=alimentosIntroduccido.get(i);
		}
		try {
			FileOutputStream ruta_salida = new FileOutputStream("datos\\informacion.txt");
			ObjectOutputStream archivo_salida = new ObjectOutputStream(ruta_salida);
			archivo_salida.writeObject(arregloAlimento);
			archivo_salida.close();
			ruta_salida.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
}


/*
	public IngresarProductos() { }

public IngresarProductos(String identificacion, String nombre,String cantidad,String valor )  
	{ 
		try  
		{ 	
			RandomAccessFile archivo = new  RandomAccessFile("datos\\informacion.txt","rw"); 
			archivo.seek(archivo.length()); 
			archivo.writeUTF(identificacion); 
			archivo.writeUTF(nombre); 
			archivo.writeUTF(cantidad); 
			archivo.writeUTF(valor); 
			archivo.close(); 
		}catch(IOException e) {System.out.print(e);} 
	} 
	public void IngresarProductosInsumos(String identificacion, String nombre, String cantidad, String valor) {
		
		try  
		{ 	
			RandomAccessFile archivo = new  RandomAccessFile("datos\\Insumos.txt","rw"); 
			archivo.seek(archivo.length()); 
			archivo.writeUTF(identificacion); 
			archivo.writeUTF(nombre); 
			archivo.writeUTF(cantidad); 
			archivo.writeUTF(valor); 
			archivo.close(); 
		}catch(IOException e) {System.out.print(e);} 
	}

*/