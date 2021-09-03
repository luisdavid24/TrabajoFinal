package platos;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import Logica.ConsumirComida;
import Logica.RecuperarInf;
import Logica.Verificar;
import Logica.alimentos;
import insumos.ConsumirInsumos;
import insumos.RecuperarInsumos;
import insumos.Salsa;

public class GenerarPlato {
	public GenerarPlato() {}
	
	public boolean saberSiPuedeCobrar(String listaIngredientes[],String listaInsumos[]) {
		//ListaAlimentos tiene la informacion del inventario
		ArrayList<alimentos> ListaAlimentos=new ArrayList<alimentos>();
		try {
			new RecuperarInf(ListaAlimentos);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		
		//arrayPlato trae la informacion guardada.
		ArrayList<Salsa> arraySalsa=new ArrayList<Salsa>();
		try {
			new RecuperarInsumos(arraySalsa);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		
		boolean condicion1=true,condicion2=true;
		
		Verificar verificar1=new Verificar();
		//verificar el invitario
		for(int i=0;i<listaInsumos.length;i+=2) {
				int id=Integer.parseInt(listaInsumos[i]);
				float cantidad=Float.parseFloat(listaInsumos[i+1]);
				try {
					condicion1=verificar1.condicion(id,cantidad,ListaAlimentos,condicion1);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
		}
		//verificar insumos
		for(int i=0;i<listaIngredientes.length;i+=3) {
				int id=Integer.parseInt(listaIngredientes[i]);
				float cantidad=Float.parseFloat(listaIngredientes[i+1]);
				float cantidadMinima=Float.parseFloat(listaIngredientes[i+2]);
				for(Salsa e : arraySalsa) {
					if(e.getId()==id) {
						float aux=e.getCantidad()-cantidad;
						if(aux<cantidadMinima) {
							condicion2=false;
						}
					}
				}
		}
		if(condicion1==true && condicion2==true) {
			return true;
		}else {
			return false;
		}	
		
	}
	
	public ArrayList<ObjetoPlato> modificarArrayPlato(String listaIngredientes[],String listaInsumos[],ArrayList<ObjetoPlato> ListaPlato,int idPlato,int cantidadGenerada,String nombre) {
		ArrayList<alimentos> ListaAlimentos=new ArrayList<alimentos>();
		try {
			new RecuperarInf(ListaAlimentos);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		//arrayPlato trae la informacion guardada.
		ArrayList<Salsa> arraySalsa=new ArrayList<Salsa>();
		try {
			new RecuperarInsumos(arraySalsa);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		
		//consumir las salsa
		for(int i=0;i<listaInsumos.length;i+=2) {
			int identificacion=Integer.parseInt(listaInsumos[i]);
			float cantidadGastada=Float.parseFloat(listaInsumos[i+1]);
			new ConsumirComida(identificacion,cantidadGastada,ListaAlimentos);
		}
		
		//consumir los insumos
		for(int i=0;i<listaIngredientes.length;i+=3) {
			int id=Integer.parseInt(listaIngredientes[i]);
			float cantidad=Float.parseFloat(listaIngredientes[i+1]);
			float cantidadMinima=Float.parseFloat(listaIngredientes[i+2]);
			new ConsumirInsumos(id,cantidad,cantidadMinima,arraySalsa);
		}
		int valorPlato=999;
		boolean condicion3=true;
			//Aqui se genera un objeto o se modifica el que ya existe
			for(ObjetoPlato e : ListaPlato) {
				if(e.getId()==idPlato) {
					condicion3=false;
					e.agregandoCantidad(cantidadGenerada);
					
				}
			}
			if(condicion3==true) {
				ListaPlato.add(new ObjetoPlato(idPlato,nombre,cantidadGenerada,valorPlato));
			}
		
		return ListaPlato;
	}
	public String[] llenarArrayIngrediente(String[]  arrayInsumos,String listaInsumos[]){
		int insumosTamano=arrayInsumos.length;
		int listaTamano=listaInsumos.length;
		int contador=0;
		String[] aux;
		for(int i=0;i<insumosTamano;i+=2) {
			int id=Integer.parseInt(arrayInsumos[i]);
			for(int j=0;j<listaTamano;j+=2) {
				int id2=Integer.parseInt(listaInsumos[j]);
				if(id==id2) {
					contador++;
				}
			}
		}
		int nuevotamano=insumosTamano+(listaTamano/2)-contador+1;
		aux =new String[nuevotamano];
		int l=0;
		for(int i=0;i<insumosTamano;i++) {
			aux[i]=arrayInsumos[i];
			l++;
		}
		
		for(int i=0;i<listaInsumos.length;i+=2) {
			boolean encontrado=false;
			
			for(int j=0;j<insumosTamano;j+=2) {
				int id=Integer.parseInt(listaInsumos[i]);
				int id2=Integer.parseInt(arrayInsumos[j]);
				if(id==id2) {
					encontrado=true;
				}
				
			}
			if(encontrado!=true) {
				aux[l]=listaInsumos[i];
				l++;
			}
		}
		arrayInsumos=aux;
		return arrayInsumos;
	}
	
	public String[] llenarArrayIngredientes(String[]  arrayIngredientes,String listaIngredientes[]){
		int arrayTamano=arrayIngredientes.length;
		int listaTamano=listaIngredientes.length;
		int contador=0;
		String[] aux;
		
		for(int i=0;i<arrayTamano;i+=2) {
			int id=Integer.parseInt(arrayIngredientes[i]);
			for(int j=0;j<listaTamano;j+=3) {
				int id2=Integer.parseInt(listaIngredientes[j]);
				if(id==id2) {
					contador++;
				}
			}
		}
		
		int nuevotamano=arrayTamano+(listaTamano/3)-contador;
		aux =new String[nuevotamano];
		int l=0;
		for(int i=0;i<arrayIngredientes.length;i++) {
			aux[i]=arrayIngredientes[i];
			l++;
		}
		for(int i=0;i<listaIngredientes.length;i+=3) {
			boolean encontrado=false;
			
			for(int j=0;j<arrayIngredientes.length;j+=2) {
				int id=Integer.parseInt(listaIngredientes[i]);
				int id2=Integer.parseInt(arrayIngredientes[j]);
				if(id==id2) {
					encontrado=true;
				}
				
			}
			if(encontrado!=true) {
				aux[l]=listaIngredientes[i];
				l++;
			}
		}
		arrayIngredientes=aux;
		
		
		return arrayIngredientes;
	}
}
