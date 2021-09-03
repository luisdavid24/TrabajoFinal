package factura;

import java.io.Serializable;

public class InicioFactura implements Serializable {
	
	private int idPlato;
	private String nombrePlato;
	private float valorPlato;
	private float iva;
	private float adiciones;
	
	public InicioFactura(int idPlato, String nombrePlato, float valorPlato, float iva) {
	
		this.idPlato = idPlato;
		this.nombrePlato = nombrePlato;
		this.valorPlato = valorPlato;
		this.iva = iva;
		
	}

	public String getNombrePlato() {
		return nombrePlato;
	}

	public void setNombrePlato(String nombrePlato) {
		this.nombrePlato = nombrePlato;
	}

	public float getValorPlato() {
		return valorPlato;
	}

	public void setValorPlato(float valorPlato) {
		this.valorPlato = valorPlato;
	}

	public float getIva() {
		return iva;
	}

	public void setIva(float iva) {
		this.iva = iva;
	}

	public float getAdiciones() {
		return adiciones;
	}

	public void setAdiciones(float adiciones) {
		this.adiciones = adiciones;
	}

	public int getIdPlato() {
		return idPlato;
	}

	public void setIdPlato(int idPlato) {
		this.idPlato = idPlato;
	}
	
	
	
}

