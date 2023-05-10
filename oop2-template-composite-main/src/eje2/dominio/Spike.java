package eje2.dominio;

public class Spike extends ItemDeTrabajo {

	private Integer tiempoRequerido;

	public Spike(String nombre, Integer tiempoRequerido) {
		super(nombre);
		this.tiempoRequerido = tiempoRequerido;
	}

	@Override
	public Integer tiempoNecesario() {
		return this.tiempoRequerido;
	}

}
