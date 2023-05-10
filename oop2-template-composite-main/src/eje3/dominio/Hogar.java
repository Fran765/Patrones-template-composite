package eje3.dominio;

public class Hogar extends Seguros {

	public Hogar(String nombre, Double costo) {
		super(nombre, costo);
	}

	@Override
	public Double calcularCosto() {
		return this.costo;
	}

}
