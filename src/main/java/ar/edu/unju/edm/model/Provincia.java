package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Provincia {
	
	private int codigoDeProvincia;
	private String nombreDeProvincia;
	
	public Provincia() {
		// TODO Auto-generated constructor stub
	}

	public int getCodigoDeProvincia() {
		return codigoDeProvincia;
	}

	public void setCodigoDeProvincia(int codigoDeProvincia) {
		this.codigoDeProvincia = codigoDeProvincia;
	}

	public String getNombreDeProvincia() {
		return nombreDeProvincia;
	}

	public void setNombreDeProvincia(String nombreDeProvincia) {
		this.nombreDeProvincia = nombreDeProvincia;
	}

	
	
}
