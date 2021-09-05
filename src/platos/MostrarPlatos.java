package platos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;

import Logica.alimentos;

public class MostrarPlatos {
	
	public MostrarPlatos() throws ClassNotFoundException, IOException {
		boolean condicion=false;
		try {
			BufferedReader br;
			br = new BufferedReader(new FileReader("datos\\platos.txt"));
			if (br.readLine() != null) {
				condicion=true;
			}
			br.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}   
		if(condicion==true) {
			
			try {
				FileInputStream ruta_entrada = new FileInputStream("datos\\platos.txt");
				ObjectInputStream leer_datos = new ObjectInputStream(ruta_entrada);
				ObjetoPlato[] datos_leidos = (ObjetoPlato[]) leer_datos.readObject();
				leer_datos.close();
				System.out.println("---Entro---");
				for(ObjetoPlato e : datos_leidos) {
					System.out.println("Nombre: "+e.getNombre()+" Id: "+e.getId()+" Cantidad: "+e.getCantidad()+"Kg Valor: "+e.getValor()+"$");
				}
			}catch (IOException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("No se tiene nada guardado");
		}

	}
}
