package eje3.dominio;

import java.util.ArrayList;
import java.util.List;

public class Paquetes extends Seguros {

	private static final Integer DESCUENTO_ACUMULATIVO = 5;
	private List<Seguros> listaSeguros;

	public Paquetes(String nombre) {
		super(nombre, 0.0);
		this.listaSeguros = new ArrayList<Seguros>();
	}

	public void agregarSeguro(Seguros nuevo) {
		this.listaSeguros.add(nuevo);
	}

	@Override
	public Double calcularCosto() {

		for (Seguros unSeguro : listaSeguros) {
			this.costo += this.realizarDescuento(unSeguro.calcularCosto());
		}

		return this.costo;

	}

	private Double realizarDescuento(Double valor) {

		return (((100 - DESCUENTO_ACUMULATIVO) * valor) / 100);
	}

}
