package eje4.dominio;

import java.util.Objects;

public abstract class Calculador {

	private LogTransaction log = new LogTransaction();
	protected int mesEnPromocion;

	public Calculador(int mesDePromocion) {
		Objects.requireNonNull(mesDePromocion);
		this.mesEnPromocion = mesDePromocion;
	}

	public double calcularPrecio(double precioProducto) {
		double precioTotal = precioProducto;

		precioTotal += precioProducto * this.tienePromocion();

		log.log(Calculador.class.getName());
		return precioTotal;
	}

	protected abstract double tienePromocion();

}
