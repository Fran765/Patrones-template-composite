package eje2.dominio;

public class Spike extends ItemDeTrabajo {

	public Spike(String nombre, Integer tiempoRequerido) {
		super(nombre, tiempoRequerido);
	}

	@Override
	public Integer tiempoNecesario() {
		return this.tiempoTrabajo;
	}

}
