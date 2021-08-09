package insumos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import Logica.alimentos;

public class MostrarInsumos {

	public MostrarInsumos() throws ClassNotFoundException{
		try {
			FileInputStream ruta_entrada = new FileInputStream("datos\\insumos.txt");
			ObjectInputStream leer_datos = new ObjectInputStream(ruta_entrada);
			Salsa[] datos = (Salsa[]) leer_datos.readObject();
			leer_datos.close();
			for(Salsa e : datos) {
				System.out.println("Nombre: "+e.getNombre()+" Id: "+e.getId()+" Cantidad: "+e.getCantidad()+"Kg Valor: "+e.getValor()+"$");
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	
	}
}
