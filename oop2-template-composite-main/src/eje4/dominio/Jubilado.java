package eje4.dominio;

import static java.time.LocalDate.now;
import static java.time.Month.of;

import java.util.Objects;

public class Jubilado extends Calculador {

	private static final double PROMOCION = 0.1;
	private int mesEnPromocion;

	public Jubilado(int mesDePromocion) {
		Objects.requireNonNull(mesDePromocion);
		this.mesEnPromocion = mesDePromocion;
	}

	public double tienePromocion() {

		if (!of(mesEnPromocion).equals(now().getMonth()))
			return PROMOCION;

		return 0;
	}

}
