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
		System.out.println("1. Crear Insumo\n2. Mostrar Insumo\n3. Modificar Insumo\n0. Salir "); 
	
		do{ 
			opcion = captura.nextInt(); 
			switch(opcion)  
			{ 
				case 1:
					new ManipulacionDeInsumos();
					System.out.println("1. Crear Insumo\n2. Mostrar Insumo\n3. Modificar Insumo\n0. Salir "); 
					break;
					
				case 2:
					try {
						new MostrarInsumos();
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					System.out.println("1. Crear Insumo\n2. Mostrar Insumo\n3. Modificar Insumo\n0. Salir "); 
					break;
					
				case 3:
					ArrayList<Salsa> insumosArrayList=new ArrayList<Salsa>();
					try {
						new ModificarInsumos(insumosArrayList);
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					System.out.println("1. Crear Insumo\n2. Mostrar Insumo\n3. Modificar Insumo\n0. Salir "); 
					break;
				default:
					break;
			}		
		}while (opcion != 0);
	}


}

