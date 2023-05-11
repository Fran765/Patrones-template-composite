package eje4.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import eje4.dominio.Jubilado;
import eje4.dominio.NoJubilado;

class CalculadorTest {

	@Test
	void calculadorTest1() {

		Jubilado jubilado = new Jubilado(5);
		NoJubilado noJubilado = new NoJubilado(5);

		double resultadoJubilado = 1000;
		double resultadoNoJubilado = 1150;

		assertEquals(resultadoJubilado, jubilado.calcularPrecio(1000));
		assertEquals(resultadoNoJubilado, noJubilado.calcularPrecio(1000));

	}

	@Test
	void calculadorTest2() {
		Jubilado jubilado = new Jubilado(3);
		NoJubilado noJubilado = new NoJubilado(3);

		double resultadoJubilado = 1100;
		double resultadoNoJubilado = 1210;

		assertEquals(resultadoJubilado, jubilado.calcularPrecio(1000));
		assertEquals(resultadoNoJubilado, noJubilado.calcularPrecio(1000));
	}
}
