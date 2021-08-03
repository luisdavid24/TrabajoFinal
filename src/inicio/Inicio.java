package inicio;


import java.util.Scanner;


import Logica.IngresarProductos;
import Logica.ModificarProducto;
import Logica.MostrarProductos;
import Logica.Verificar;


public class Inicio {
	public static void main(String[] args) {
		
		
		Scanner pedir = new Scanner(System.in); 
		int opcion; 
		System.out.print("1. Registrar\n2. Mostrar Producto\n3. Modificar producto\n4. Verificar\n0. Salir "); 
		System.out.println(); 
		System.out.println("Selecciones la opci�n:"); 
		String nombre,identificacion,cantidad,valor;
		do{ 
			opcion = pedir.nextInt(); 
			switch(opcion)  
			{ 
				case 1: 
					System.out.println("Escriba la Identificaci�n (id): "); 
					identificacion = pedir.next(); 
					System.out.println("Escriba el nombre del producto: "); 
					nombre = pedir.next(); 
					System.out.println("Escriba la cantidad en kg: "); 
					cantidad = pedir.next(); 
					System.out.println("Escriba el valor en pesos: "); 
					valor = pedir.next(); 
					new IngresarProductos(identificacion,nombre,cantidad,valor); 
					System.out.print("1. Registrar\n2. Mostrar Producto\n3. Modificar producto\n4. Verificar\n0. Salir "); 
					break;
				case 2:
					new MostrarProductos();
					System.out.print("1. Registrar\n2. Mostrar Producto\n3. Modificar producto\n4. Verificar\n0. Salir "); 
					break;
				case 3:
					 //System.out.println("Digite el producto a modificar:");
					 //String producto = pedir.next();
					 new ModificarProducto();
					
					System.out.print("1. Registrar\n2. Mostrar Producto\n3. Modificar producto\n4. Verificar\n0. Salir "); 
					break;
				case 4:
					/*/new Verificar("3b",10);
					Verificar v = new Verificar();
					
					System.out.print("1. Registrar\n2. Mostrar Producto\n3. Modificar producto\n4. Verificar\n0. Salir "); */
					break;
				default:
					System.out.print("1. Registrar\n2. Mostrar Producto\n3. Modificar producto\n4. Verificar\n0. Salir "); 
					break;
			}		
		}while (opcion != 0); 
		
		
	}
}
