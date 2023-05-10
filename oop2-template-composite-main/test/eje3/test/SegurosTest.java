package eje3.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import eje3.dominio.Automovil;
import eje3.dominio.Hogar;
import eje3.dominio.Medicos;
import eje3.dominio.Paquetes;
import eje3.dominio.Vida;

class SegurosTest {

	@Test
	void segurosTest1() {

		Paquetes paquete1 = new Paquetes("paquete1");
		Paquetes paquete2 = new Paquetes("paquete2");

		Hogar hogar = new Hogar("casa", 100.0);
		Medicos medico = new Medicos("dentista", 200.0);
		Automovil auto = new Automovil("moto", 300.0);
		Vida vida = new Vida("vida", 400.0);

		Hogar hogar1 = new Hogar("departamento", 100.0);
		Medicos medico1 = new Medicos("traumatologo", 200.0);
		Automovil auto1 = new Automovil("auto", 300.0);
		Vida vida1 = new Vida("vida", 400.0);

		paquete1.agregarSeguro(hogar);
		paquete1.agregarSeguro(medico);
		paquete1.agregarSeguro(auto);
		paquete1.agregarSeguro(vida);
		paquete1.agregarSeguro(paquete2);

		paquete2.agregarSeguro(hogar1);
		paquete2.agregarSeguro(medico1);
		paquete2.agregarSeguro(auto1);
		paquete2.agregarSeguro(vida1);

		Double resultado = 902.5 + 950.0;

		assertEquals(resultado, paquete1.calcularCosto());
	}

	@Test
	void segurosTest2() {

		Paquetes paquete1 = new Paquetes("paquete1");

		Hogar hogar = new Hogar("casa", 100.0);
		Medicos medico = new Medicos("dentista", 200.0);
		Automovil auto = new Automovil("moto", 300.0);
		Vida vida = new Vida("vida", 400.0);

		paquete1.agregarSeguro(hogar);
		paquete1.agregarSeguro(medico);
		paquete1.agregarSeguro(auto);
		paquete1.agregarSeguro(vida);

		Double resultado = 95.0 + 190.0 + 285.0 + 380.0;

		assertEquals(resultado, paquete1.calcularCosto());
	}

}
