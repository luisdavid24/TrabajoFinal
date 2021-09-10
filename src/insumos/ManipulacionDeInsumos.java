package insumos;

import java.util.Scanner;

public class ManipulacionDeInsumos {
	 public ManipulacionDeInsumos () {
			Scanner captura = new Scanner(System.in); 
			int opcion;
			String nombreSalsa;
			float cantidadSalsa;
			int idSalsa;

			System.out.println("Seleccione la opcion del insumo a crear"); 
			System.out.println("1. Salsa de Ajo\n2. Salsa Rosada\n3. Tortillas\n0. Salir "); 

			do{ 
				opcion = captura.nextInt(); 
				switch(opcion)  
				{ 
					case 1:
						nombreSalsa="Salsa de ajo";
						cantidadSalsa=10000;
						idSalsa=1; 
						System.out.println("la salsa de Ajo tiene los siguientes ingredicentes (Ajo - sal - cebolla - mayoneza\n)"); 
						String listaIngredientes[]= {"3","200","11","300","1","50"};//{id ,cantidad ,id, cantidad} 
						//generarSalsa es una forma de generar salsa sin tener que repetir tanto codigo :)
						new generarSalsa(listaIngredientes,cantidadSalsa,idSalsa, nombreSalsa);
						System.out.println("1. Salsa de Ajo\n2. Salsa Rosada\n3. Tortillas\n0. Salir "); 
						break;
					case 2:
						nombreSalsa="frijol refrito";
						cantidadSalsa=30000;
						idSalsa=2; 
						System.out.println("la salsa Rosada tiene los siguientes ingredicentes (cebolla - mayoneza - Salsa de tomate\n)"); 
						String listaIngredientes1[]= {"7","10000","15","400","3","100"};//{id ,cantidad ,id, cantidad} 
						new generarSalsa(listaIngredientes1,cantidadSalsa,idSalsa, nombreSalsa);
						System.out.println("1. Salsa de Ajo\n2. Salsa Rosada\n3. Tortillas\n0. Salir "); 
						break;
						
					case 3:
						nombreSalsa="Tortilla";
						cantidadSalsa=10000;
						idSalsa=3; 
						System.out.println("la salsa de Ajo tiene los siguientes ingredicentes (Sal - cebolla - Arina\n)"); 
						String listaIngredientes2[]= {"14","10000","15","400"};//{id ,cantidad ,id, cantidad} 
						new generarSalsa(listaIngredientes2,cantidadSalsa,idSalsa, nombreSalsa);
						System.out.println("1. Salsa de Ajo\n2. Salsa Rosada\n3. Tortillas\n0. Salir "); 
						break;
					case 4:
						nombreSalsa="Guacamole ";
						cantidadSalsa=45000;
						idSalsa=4; 
						System.out.println("la salsa de Ajo tiene los siguientes ingredicentes (Sal - cebolla - Arina\n)"); 
						String listaIngredientes3[]= {"9","15000","1","100","3","1000"};//{id ,cantidad ,id, cantidad} 
						new generarSalsa(listaIngredientes3,cantidadSalsa,idSalsa, nombreSalsa);
						System.out.println("1. Salsa de Ajo\n2. Salsa Rosada\n3. Tortillas\n0. Salir "); 
						break;
					case 5:
						nombreSalsa="Guacamole ";
						cantidadSalsa=40000;
						idSalsa=5; 
						System.out.println("la salsa de Ajo tiene los siguientes ingredicentes (Sal - cebolla - Arina\n)"); 
						String listaIngredientes4[]= {"8","10000","2","300","11","500"};//{id ,cantidad ,id, cantidad} 
						new generarSalsa(listaIngredientes4,cantidadSalsa,idSalsa, nombreSalsa);
						System.out.println("1. Salsa de Ajo\n2. Salsa Rosada\n3. Tortillas\n0. Salir "); 
						
						break;


					default:
						break;
				}		
			}while (opcion != 0);

			 }
}
