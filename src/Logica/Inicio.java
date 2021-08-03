package Logica;

import java.util.Scanner;


public class Inicio {

	public static void main(String[] args) {

		Scanner pedir = new Scanner(System.in); 
		int opcion; 
		System.out.print("1. Registrar\n2. Mostrar Producto\n3. Modificar producto\n4. Verificar\n0. Salir "); 
		System.out.println(); 
		System.out.println("Selecciones la opción:"); 
		String nombre,identificacion,cantidad,valor;
		do{ 
			opcion = pedir.nextInt(); 
			switch(opcion)  
			{ 
				case 1: 
					break;
				default:
					break;
			}		
		}while (opcion != 0); 

		
	}

}
