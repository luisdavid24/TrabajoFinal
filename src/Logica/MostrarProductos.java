package Logica;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MostrarProductos {

	public MostrarProductos() throws ClassNotFoundException{
		try {
			FileInputStream ruta_entrada = new FileInputStream("datos\\informacion.txt");
			ObjectInputStream leer_datos = new ObjectInputStream(ruta_entrada);
			alimentos[] datos_leidos = (alimentos[]) leer_datos.readObject();
			leer_datos.close();
			System.out.println("Nombre: \t\tId: \t\tCantidad(g) \t\tValor($): \t\tCantidad minima: ");
			for(alimentos e : datos_leidos) {
				System.out.println(" "+e.getNombre()+" \t\t\t"+e.getId()+" \t\t"+e.getCantidad()+" \t\t"+e.getValor()+"$"+" \t\t"+e.getVerificarCantidad());
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
