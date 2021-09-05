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
		System.out.println("1.Generar el plato #1\n2.Mostrar el plato #2\n3.Mostrar los insumos consumidos\n4.Mostrar todos los platos\n0. Salir "); 
		int total=0;
		ArrayList<ObjetoPlato> arrayPlato=new ArrayList<ObjetoPlato>();
		String[]  arrayInsumos= {"0"};
		String[] arrayIngredientes= {"0"};
		
		do{ 
			opcion = captura.nextInt(); 
			switch(opcion)  
			{ 
				case 1:
					String listaIngredientes[]= {"1","1","2"};//{id, cantidad,cantidad-Minima} salsa
					String listaInsumos[]= {"1","1"};//{id, cantidad} insumo
					GenerarPlato generar1=new GenerarPlato();
					boolean condicion=generar1.saberSiPuedeCobrar(listaIngredientes, listaInsumos);
					
					if(condicion==true) {
						ValorDelPlato valor1=new ValorDelPlato();
						int id=1;
						float valorOperacion=valor1.valorPlato(id);
						arrayPlato=generar1.modificarArrayPlato(listaIngredientes, listaInsumos, arrayPlato, id, 20,"Plato1",valorOperacion);
						arrayInsumos=generar1.llenarArrayIngrediente(arrayInsumos, listaIngredientes);
						arrayIngredientes=generar1.llenarArrayIngredientes(arrayInsumos,listaIngredientes);
						System.out.println("tamaño: "+arrayPlato.size());
						
					}else {
						System.out.println("No se puede generar el plato no tiene lo necesario");
						
					}
					break;
				case 2:
					new  MostrarPlato(arrayPlato); 
					break;

				case 3:
					new MostrarLoConsumido(arrayInsumos,arrayIngredientes);
					break;
				case 4:
					new MostrarPlatos();
					break;
				case 5:
					new GuardarPlato(arrayPlato);
					break;
				default:
					break;
			}		
		}while (opcion != 0);

	}

}
