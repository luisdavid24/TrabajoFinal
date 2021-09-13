package platos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import factura.ValorDelPlato;
import insumos.MostrarInsumos;
import insumos.Salsa;
import insumos.generarSalsa;

public class InicioPlatos {

	public static void main(String[] args) throws ClassNotFoundException, IOException {

		Scanner captura = new Scanner(System.in); 
		int opcion; 

		System.out.println("Bienvenido por favor seleccion cada una de nuestras opciones"); 
		System.out.println("1.tacos mexicanos\n2.Quesadillas\n3.sopa Aztecas \n4.Totopos\n5.Trompetas\n6.Mostrar Plato\n7.Mostrar los insumos consumidos\n8.Mostrar todos los platos\n9.Guardar el registro del plato\n0. Salir "); 
		int total=0;
		ArrayList<ObjetoPlato> arrayPlato=new ArrayList<ObjetoPlato>();  
		String[]  arrayInsumos= {"0"};
		String[] arrayIngredientes= {"0"};
		
		do{ 
			opcion = captura.nextInt(); 
			switch(opcion)  
			{ 
				case 1:
					String listaIngredientes[]= {"2","500","10","4","400","10"};//{id, cantidad,cantidad-Minima} salsa
					String listaInsumos[]= {"6","300","16","500"};//{id, cantidad} insumo
					GenerarPlato generar1=new GenerarPlato();
					boolean condicion=generar1.saberSiPuedeCobrar(listaIngredientes, listaInsumos);
					
					if(condicion==true) {
						ValorDelPlato valor1=new ValorDelPlato();
						int id=1;
						float valorOperacion=valor1.valorPlato(id);
						arrayPlato=generar1.modificarArrayPlato(listaIngredientes, listaInsumos, arrayPlato, id, 20,"tacos mexicanos",valorOperacion);
						arrayInsumos=generar1.llenarArrayIngrediente(arrayInsumos, listaIngredientes);
						arrayIngredientes=generar1.llenarArrayIngredientes(arrayInsumos,listaIngredientes);
						
					}else {
						System.out.println("No se puede generar el plato no tiene lo necesario");
						
					}
					System.out.println("1.tacos mexicanos\n2.Quesadillas\n3.sopa Aztecas \n4.Totopos\n5.Trompetas\n6.Mostrar Plato\n7.Mostrar los insumos consumidos\n8.Mostrar todos los platos\n9.Guardar el registro del plato\n0. Salir "); 
					break;
				case 2:
					String listaIngredientes2[]= {"3","400","10","4","200","10"};//{id, cantidad,cantidad-Minima} salsa
					String listaInsumos2[]= {"12","250","6","250","4","100","5","50"};//{id, cantidad} insumo
					GenerarPlato generar2=new GenerarPlato();
					boolean condicion2=generar2.saberSiPuedeCobrar(listaIngredientes2, listaInsumos2);
					
					if(condicion2==true) {
						ValorDelPlato valor1=new ValorDelPlato();
						int id=2;
						float valorOperacion=valor1.valorPlato(id);
						arrayPlato=generar2.modificarArrayPlato(listaIngredientes2, listaInsumos2, arrayPlato, id, 20,"Quesadillas",valorOperacion);
						arrayInsumos=generar2.llenarArrayIngrediente(arrayInsumos, listaIngredientes2);
						arrayIngredientes=generar2.llenarArrayIngredientes(arrayInsumos,listaIngredientes2);
						
					}else {
						System.out.println("No se puede generar el plato no tiene lo necesario");
						
					}
					System.out.println("1.tacos mexicanos\n2.Quesadillas\n3.sopa Aztecas \n4.Totopos\n5.Trompetas\n6.Mostrar Plato\n7.Mostrar los insumos consumidos\n8.Mostrar todos los platos\n9.Guardar el registro del plato\n0. Salir "); 
					break;
				case 3:
					String listaIngredientes3[]= {"3","300","10","4","200","10"};//{id, cantidad,cantidad-Minima} salsa
					String listaInsumos3[]= {"4","200","12","400","4","100"};//{id, cantidad} insumo
					GenerarPlato generar3=new GenerarPlato();
					boolean condicion3=generar3.saberSiPuedeCobrar(listaIngredientes3, listaInsumos3);
					if(condicion3==true) {
						ValorDelPlato valor1=new ValorDelPlato();
						int id=3;
						float valorOperacion=valor1.valorPlato(id);
						arrayPlato=generar3.modificarArrayPlato(listaIngredientes3, listaInsumos3, arrayPlato, id, 20,"Sopa Azteca",valorOperacion);
						arrayInsumos=generar3.llenarArrayIngrediente(arrayInsumos, listaIngredientes3);
						arrayIngredientes=generar3.llenarArrayIngredientes(arrayInsumos,listaIngredientes3);
						
					}else {
						System.out.println("No se puede generar el plato no tiene lo necesario");
						
					}
					System.out.println("1.tacos mexicanos\n2.Quesadillas\n3.sopa Aztecas \n4.Totopos\n5.Trompetas\n6.Mostrar Plato\n7.Mostrar los insumos consumidos\n8.Mostrar todos los platos\n9.Guardar el registro del plato\n0. Salir "); 
					break;
				case 4:
					String listaIngredientes4[]= {"1","200","10","3","300","10","5","150","10"};//{id, cantidad,cantidad-Minima} salsa
					String listaInsumos4[]= {"13","250","3","200","4","100"};//{id, cantidad} insumo
					GenerarPlato generar4=new GenerarPlato();
					boolean condicion4=generar4.saberSiPuedeCobrar(listaIngredientes4, listaInsumos4);
					if(condicion4==true) {
						ValorDelPlato valor1=new ValorDelPlato();
						int id=4;
						float valorOperacion=valor1.valorPlato(id);
						arrayPlato=generar4.modificarArrayPlato(listaIngredientes4, listaInsumos4, arrayPlato, id, 20,"Totopos",valorOperacion);
						arrayInsumos=generar4.llenarArrayIngrediente(arrayInsumos, listaIngredientes4);
						arrayIngredientes=generar4.llenarArrayIngredientes(arrayInsumos,listaIngredientes4);
						
					}else {
						System.out.println("No se puede generar el plato no tiene lo necesario");
						
					}
					System.out.println("1.tacos mexicanos\n2.Quesadillas\n3.sopa Aztecas \n4.Totopos\n5.Trompetas\n6.Mostrar Plato\n7.Mostrar los insumos consumidos\n8.Mostrar todos los platos\n9.Guardar el registro del plato\n0. Salir "); 
					break;	
				case 5:
					String listaIngredientes5[]= {"4","300","10","4","200","10","5","100","10"};//{id, cantidad,cantidad-Minima} salsa
					String listaInsumos5[]= {"12","200","6","200"};//{id, cantidad} insumo
					GenerarPlato generar5=new GenerarPlato();
					boolean condicion5=generar5.saberSiPuedeCobrar(listaIngredientes5, listaInsumos5);
					if(condicion5==true) {
						ValorDelPlato valor1=new ValorDelPlato();
						int id=5;
						float valorOperacion=valor1.valorPlato(id);
						arrayPlato=generar5.modificarArrayPlato(listaIngredientes5, listaInsumos5, arrayPlato, id, 20,"Trompetas",valorOperacion);
						arrayInsumos=generar5.llenarArrayIngrediente(arrayInsumos, listaIngredientes5);
						arrayIngredientes=generar5.llenarArrayIngredientes(arrayInsumos,listaIngredientes5);
						
					}else {
						System.out.println("No se puede generar el plato no tiene lo necesario");
						
					}
					System.out.println("1.tacos mexicanos\n2.Quesadillas\n3.sopa Aztecas \n4.Totopos\n5.Trompetas\n6.Mostrar Plato\n7.Mostrar los insumos consumidos\n8.Mostrar todos los platos\n9.Guardar el registro del plato\n0. Salir "); 
					break;	
					
				case 6:
					new  MostrarPlato(arrayPlato); 
					System.out.println("1.tacos mexicanos\n2.Quesadillas\n3.sopa Aztecas \n4.Totopos\n5.Trompetas\n6.Mostrar Plato\n7.Mostrar los insumos consumidos\n8.Mostrar todos los platos\n9.Guardar el registro del plato\n0. Salir "); 
					break;

				case 7:
					new MostrarLoConsumido(arrayInsumos,arrayIngredientes);
					System.out.println("1.tacos mexicanos\n2.Quesadillas\n3.sopa Aztecas \n4.Totopos\n5.Trompetas\n6.Mostrar Plato\n7.Mostrar los insumos consumidos\n8.Mostrar todos los platos\n9.Guardar el registro del plato\n0. Salir "); 
					break;
				case 8:
					new MostrarPlatos();
					System.out.println("1.tacos mexicanos\n2.Quesadillas\n3.sopa Aztecas \n4.Totopos\n5.Trompetas\n6.Mostrar Plato\n7.Mostrar los insumos consumidos\n8.Mostrar todos los platos\n9.Guardar el registro del plato\n0. Salir "); 
					break;
				case 9:
					new GuardarPlato(arrayPlato);
					System.out.println("1.tacos mexicanos\n2.Quesadillas\n3.sopa Aztecas \n4.Totopos\n5.Trompetas\n6.Mostrar Plato\n7.Mostrar los insumos consumidos\n8.Mostrar todos los platos\n9.Guardar el registro del plato\n0. Salir "); 
					break;
				default:
					break;
			}		
		}while (opcion != 0);

	}

}
