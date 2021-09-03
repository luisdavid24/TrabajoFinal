package Logica;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class AdicionarProductoInventario {
	
	Scanner captura = new Scanner(System.in); 
	
	public AdicionarProductoInventario(ArrayList<alimentos> ListaAlimentos) throws ClassNotFoundException {
		
		
		try {
			FileInputStream ruta_entrada = new FileInputStream("datos\\informacion.txt");
			ObjectInputStream leer_datos = new ObjectInputStream(ruta_entrada);
			alimentos[] datos_leidos = (alimentos[]) leer_datos.readObject();
			leer_datos.close();
			if(datos_leidos!=null) {
				System.out.println("Indique el Id del elemento del inventario al que adicionara producto: ");
				int idBusqueda=captura.nextInt();				
				for(int i=0;i<datos_leidos.length;i++) {
					
					if(datos_leidos[i].getId()==idBusqueda) {
						
						int id = datos_leidos[i].getId();						
						String nombre = datos_leidos[i].getNombre();
						
						System.out.println("Indique la Catidad que se adicionara : " );
						float adicion = captura.nextFloat();
						float cantidad = datos_leidos[i].getCantidad() + adicion;
						
						
						System.out.println("Valor de lo adicionado: ");						
						float valorAdicionado = captura.nextFloat();						
						float valor = datos_leidos[i].getValor() + valorAdicionado;
								
						float verificar = datos_leidos[i].getVerificarCantidad();
						
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

