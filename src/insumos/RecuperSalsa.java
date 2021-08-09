package insumos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class RecuperSalsa {
	public RecuperSalsa(ArrayList<Salsa> salsaLista) throws ClassNotFoundException, IOException {
		
		boolean condicion=false;
		try {
			BufferedReader br;
			br = new BufferedReader(new FileReader("datos\\insumos.txt"));
			if (br.readLine() != null) {
				condicion=true;
			}
			br.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}     
		if(condicion==true) {
			try {
				FileInputStream ruta_entrada = new FileInputStream("datos\\insumos.txt");
				ObjectInputStream leer_datos = new ObjectInputStream(ruta_entrada);
				Salsa[] datos_leidos = (Salsa[]) leer_datos.readObject();
				leer_datos.close();
				if(datos_leidos!=null) {
					for(int i=0;i<datos_leidos.length;i++) {
						salsaLista.add(datos_leidos[i]);
					}
				}
			}catch (IOException e) {
				e.printStackTrace();
			}

		}
				
	}
}
