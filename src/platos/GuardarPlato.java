package platos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import Logica.alimentos;
import insumos.Salsa;

public class GuardarPlato {
	
	public GuardarPlato(ArrayList<ObjetoPlato> arrayPlato) throws ClassNotFoundException, IOException {
		ArrayList<ObjetoPlato> arrayPlatoPlano=new ArrayList<ObjetoPlato>();
		
		boolean condicion=false;
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("datos\\platos.txt"));
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
				FileInputStream ruta_entrada = new FileInputStream("datos\\platos.txt");
				ObjectInputStream leer_datos = new ObjectInputStream(ruta_entrada);
				ObjetoPlato[] datos_leidos = (ObjetoPlato[]) leer_datos.readObject();
				leer_datos.close();
				if(datos_leidos!=null) {
					for(int i=0;i<datos_leidos.length;i++) {
						arrayPlatoPlano.add(datos_leidos[i]);
					}
				}
								
			}catch (IOException e) {
				e.printStackTrace();
			}

		}	
		arrayPlatoPlano.addAll(arrayPlato);
		//en esta seccion estoy escribiendo la informacion en el archivo plano
		ObjetoPlato[] arregloPlato = new ObjetoPlato[arrayPlatoPlano.size()];
		for(int i=0;i<arrayPlatoPlano.size();i++) {
			arregloPlato[i]=arrayPlatoPlano.get(i);
		}
		try {
			FileOutputStream ruta_salida = new FileOutputStream("datos\\platos.txt");
			ObjectOutputStream archivo_salida = new ObjectOutputStream(ruta_salida);
			archivo_salida.writeObject(arregloPlato);
			archivo_salida.close();
			ruta_salida.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
