package Logica;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;


public class ConsumirComida {
	
	public ConsumirComida(String identificacion, int cantidadGastada )  
	{ 
		Scanner ciclo = new Scanner(System.in);
		int      cantidadComida = 0;
		String[] arregloComida;
		
		try  
		{ 	
			RandomAccessFile archivo = new  RandomAccessFile("C:\\Users\\Asus\\Documents\\Taller-de-lenguajes-de-programacion-1\\Restaurante\\datos\\informacion.txt","r"); 
			archivo.seek(0);
		    cantidadComida = 0;
		    while(archivo.getFilePointer() < archivo.length()){
		        	archivo.readUTF();
		        	cantidadComida++;
		   }
		   archivo.close();
		   archivo.seek(0);
		   arregloComida = new String[cantidadComida];
		   archivo = new RandomAccessFile("C:\\Users\\Asus\\Documents\\Taller-de-lenguajes-de-programacion-1\\Restaurante\\datos\\informacion.txt","rw");
		   archivo.seek(0);		
		   for(int i=0; i < cantidadComida; i++) {
		       arregloComida[i] = archivo.readUTF();
		   }
		   archivo.close(); 
		   int j=0,condicion=1,cantidadAdicional;
		   System.out.println("Digite el id buscado:");
		   archivo = new RandomAccessFile("C:\\Users\\Asus\\Documents\\Taller-de-lenguajes-de-programacion-1\\Restaurante\\datos\\informacion.txt","rw");
		   archivo.seek(0);
		   while(archivo.getFilePointer() < archivo.length() && condicion==1){
				String comparcion=archivo.readUTF();
				j++;
				if(comparcion.equals(identificacion)){
					condicion=2;
				}
		   }
		   archivo.close();
		   archivo = new RandomAccessFile("C:\\Users\\Asus\\Documents\\Taller-de-lenguajes-de-programacion-1\\Restaurante\\datos\\informacion.txt","rw");
		   archivo.seek(0);
		   int cantidad=Integer.parseInt(arregloComida[j+1]);
		   cantidad-=cantidadGastada;
		   arregloComida[j+1]=Integer.toString(cantidad);
		   for(int i=0; i < cantidadComida; i++) {
				 archivo.writeUTF(arregloComida[i]);
				
			}	
			archivo.close();		
		    
		}catch(IOException e) {System.out.print(e);} 
	} 

}