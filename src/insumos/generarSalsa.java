package insumos;

import java.io.IOException;
import java.util.ArrayList;

import Logica.ConsumirComida;
import Logica.RecuperarInf;
import Logica.Verificar;
import Logica.alimentos;

public class generarSalsa {
	public generarSalsa(String listaIngredientes[],float cantidadSalsa,int idSalsa,String nombreSalsa) {
		//ListaAlimentos tiene la informacion del inventario
		ArrayList<alimentos> ListaAlimentos=new ArrayList<alimentos>();
		try {
			try {
				//Aqui secupero la informacion del archivo plano, para ponerla en ListaAlimentos
				new RecuperarInf(ListaAlimentos);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		boolean  condicion=true;
		
		//Aqui verifico si puedo hacer la operacion
		for(int i=0;i<listaIngredientes.length;i+=2) {
			int id=Integer.parseInt(listaIngredientes[i]);
			float cantidad=Float.parseFloat(listaIngredientes[i+1]);
			Verificar objeto=new Verificar();
			 try {
				 //Aqui se retorno condicion que puede seguir siendo true, pero si no se puede
				 //hacer la operacion cambia a false 
				condicion=objeto.condicion(id,cantidad,ListaAlimentos,condicion);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			
		}
		if(condicion==true) {
			//Aqui me gasto lo realmente necesito para hacer la salsa
			float valor=0;//Valor me da lo cuesta hacer esa salsa
			SalsasDeLaCasa salsa1 =new SalsasDeLaCasa();
			
			for(int i=0;i<listaIngredientes.length;i+=2) {
				int id=Integer.parseInt(listaIngredientes[i]);
				float cantidad=Float.parseFloat(listaIngredientes[i+1]);
				//Aqui consumo el invertio con ConsumirComida
				//Con valor obtene el valor que tiene la salsa 
				new ConsumirComida(id,cantidad,ListaAlimentos);
				valor+=salsa1.valorSalsa(listaIngredientes,cantidad, ListaAlimentos);
			}
			ArrayList<Salsa> insumosArrayList=new ArrayList<Salsa>();
			try {
				new RecuperSalsa(insumosArrayList);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			salsa1.agregarSalsa(insumosArrayList,cantidadSalsa, valor, idSalsa, nombreSalsa);
			//en salsa1.agregarSalsa agrego la nueva salsa o simplemente agrego mas cantidad
		}
		
	}
}
