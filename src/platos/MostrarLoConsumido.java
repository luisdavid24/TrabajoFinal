package platos;

import java.io.IOException;
import java.util.ArrayList;

import Logica.RecuperarInf;
import Logica.alimentos;
import insumos.RecuperarInsumos;
import insumos.Salsa;

public class MostrarLoConsumido {
	public MostrarLoConsumido(String[]  arrayInsumos,String[] arrayIngredientes){
		//ListaAlimentos tiene la informacion del inventario
		ArrayList<alimentos> ListaAlimentos=new ArrayList<alimentos>();
		try {
			new RecuperarInf(ListaAlimentos);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
				
		//arrayPlato trae la informacion guardada.
		ArrayList<Salsa> arraySalsa=new ArrayList<Salsa>();
		try {
			new RecuperarInsumos(arraySalsa);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Veras todos los ingredientes e insumos usados.");
		int tamanoInsumo=arrayInsumos.length;
		int tamanoIngrediente=arrayIngredientes.length;
		
		if(tamanoInsumo>1) {
			System.out.println("Estos fueron los elementos consumidos del inventario:");
			for(int i=1;i<tamanoInsumo;i++) {
				int id=Integer.parseInt(arrayInsumos[i]);
				for(alimentos e : ListaAlimentos) {
					if(e.getId()==id) {
						System.out.println("Se consumio:"+e.getNombre());
					}
				}
			}
			System.out.println("");
			
		}else {
			System.out.println("No se emplearon insumos");
		}
		
		if(tamanoIngrediente>1) {
			System.out.println("Estos fueron los elementos consumidos de los insumos:");
			for(int i=1;i<tamanoIngrediente;i++) {
				int id=Integer.parseInt(arrayIngredientes[i]);
				for(Salsa e : arraySalsa) {
					if(e.getId()==id) {
						System.out.println("Se consumio:"+e.getNombre());
					}
				}
			}
			System.out.println("");
			
		}else {
			System.out.println("No se emplearon ingredientes");
			
		}
	}
}
