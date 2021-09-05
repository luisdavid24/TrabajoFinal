package factura;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import Logica.*;
import insumos.*;

public class ValorDelPlato {
public ValorDelPlato() {}
	
	
	public float valorPlato(int idPlato) {
		ArrayList<Salsa> listaSalsas=new ArrayList<Salsa>();
		ArrayList<alimentos> ListaAlimentos=new ArrayList<alimentos>();
		float valortotal = 0;
		float otrosGastos = 8000;
		float valorInsumo = 0;
		//
		//int idplatoEscogido = 0;
		float cantIns1=0, cantIns2=0, cantIns3=0, cantInv1=0, cantInv2=0, cantInv3=0;
		float valorins1=0, valorins2=0, valorins3=0, valorinv1=0, valorinv2=0, valorinv3=0;
		int idInsu1 =0, idInsu2=0, idInsu3=0, idInve1=0, idInve2=0, idInve3=0;
		
		
		if(idPlato ==1) { // este plato es tacos mexicanos(insumos(frijol refrito, guacamole) - inventario(queso, tacos))
			idInsu1 =5;
			cantIns1=500; // cantidad en gramos de frijol refrito en insumos
			//valorins1=3000; // valor de insumos frijol refrito
			idInsu2=6;
			cantIns2 = 200;	   //cantidad en gramos de guacamole en insumos	
			//valorins2=2000; // valor de insumo guacamole
			idInsu3 =7;
			cantIns3 = 0;// no tiene insumos en esta posicion
			//valorins3=0;
			
			idInve1=6;
			cantInv1 =200;    //cantidad en gramos en inventario de queso
			//valorinv1=3000; // valor inventario de queso
			idInve2=7;
			cantInv2 =400;   // cantidad en gramos en inventario de tacos
			//valorinv2=3000; // valor inventario de taco
			idInve3=8;
			cantInv3 =0;      // no tiene elemento del inventario en esta posicion
			//valorinv3=0;
						
		}
		
		//-----------------------------------------------------------------------------------------------
		
		
		if(idPlato ==2) { // este plato es Quesadillas(insumos(tortillas,pollo desmechado, guacamole) - inventario(queso, cebolla, pimenton))
			idInsu1 =8;
			cantIns1=500; // cantidad en gramos de tortillas en insumos
			//valorins1=3000; // 
			idInsu2=6;
			cantIns2 = 200;	   //cantidad en gramos de guacamole en insumos	
			//valorins2=2000; // valor de insumo guacamole
			idInsu3 =9;
			cantIns3 = 400;     //cantidad en gramos de pollo desmechado en insumos
			//valorins3=0;
			
			idInve1=6;
			cantInv1 =300;    //cantidad en gramos en inventario de queso
			//valorinv1=3000; // valor inventario de queso
			idInve2=4;
			cantInv2 =150;   // cantidad en gramos en inventario de cebolla
			//valorinv2=3000; // valor inventario de taco
			idInve3=3;
			cantInv3 =150;      // cantidad en gramos en inventario de pimenton
			//valorinv3=0;
						
		}
		
		
		try {
			
			//aca manipulo el archivo plano del inventario inicial
			FileInputStream ruta_entrada = new FileInputStream("datos\\informacion.txt");
			ObjectInputStream leer_datos = new ObjectInputStream(ruta_entrada);
			alimentos[] datos_leidos_alimentos = (alimentos[]) leer_datos.readObject();
			leer_datos.close();
			
			// aca manipulo el archivo plano de insumos
			FileInputStream ruta_entrada1 = new FileInputStream("datos\\insumos.txt");
			ObjectInputStream leer_datos1 = new ObjectInputStream(ruta_entrada1);
			Salsa[] datos_leidos_insumos = (Salsa[]) leer_datos1.readObject();
			leer_datos.close();
			
						////////////////////////////////////////////////
						//se modifica el valor de cada elemento del archivo plano de insumo
			
						for(int j=0;j<datos_leidos_insumos.length;j++) {
								
								if( datos_leidos_insumos[j].getId()==idInsu1) {		
									
									valorins1 = (datos_leidos_insumos[j].getValor()*cantIns1)/datos_leidos_insumos[j].getCantidad();
									valorInsumo = datos_leidos_insumos[j].getValor() - valorins1;	
									
									}
								
								if( datos_leidos_insumos[j].getId()==idInsu2) {		
									
									valorins2 = (datos_leidos_insumos[j].getValor()*cantIns2)/datos_leidos_insumos[j].getCantidad();
									valorInsumo = datos_leidos_insumos[j].getValor() - valorins2;	
									}
								
								if( datos_leidos_insumos[j].getId()==idInsu3) {	
									
									valorins2 = (datos_leidos_insumos[j].getValor()*cantIns3)/datos_leidos_insumos[j].getCantidad();
									valorInsumo = datos_leidos_insumos[j].getValor() - valorins3;	
									}
								
										 int id = datos_leidos_insumos[j].getId();						
										 String nombre = datos_leidos_insumos[j].getNombre();
										 float cantidad = datos_leidos_insumos[j].getCantidad();
										 	  
										 datos_leidos_insumos[j].setCantidad(cantidad);
										 datos_leidos_insumos[j].setId(id);
										 datos_leidos_insumos[j].setNombre(nombre);
										 datos_leidos_insumos[j].setValor(valorInsumo);
								}
										for(int j=0;j<datos_leidos_insumos.length;j++) {
											
											listaSalsas.add(datos_leidos_insumos[j]);						
											
										}
										
										SalsasDeLaCasa salsa =new SalsasDeLaCasa();
										
										salsa.agregarSalsaModificada(listaSalsas);
						
						/////////////////////////////////////////////////////////////////////
						
							//se modifica el valor de cada elemento del archivo plano del inventario inicial
										
							for(int j=0;j<datos_leidos_alimentos.length;j++) {
								
								if( datos_leidos_alimentos[j].getId()==idInve1) {	
									
									//valorins2 = (datos_leidos_insumos[j].getValor()*0)/datos_leidos_insumos[j].getCantidad();
									valorinv1 = (datos_leidos_alimentos[j].getValor()*cantInv1)/datos_leidos_alimentos[j].getCantidad();
									valorInsumo = datos_leidos_alimentos[j].getValor() - valorinv1;	
									}
								
								if( datos_leidos_alimentos[j].getId()==idInve2) {	
									valorinv2 = (datos_leidos_alimentos[j].getValor()*cantInv2)/datos_leidos_alimentos[j].getCantidad();
									valorInsumo = datos_leidos_alimentos[j].getValor() - valorinv2;	
									}
								
								if( datos_leidos_alimentos[j].getId()==idInve3) {	
									valorinv3 = (datos_leidos_alimentos[j].getValor()*cantInv3)/datos_leidos_alimentos[j].getCantidad();
									valorInsumo = datos_leidos_alimentos[j].getValor() - valorinv3   ;	
									}
								
								
									 int id = datos_leidos_alimentos[j].getId();						
									 String nombre = datos_leidos_alimentos[j].getNombre();
									 float cantidad = datos_leidos_alimentos[j].getCantidad();
									 float verificar = datos_leidos_alimentos[j].getVerificarCantidad();
									 	  
									 datos_leidos_alimentos[j].setCantidad(cantidad);
									 datos_leidos_alimentos[j].setId(id);
									 datos_leidos_alimentos[j].setNombre(nombre);
									 datos_leidos_alimentos[j].setValor(valorInsumo);
									 datos_leidos_alimentos[j].setVerificarCantidad(verificar);
									}
							
										for(int j=0;j<datos_leidos_alimentos.length;j++) {
											ListaAlimentos.add(datos_leidos_alimentos[j]);
										}
										new IngresarProductos(ListaAlimentos);	
										
											
										
						////////////////////////////////////////////////////////////////////				
										
						//SE CALCULA EL VALOR DEL PRIMER PLATO	
						
						float sumaingredientes = valorins1 + valorins2 + valorins3 + valorinv1 + valorinv2 + valorinv3;
										
						valortotal= sumaingredientes+(sumaingredientes*0.3f)+otrosGastos;
						
					
			
		}catch (IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e2) {
			System.out.println(e2);
			}
		
		return valortotal;
	}

}
