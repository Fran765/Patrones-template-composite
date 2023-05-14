package eje5.dominio;

public class Importada extends Remera {

	private static final double RECARGO = 3;
	private static final double IMPUESTOS = 5;
	private static final double BONIFICACION = 0;
	private static final double COMERCIO = 25;

	public Importada(double precioUnitario) {
		super(precioUnitario);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double recargo() {
		return (this.precioUnitario * (RECARGO / 100));
	}

	@Override
	protected double impuestos() {
		return (this.precioUnitario * (IMPUESTOS / 100));
	}

	@Override
	protected double bonificacion() {
		return (this.precioUnitario * (BONIFICACION / 100));
	}

	@Override
	protected double porcentajeComercio() {
		return (COMERCIO / 100);
	}

}
