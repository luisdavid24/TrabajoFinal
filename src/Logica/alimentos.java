package Logica;

import java.io.Serializable;

public class alimentos implements Serializable{
	private int id;
	private String nombre;
	private float cantidad;
	private float valor;
	private float verificarCantidad;
	
	
	public alimentos(int id,String nombre,float cantidad,float valor,float verificarCantidad) {
		this.id=id;
		this.nombre=nombre;
		this.cantidad=cantidad;
		this.valor=valor;
		this.verificarCantidad=verificarCantidad;
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
	public void setRestar(float cantidad) {
		this.cantidad -= cantidad;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor += valor;
	}
	public float getVerificarCantidad() {
		return verificarCantidad;
	}
	public void setVerificarCantidad(float verificarCantidad) {
		this.verificarCantidad = verificarCantidad;
	}
}
