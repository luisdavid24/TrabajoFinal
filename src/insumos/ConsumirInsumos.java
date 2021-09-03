package insumos;

import java.util.ArrayList;

import Logica.IngresarProductos;
import Logica.alimentos;

public class ConsumirInsumos {
	public ConsumirInsumos(int id,float cantidad,float cantidadMinima,ArrayList<Salsa> arraySalsa) {
		for(Salsa e : arraySalsa) {
			if(e.getId()==id) {
				float aux=e.getCantidad()-cantidad;
				if(aux>cantidadMinima) {
					e.setCantidad(cantidadMinima);
				}
			}
		}
		new IngresarSalsa(arraySalsa);
	}
}
