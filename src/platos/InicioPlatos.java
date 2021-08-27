package platos;

import java.util.ArrayList;
import java.util.Scanner;

import insumos.MostrarInsumos;
import insumos.Salsa;
import insumos.generarSalsa;

public class InicioPlatos {

	public static void main(String[] args) {

		Scanner captura = new Scanner(System.in); 
		int opcion; 

		System.out.println("Bienvenido por favor seleccion cada una de nuestras opciones"); 
		System.out.println("1. Plato #1\n2.Mostrar #2\n0. Salir "); 
		int total=0;
		ArrayList<ObjetoPlato> arrayPlato=new ArrayList<ObjetoPlato>();
		String[]  arrayInsumos= {"0"};
		String[] arrayIngredientes= {"0"};
		
		do{ 
			opcion = captura.nextInt(); 
			switch(opcion)  
			{ 
				case 1:
					//HACER CON ARCHIVO PLANO
					 
					//Se debe gastar la los insumos  y las salsa si se puede 
					String listaIngredientes[]= {"4","1","10"};//{id, cantidad,cantidad-Minima}
					String listaInsumos[]= {"4","1"};
					GenerarPlato generar1=new GenerarPlato();
					
					boolean condicion=generar1.saberSiPuedeCobrar(listaIngredientes, listaInsumos);
					
					if(condicion==true) {
						arrayPlato=generar1.modificarArrayPlato(listaIngredientes, listaInsumos, arrayPlato, 1, 20,"Plato1");
						arrayInsumos=generar1.llenarArrayIngrediente(arrayInsumos, listaIngredientes);
						arrayIngredientes=generar1.llenarArrayIngredientes(arrayInsumos,listaIngredientes);
						
					}
					break;
				case 2:
					new  MostrarPlato(arrayPlato); 
					break;

				case 3:
					
					break;

				default:
					break;
			}		
		}while (opcion != 0);

	}

}
