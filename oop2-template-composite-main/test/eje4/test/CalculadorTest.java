package eje4.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import eje4.dominio.Calculador;
import eje4.dominio.Jubilado;
import eje4.dominio.NoJubilado;
import static java.time.LocalDate.now;

class CalculadorTest {

	@Test
	void calculadorJubiladoSinPromocion() {

		Calculador jubilado = new Jubilado(now().getMonth().getValue() -1);

		double resultadoJubilado = 110;

		assertEquals(resultadoJubilado, jubilado.calcularPrecio(100));

	}

	@Test
	void calculadorJubiladoConPromocion() {
		Calculador jubilado = new Jubilado(now().getMonth().getValue());

		double resultadoJubilado = 100;

		assertEquals(resultadoJubilado, jubilado.calcularPrecio(100));
	}

	@Test
	void calculadorNoJubiladoSinPromocion() {
		Calculador noJubilado = new NoJubilado(now().getMonth().getValue() - 1);

		double resultadoNoJubilado = 121;

		assertEquals(resultadoNoJubilado, noJubilado.calcularPrecio(100));
	}

	@Test
	void calculadorNoJubialdoConPromocion() {
		Calculador noJubilado = new NoJubilado(now().getMonth().getValue());

		double resultadoNoJubilado = 115;

		assertEquals(resultadoNoJubilado, noJubilado.calcularPrecio(100));
	}
}
