package eje4.dominio;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public class Jubilado extends Calculador {

	private static final double PROMOCION = 0.1;

	public Jubilado(int mesDePromocion) {
		super(mesDePromocion);
	}

	protected double tienePromocion() {

		if (!of(mesEnPromocion).equals(now().getMonth()))
			return PROMOCION;

		return 0;
	}

}
