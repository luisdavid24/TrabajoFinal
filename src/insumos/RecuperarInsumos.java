package insumos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import Logica.alimentos;
import platos.ObjetoPlato;

public class RecuperarInsumos {
	public RecuperarInsumos(ArrayList<Salsa> arraySalsa) throws IOException, ClassNotFoundException {
		boolean condicion=false;
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("datos\\insumos.txt"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if (br.readLine() != null) {
			condicion=true;
		}
		br.close();
		     
		if(condicion==true) {
			try {
				FileInputStream ruta_entrada = new FileInputStream("datos\\insumos.txt");
				ObjectInputStream leer_datos = new ObjectInputStream(ruta_entrada);
				Salsa[] datos_leidos = (Salsa[]) leer_datos.readObject();
				leer_datos.close();
				if(datos_leidos!=null) {
					for(int i=0;i<datos_leidos.length;i++) {
						arraySalsa.add(datos_leidos[i]);
					}
				}
			}catch (IOException e) {
				e.printStackTrace();
			}

		}

	}
}
