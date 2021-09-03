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
		//listaIngredientes ->ingredientes
		//ListaAlimentos ->inventario
				
		float valorSalsa=0;
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
		boolean condicion=true;
		//Aqui se la salsa existe solo agrego mas cantidad
		// sino entonces creo un objeto de Salsa y lo agrego a salsaLista
		for(Salsa e : salsaLista) {
			if(e.getId()==id) {
				condicion=false;
				e.agregandoCantidad(cantidad);
				
			}
		}
		if(condicion==true) {
			salsaLista.add(new Salsa(id,cantidad,valor,nombre));
			//Aqui lo agrego
		}
		//Aqui paso la informacion del salsaLista al archivo plano.
		//Agregando una salsa nueva o solo haciedo validos los cambios.
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
public void agregarSalsaModificada(ArrayList<Salsa> salsaModificada) {
				
		
		Salsa[] arregloAlimento = new Salsa[salsaModificada.size()];
		
		for(int i=0;i<salsaModificada.size();i++) {
			arregloAlimento[i]=salsaModificada.get(i);
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
