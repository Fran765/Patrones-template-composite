package eje5.dominio;

public class Nacional extends Remera {

	private static final double RECARGO = 1.5;
	private static final double IMPUESTOS = 0;
	private static final double BONIFICACION = 20;
	private static final double COMERCIO = 15;

	public Nacional(double precioUnitario) {
		super(precioUnitario);
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
