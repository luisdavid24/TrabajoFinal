package Logica;


import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;


public class ConsumirComida {
	
	public ConsumirComida(int identificacion,float cantidadGastada,ArrayList<alimentos> ListaAlimentos)  
	{ 
		
		for(alimentos e : ListaAlimentos) {
			if(e.getId()==identificacion) {
				e.setRestar(cantidadGastada);
			}
		}
		new IngresarProductos(ListaAlimentos);
		
	} 

}