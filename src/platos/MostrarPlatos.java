package platos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import Logica.alimentos;

public class MostrarPlatos {
	
	public MostrarPlatos() throws ClassNotFoundException {
		try {
			FileInputStream ruta_entrada = new FileInputStream("datos\\platos.txt");
			ObjectInputStream leer_datos = new ObjectInputStream(ruta_entrada);
			ObjetoPlato[] datos_leidos = (ObjetoPlato[]) leer_datos.readObject();
			leer_datos.close();
			for(ObjetoPlato e : datos_leidos) {
				System.out.println("Nombre: "+e.getNombre()+" Id: "+e.getId()+" Cantidad: "+e.getCantidad()+"Kg Valor: "+e.getValor()+"$");
			}
		}catch (IOException e) {
			e.printStackTrace();
		}

	}
}
