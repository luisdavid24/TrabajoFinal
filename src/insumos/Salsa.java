package insumos;

import java.io.Serializable;

public class Salsa implements Serializable{
	private int id;
	private float cantidad;
	private float valor;
	private String nombre;
	
	public Salsa(int id,float cantidad,float valor,String nombre) {
		this.id=id;
		this.cantidad=cantidad;
		this.valor=valor;
		this.nombre=nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getCantidad() {
		return cantidad;
	}
	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}
	public void agregandoCantidad(float cantidad) {
		this.cantidad += cantidad;
	}
	public void setGastar(float cantidad) {
		this.cantidad -= cantidad;
	}
}
