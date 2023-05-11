package eje4.dominio;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public class Jubilado extends Calculador {

	private static final double PROMOCION = 0.1;
	private int mesEnPromocion;

	public double tienePromocion() {

		if (!of(mesEnPromocion).equals(now().getMonth()))
			return PROMOCION;

		return 1.0;
	}

}
