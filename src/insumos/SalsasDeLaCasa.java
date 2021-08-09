package insumos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;

import Logica.Verificar;
import Logica.alimentos;
import Logica.ModificarProducto;
import Logica.MostrarProductos;
import Logica.RecuperarInf;
import Logica.IngresarProductos;

public class SalsasDeLaCasa {
	public SalsasDeLaCasa() {}
	
	public float valorSalsa(String listaIngredientes[],float cantidad,ArrayList<alimentos> ListaAlimentos) {
		float valorSalsa=0;
		//listaIngredientes ->ingredientes
		//ListaAlimentos ->inventario
		for(int i=0;i<listaIngredientes.length;i+=2) {
			int identificacion=Integer.parseInt(listaIngredientes[i]);
			for(alimentos e : ListaAlimentos) {
				if(e.getId()==identificacion) {
					float aux=Integer.parseInt(listaIngredientes[i+1]);
					aux*=e.getValor();
					valorSalsa+=aux;
				}
			}
				
		}
		return valorSalsa;
		
	}
	public void agregarSalsa(ArrayList<Salsa> salsaLista,float cantidad,float valor,int id,String nombre) {
		boolean condicion=false;
		for(Salsa e : salsaLista) {
			if(e.getId()==id) {
				condicion=true;
				e.agregandoCantidad(cantidad);
			}
		}
		if(condicion!=true) {
			salsaLista.add(new Salsa(id,cantidad,valor,nombre));
			Salsa[] arregloAlimento = new Salsa[salsaLista.size()];
			for(int i=0;i<salsaLista.size();i++) {
				arregloAlimento[i]=salsaLista.get(i);
			}
			try {
				FileOutputStream ruta_salida = new FileOutputStream("datos\\insumos.txt");
				ObjectOutputStream archivo_salida = new ObjectOutputStream(ruta_salida);
				archivo_salida.writeObject(arregloAlimento);
				archivo_salida.close();
				ruta_salida.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		}
		
				
	}

	
}
