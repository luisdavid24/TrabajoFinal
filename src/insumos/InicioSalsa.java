package insumos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Logica.ConsumirComida;
import Logica.RecuperarInf;
import Logica.Verificar;
import Logica.alimentos;

public class InicioSalsa {

	public static void main(String[] args) {
		Scanner captura = new Scanner(System.in); 
		int opcion; 

		System.out.println("Bienvenido por favor seleccion cada una de nuestras opciones"); 
		System.out.println("1. Salsa #1\n2. Salsa #2\n3. Salsa #3\n0. Salir "); 
	
		do{ 
			opcion = captura.nextInt(); 
			switch(opcion)  
			{ 
				case 1:
					String nombreSalsa="Salsa1";
					float cantidadSalsa=20;
					int idSalsa=1;
					String listaIngredientes[]= {"4","1"};//{id ,cantidad ,id, cantidad}
					//generarSalsa es una forma de generar salsa sin tener que repetir tanto codigo :)
					new generarSalsa(listaIngredientes,cantidadSalsa,idSalsa, nombreSalsa);
					System.out.println("1. Salsa #1\n2. Salsa #2\n3. Salsa #3\n0. Salir "); 
					break;
				case 4:
					try {
						new MostrarInsumos();
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					break;

				default:
					break;
			}		
		}while (opcion != 0);
	}

}

