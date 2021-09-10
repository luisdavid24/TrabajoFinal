package Logica;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Inicio {

	public static void main(String[] args) {

		Scanner captura = new Scanner(System.in); 
		int opcion; 
		ArrayList<alimentos> ListaAlimentos=new ArrayList<alimentos>();
		//En ListaAlimentos se guarda toda la informacion del inventario
		System.out.println("1. Registrar\n2. Mostrar Producto\n3. Modificar producto\n0. Salir "); 
		do{ 
			opcion = captura.nextInt(); 
			switch(opcion)  
			{ 
				case 1: 
					int opcion2=0;
					try {
						try {
							new RecuperarInf(ListaAlimentos);
						} catch (IOException e) {
							e.printStackTrace();
						}
					} catch (ClassNotFoundException e1) {
						e1.printStackTrace();
					}
					do{ 
						System.out.println("Especifique el Id : ");
						int id = captura.nextInt();
						System.out.println("Especifique el nombre: ");
						String nombre = captura.next();
						System.out.println("Especifique el cantidad : " );
						float cantidad = captura.nextFloat();
						System.out.println("Especifique el valor: ");
						float valor = captura.nextFloat();
						float verificar = 300;
						ListaAlimentos.add(new alimentos(id,nombre,cantidad,valor,verificar));
						new IngresarProductos(ListaAlimentos);
						System.out.println("Digite cero si ya no desea ingresar mas elementos: ");
						opcion2 = captura.nextInt();
						
					}while (opcion2 != 0);
					System.out.println("1. Registrar\n2. Mostrar Producto\n3. Modificar producto\n0. Salir "); 
					break;

				case 2: 
					try {
						new MostrarProductos();
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					System.out.println("1. Registrar\n2. Mostrar Producto\n3. Modificar producto\n0. Salir "); 
					break;

				case 3:
					//Esta parte me quedo pendiente 
					//Luego tenemos que hacerla 
					//Mala mia
					System.out.println("1. Registrar\n2. Mostrar Producto\n3. Modificar producto\n0. Salir "); 
					break;
				
				default:
					break;
			}		
		}while (opcion != 0); 
		
		
				
		
	}

}


//ListaAlimentos.ensureCapacity(numero); definir la capacidad
//ListaAlimentos.trimTosize(); es para cortar la memoria del array
//set->reemplazar get->optener 
//ListaAlimentos.size()
		