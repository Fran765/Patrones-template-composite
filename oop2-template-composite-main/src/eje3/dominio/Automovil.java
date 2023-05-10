package eje3.dominio;

public class Automovil extends Seguros {

	public Automovil(String nombre, Double costo) {
		super(nombre, costo);
	}

	@Override
	public Double calcularCosto() {
		return this.costo;
	}

}
