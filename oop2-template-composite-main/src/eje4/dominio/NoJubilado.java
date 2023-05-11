package eje4.dominio;

import static java.time.LocalDate.now;
import static java.time.Month.of;

import java.util.Objects;

public class NoJubilado extends Calculador {

	private static final double PROMOCION = 0.15;
	private static final double SIN_PROMOCION = 0.21;
	private int mesEnPromocion;

	public NoJubilado(int mesDePromocion) {
		Objects.requireNonNull(mesDePromocion);
		this.mesEnPromocion = mesDePromocion;
	}

	public double tienePromocion() {

		if (of(mesEnPromocion).equals(now().getMonth()))
			return PROMOCION;

		return SIN_PROMOCION;
	}
}
