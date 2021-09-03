package Logica;

import java.io.IOException;
import java.io.RandomAccessFile;

public class BasicosEnInventario {
	private int idProducto;
	private String NomProducto;
	
	public BasicosEnInventario(int idProducto, String nomProducto) {
		
		this.idProducto = idProducto;
		this.NomProducto = nomProducto;
		
		try  
		{ 	
			RandomAccessFile archivo = new  RandomAccessFile("datos\\DatosBasicos.txt","rw"); 
			archivo.seek(archivo.length()); 
			archivo.writeInt(idProducto); 
			archivo.writeUTF(NomProducto);
			archivo.close(); 
		}catch(IOException e) {System.out.print(e);} 
	
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getNomProducto() {
		return NomProducto;
	}

	public void setNomProducto(String nomProducto) {
		NomProducto = nomProducto;
	}

}
