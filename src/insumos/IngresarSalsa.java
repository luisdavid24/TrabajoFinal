package insumos;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import Logica.alimentos;

public class IngresarSalsa {
	public IngresarSalsa(ArrayList<Salsa> arraySalsa) {
		Salsa[] arregloSalsa = new Salsa[arraySalsa.size()];
		for(int i=0;i<arraySalsa.size();i++) {
			arregloSalsa[i]=arraySalsa.get(i);
		}
		try {
			FileOutputStream ruta_salida = new FileOutputStream("datos\\insumos.txt");
			ObjectOutputStream archivo_salida = new ObjectOutputStream(ruta_salida);
			archivo_salida.writeObject(arregloSalsa);
			archivo_salida.close();
			ruta_salida.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
