package eje4.dominio;

public abstract class Calculador {

//	private LogTransaction log;

	public double calcularPrecio(double precioProducto) {
		double precioTotal = precioProducto;

		precioTotal += precioProducto * this.tienePromocion();

//		log.log(Calculador.class.getName());
		return precioTotal;
	}

	public abstract double tienePromocion();

}
