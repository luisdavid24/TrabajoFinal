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
					//ListaAlimentos tiene la informacion del inventario
					ArrayList<alimentos> ListaAlimentos=new ArrayList<alimentos>();
					try {
						try {
							new RecuperarInf(ListaAlimentos);
						} catch (IOException e) {
							e.printStackTrace();
						}
					} catch (ClassNotFoundException e1) {
						e1.printStackTrace();
					}
					String listaIngredientes[]= {"2","3"};//id cantidad id cantidad
					boolean  condicion=true;
					for(int i=0;i<listaIngredientes.length;i+=2) {
						int id=Integer.parseInt(listaIngredientes[i]);
						float cantidad=Float.parseFloat(listaIngredientes[i+1]);
						Verificar objeto=new Verificar();
						 try {
							 //condicion se mira que se pueda gastar cada producto
							condicion=objeto.condicion(id,cantidad,ListaAlimentos,condicion);
						} catch (ClassNotFoundException e) {
							e.printStackTrace();
						}
						
						
					}
					if(condicion==true) {
						float valor=0;
						SalsasDeLaCasa salsa1 =new SalsasDeLaCasa();
						
						for(int i=0;i<listaIngredientes.length;i+=2) {
							int id=Integer.parseInt(listaIngredientes[i]);
							float cantidad=Float.parseFloat(listaIngredientes[i+1]);
							new ConsumirComida(id,cantidad,ListaAlimentos);//Consumiendo el inventario
							valor+=salsa1.valorSalsa(listaIngredientes,cantidad, ListaAlimentos);
						}
						ArrayList<Salsa> insumosArrayList=new ArrayList<Salsa>();
						try {
							new RecuperSalsa(insumosArrayList);
						} catch (ClassNotFoundException e) {
							e.printStackTrace();
						} catch (IOException e) {
							e.printStackTrace();
						}
						salsa1.agregarSalsa(insumosArrayList,20, valor, 10, "Salsa1");
						
					}
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
