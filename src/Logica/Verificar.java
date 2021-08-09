package Logica;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;


public class Verificar {
	public Verificar() {}
	
		public Verificar(int identificacion,float cantidadGastada,ArrayList<alimentos> ListaAlimentos) {
			boolean condicion1=false;
			boolean condicion2=false;
			for(alimentos e : ListaAlimentos) {
				if(e.getId()==identificacion) {
					condicion1=true;
					float aux=e.getCantidad();
					aux-=cantidadGastada;
					if(aux>e.getVerificarCantidad()) {
						condicion2=true;
					}
				}
			}
			if(condicion1==true && condicion2==true) {
				new ConsumirComida(identificacion,cantidadGastada,ListaAlimentos);
			}else if(condicion1==false) {
				System.out.println("No se tiene el producto con ese ID: "+identificacion);
			}else {
				System.out.println("No se tiene la cantidad necesaria del producto.");
			}

	}
	public boolean condicion(int identificacion,float cantidadGastada,ArrayList<alimentos> ListaAlimentos,boolean condicion) throws ClassNotFoundException {
		boolean condicion1=false;
		boolean condicion2=false;
			for(alimentos e : ListaAlimentos) {
				if(e.getId()==identificacion) {
					condicion1=true;
					float aux=e.getCantidad();
					aux-=cantidadGastada;
					if(aux>e.getVerificarCantidad()) {
						condicion2=true;
					}
				}
			}
			if(condicion1==true && condicion2==true) {
					return condicion;
			}else if(condicion1==false) {
				System.out.println("No se tiene el producto con ese ID: "+identificacion);
				condicion=false;
			}else {
				System.out.println("No se tiene la cantidad necesaria del producto.");
				condicion=false;
			}
			return condicion;
		
						

		}

}

