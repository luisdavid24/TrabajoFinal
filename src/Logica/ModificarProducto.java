package Logica;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;


public class ModificarProducto {

	public ModificarProducto() {

		RandomAccessFile archivo;
		Scanner ciclo = new Scanner(System.in);
		int      cantidadComida = 0;
		String[] arregloComida;
		
		try {
			archivo = new RandomAccessFile("C:\\Users\\Asus\\Documents\\Taller-de-lenguajes-de-programacion-1\\Restaurante\\datos\\informacion.txt","rw");
			archivo.seek(0);
		    cantidadComida = 0;
		    while(archivo.getFilePointer() < archivo.length()){
		        	archivo.readUTF();
		        	cantidadComida++;
		   }
		   archivo.close();
		   arregloComida = new String[cantidadComida];
		   archivo = new RandomAccessFile("C:\\Users\\Asus\\Documents\\Taller-de-lenguajes-de-programacion-1\\Restaurante\\datos\\informacion.txt","rw");
		   archivo.seek(0);		
		   for(int i=0; i < cantidadComida; i++) {
		       arregloComida[i] = archivo.readUTF();
		   }
		   archivo.close();
		   String idBusqueda;
		   int j=0,condicion=1,cantidadAdicional;
		   System.out.println("Digite el id buscado:");
		   idBusqueda = ciclo.nextLine();
		   archivo = new RandomAccessFile("C:\\Users\\Asus\\Documents\\Taller-de-lenguajes-de-programacion-1\\Restaurante\\datos\\informacion.txt","rw");
		   archivo.seek(0);
		   while(archivo.getFilePointer() < archivo.length() && condicion==1){
				String comparcion=archivo.readUTF();
				j++;
				if(comparcion.equals(idBusqueda)){
					condicion=2;
				}
		   }
		   archivo.close();
		   archivo = new RandomAccessFile("C:\\Users\\Asus\\Documents\\Taller-de-lenguajes-de-programacion-1\\Restaurante\\datos\\informacion.txt","rw");
		   archivo.seek(0);
		   System.out.println("Digite la cantidad de Kg del producto deseado: ");
		   cantidadAdicional = ciclo.nextInt(); 
		   cantidadAdicional+=Integer.parseInt(arregloComida[j+1]);
		   arregloComida[j+1]=Integer.toString(cantidadAdicional);
		   for(int i=0; i < cantidadComida; i++)
			{
			     archivo.writeUTF(arregloComida[i]);
			}	
			archivo.close();		
		        
			}catch(IOException e) {
				System.out.println("Archivo no existe.");
				
			}
	}
}

