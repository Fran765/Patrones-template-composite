package eje3.dominio;

public class Vida extends Seguros {

	public Vida(String nombre, Double costo) {
		super(nombre, costo);
	}

	@Override
	public Double calcularCosto() {
		return this.costo;
	}

}
