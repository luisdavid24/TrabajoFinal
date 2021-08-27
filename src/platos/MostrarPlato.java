package platos;

import java.util.ArrayList;

import insumos.Salsa;

public class MostrarPlato {
	public MostrarPlato(ArrayList<ObjetoPlato> ListaPlato) {
		if(ListaPlato == null || ListaPlato.size() == 0)
		{
		  System.out.println(" No se tiene ningun plato");
		}
		else{
			for(int i=0;i<ListaPlato.size();i++) {
				System.out.println("Id:"+ListaPlato.get(i).getId()+" Nombre:"+ListaPlato.get(i).getNombre()+" Cantidad"+ListaPlato.get(i).getCantidad()+" Valor:"+ListaPlato.get(i).getValor());
			}
		}
		
	}
}
