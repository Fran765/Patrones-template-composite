package eje2.dominio;

import java.util.Objects;

public abstract class ItemDeTrabajo {

	private String nombre;
	protected Integer tiempoTrabajo; 

	public ItemDeTrabajo(String nombre, Integer tiempoRequerido) {
		Objects.requireNonNull(nombre);
		this.nombre = nombre;
		this.tiempoTrabajo = tiempoRequerido;
	}

	public abstract Integer tiempoNecesario();

}
