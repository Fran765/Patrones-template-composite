package eje2.dominio;

public class Tarea extends ItemDeTrabajo {

	public Tarea(String nombre, Integer tiempoRequerido) {
		super(nombre, tiempoRequerido);
	}

	@Override
	public Integer tiempoNecesario() {
		return this.tiempoTrabajo;
	}
}
