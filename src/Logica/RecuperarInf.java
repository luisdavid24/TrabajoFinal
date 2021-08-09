package Logica;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class RecuperarInf {
	public RecuperarInf(ArrayList<alimentos> alimentosIntroduccido) throws ClassNotFoundException, IOException{
		boolean condicion=false;
		try {
			BufferedReader br;
			br = new BufferedReader(new FileReader("datos\\informacion.txt"));
			if (br.readLine() != null) {
				condicion=true;
			}
			br.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}     
		if(condicion==true) {
			try {
				FileInputStream ruta_entrada = new FileInputStream("datos\\informacion.txt");
				ObjectInputStream leer_datos = new ObjectInputStream(ruta_entrada);
				alimentos[] datos_leidos = (alimentos[]) leer_datos.readObject();
				leer_datos.close();
				if(datos_leidos!=null) {
					for(int i=0;i<datos_leidos.length;i++) {
						alimentosIntroduccido.add(datos_leidos[i]);
					}
				}
			}catch (IOException e) {
				e.printStackTrace();
			}

		}
				
	}

}
