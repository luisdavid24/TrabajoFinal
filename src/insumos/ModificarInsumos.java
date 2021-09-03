package insumos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class ModificarInsumos {
	Scanner captura = new Scanner(System.in); 
	
	public ModificarInsumos(ArrayList<Salsa> listaSalsas) throws ClassNotFoundException {
		
		try {
			
			FileInputStream ruta_entrada = new FileInputStream("datos\\insumos.txt");
			ObjectInputStream leer_datos = new ObjectInputStream(ruta_entrada);
			Salsa[] datos_leidos = (Salsa[]) leer_datos.readObject();
			leer_datos.close();
			
			if(datos_leidos!=null) {
				System.out.println("Especifique el Id del elemento a modificar: ");
				int idBusqueda=captura.nextInt();
				for(int i=0;i<datos_leidos.length;i++) {
					if(datos_leidos[i].getId()==idBusqueda) {
						
						int id = datos_leidos[i].getId();						
						String nombre = datos_leidos[i].getNombre();
						
						System.out.println("Del Insumo "+nombre+", Indique la Nueva cantidad : " );
						float cantidad = captura.nextFloat();
						System.out.println("Del Insumo "+nombre+", Indique el nuevo valor : " );
						float valor = captura.nextFloat();
						
						datos_leidos[i].setCantidad(cantidad);
						datos_leidos[i].setId(id);
						datos_leidos[i].setNombre(nombre);
						datos_leidos[i].setValor(valor);
						
						
				}
					
					for(int j=0;j<datos_leidos.length;j++) {
						
						listaSalsas.add(datos_leidos[i]);						
						
					}
					
					SalsasDeLaCasa salsa =new SalsasDeLaCasa();
					
					salsa.agregarSalsaModificada(listaSalsas);
					
					
				}
			
			
		}
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}
