package eje2.dominio;

import java.util.Objects;

public abstract class ItemDeTrabajo {

	private String nombre;

	public ItemDeTrabajo(String nombre) {
		Objects.requireNonNull(nombre);
		this.nombre = nombre;
	}

	public abstract Integer tiempoNecesario();

}
