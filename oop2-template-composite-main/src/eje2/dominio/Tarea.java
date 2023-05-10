package eje2.dominio;

public class Tarea extends ItemDeTrabajo {

	private Integer tiempoRequerido;

	public Tarea(String nombre, Integer tiempoRequerido) {
		super(nombre);
		this.tiempoRequerido = tiempoRequerido;
	}

	@Override
	public Integer tiempoNecesario() {
		return this.tiempoRequerido;
	}
}
