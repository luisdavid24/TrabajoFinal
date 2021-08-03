package insumos;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

import Logica.Verificar;
import Logica.ModificarProducto;
import Logica.IngresarProductos;

public class SalsasDeLaCasa {
	
	public SalsasDeLaCasa() {
	
	Scanner ingresar = new Scanner(System.in);
	int opcion=0;
	
	do {
		
	System.out.println("Escoja la salsa a preparar: \n1- Salsa de Ajo \n2- Salsa Rosada \n0- No preparar salsa");
	opcion = ingresar.nextInt();
	
	}while(opcion<0 || opcion>2);
	
	
	switch (opcion) {
	
	case 1:
		System.out.println("Para preparar la salsa de ajo debe tener los siguientes ingredientes: \n- 500 gramos de Ajo. - 10 gramos de Sal. - 500 gramos de Cebolla. - 400 gramos de Mayonesa. ");
		
		System.out.println("Digite S(si) o N(no) \nPara iniciar la prepacion y validar si se cuenta con los ingredientes necesarios");
		char letra = ingresar.next().charAt(0);
		
		while(letra!='S' || letra!='N') {
		
			System.out.println("POR FAVOR DIGITE\n S(si) o N(no) \nPara iniciar la prepacion y validar si se cuenta con los ingredientes necesarios");
			letra = ingresar.next().charAt(0);
		}
		
		if (letra=='S') {
			
			Verificar ajo= new  Verificar();	
			
			String a = ajo.VerificarInventario("V1012",500);
			String p ="no";
			int si =0, si2=0;
						
			if(a.equals(p)) { //V1013 para AJO en el inventario
				
				System.out.println("No se tiene la cantidad minima de Ajo para la preparacion, se debe comprar mas ingrediente ");
			}else {
				System.out.println("AJO = OK");
				si ++;
			}
			
			
			Verificar sal= new  Verificar();
			String b = sal.VerificarInventario("V1012",10);
			String m ="no";
			
			
			if(b.equals(m)) { //V1013 para AJO en el inventario
				
				System.out.println("No se tiene la cantidad minima de SAL para la preparacion, se debe comprar mas ingrediente ");
			}else {
				System.out.println("SAL = OK");
				si2 ++;
			}
			if(si!=0 && si2!=0) {
				
				System.out.println("Se inicia la preparacion de la salsa de ajo");
				
				ModificarProducto s = new ModificarProducto(); 
				s.ModificarProductoInventario("V1012",500);
				s.ModificarProductoInventario("V1012",10);
				
				IngresarProductos i = new IngresarProductos();
				i.IngresarProductosInsumos("I9001", "Salsa de ajo", "3000", "5000");
				
			} 
			
				
			}else {
				System.out.println("No se cuenta con los ingredientes para la preparacion de la salsa de ajo");
			}
			
			
		
			
			break;
			
		
		
		
	case 2:
		
		break;
		
		
	}
	
	
}
	
}
