package Logica;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;



public class ModificarProducto {
	Scanner captura = new Scanner(System.in); 
	
	public ModificarProducto(ArrayList<alimentos> ListaAlimentos) throws ClassNotFoundException{
		try {
			FileInputStream ruta_entrada = new FileInputStream("datos\\informacion.txt");
			ObjectInputStream leer_datos = new ObjectInputStream(ruta_entrada);
			alimentos[] datos_leidos = (alimentos[]) leer_datos.readObject();
			leer_datos.close();
			if(datos_leidos!=null) {
				System.out.println("Especifique el Id que quiere modificar: ");
				int idBusqueda=captura.nextInt();
				for(int i=0;i<datos_leidos.length;i++) {
					if(datos_leidos[i].getId()==idBusqueda) {
						System.out.println("Nuevo el Id : ");
						int id = captura.nextInt();
						System.out.println("Nuevo nombre: ");
						String nombre = captura.next();
						System.out.println("Nueva cantidad : " );
						float cantidad = captura.nextFloat();
						System.out.println("Nuevo valor: ");
						float valor = captura.nextFloat();
						System.out.println("Nueva cantidad minima: ");
						float verificar = captura.nextFloat();
						datos_leidos[i].setCantidad(cantidad);
						datos_leidos[i].setId(id);
						datos_leidos[i].setNombre(nombre);
						datos_leidos[i].setValor(valor);
						datos_leidos[i].setVerificarCantidad(verificar);
					}
				}
				for(int i=0;i<datos_leidos.length;i++) {
					ListaAlimentos.add(datos_leidos[i]);
				}
				new IngresarProductos(ListaAlimentos);
				
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}

