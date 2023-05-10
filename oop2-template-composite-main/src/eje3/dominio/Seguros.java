package eje3.dominio;

import java.util.Objects;

public abstract class Seguros {

	protected String nombre;
	protected Double costo;

	public Seguros(String nombre, Double costo) {
		Objects.requireNonNull(nombre);
		this.nombre = nombre;
		this.costo = costo;
	}

	public abstract Double calcularCosto();

}
