package eje3.dominio;

public class Medicos extends Seguros {

	public Medicos(String nombre, Double costo) {
		super(nombre, costo);
	}

	@Override
	public Double calcularCosto() {
		return this.costo;
	}

}
