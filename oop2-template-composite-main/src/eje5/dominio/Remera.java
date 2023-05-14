package eje5.dominio;

public abstract class Remera {

	protected double precioUnitario;

	public Remera(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public double calcularPrecioFinal() {

		return (precioUnitario + this.recargo() + this.impuestos() - this.bonificacion() * this.porcentajeComercio());

	}

	protected abstract double recargo();

	protected abstract double impuestos();

	protected abstract double bonificacion();

	protected abstract double porcentajeComercio();

}
