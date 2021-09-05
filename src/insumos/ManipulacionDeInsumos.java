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
						String listaIngredientes[]= {"1","100","2","20","3","100","4","100"};//{id ,cantidad ,id, cantidad} 
						//generarSalsa es una forma de generar salsa sin tener que repetir tanto codigo :)
						new generarSalsa(listaIngredientes,cantidadSalsa,idSalsa, nombreSalsa);
						System.out.println("1. Salsa de Ajo\n2. Salsa Rosada\n3. Tortillas\n0. Salir "); 
						break;
					case 2:
						nombreSalsa="Salsa Rosada";
						 cantidadSalsa=10000;
						 idSalsa=2; 
						System.out.println("la salsa Rosada tiene los siguientes ingredicentes (cebolla - mayoneza - Salsa de tomate\n)"); 
						String listaIngredientes1[]= {"3","200","4","80","6","100"};//{id ,cantidad ,id, cantidad} 
						//generarSalsa es una forma de generar salsa sin tener que repetir tanto codigo :)
						new generarSalsa(listaIngredientes1,cantidadSalsa,idSalsa, nombreSalsa);
						System.out.println("1. Salsa de Ajo\n2. Salsa Rosada\n3. Tortillas\n0. Salir "); 
						
						break;
						
					case 3:
						nombreSalsa="Tortilla";
						cantidadSalsa=10000;
						idSalsa=3; 
						System.out.println("la salsa de Ajo tiene los siguientes ingredicentes (Sal - cebolla - Arina\n)"); 
						String listaIngredientes2[]= {"2","20","3","40","5","400"};//{id ,cantidad ,id, cantidad} 
						//generarSalsa es una forma de generar salsa sin tener que repetir tanto codigo :)
						new generarSalsa(listaIngredientes2,cantidadSalsa,idSalsa, nombreSalsa);
						System.out.println("1. Salsa de Ajo\n2. Salsa Rosada\n3. Tortillas\n0. Salir "); 
						
						break;

					default:
						break;
				}		
			}while (opcion != 0);

			 }
}
