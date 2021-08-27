package platos;

import java.io.Serializable;

public class ObjetoPlato implements Serializable{
	private int id;
	private String nombre;
	private float cantidad;
	private float valor;
	
	public ObjetoPlato(int id,String nombre,float cantidad,float valor) {
		this.id=id;
		this.nombre=nombre;
		this.cantidad=cantidad;
		this.valor=valor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getCantidad() {
		return cantidad;
	}
	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public void agregandoCantidad(float valor) {
		this.valor += valor;
	}
	
}
