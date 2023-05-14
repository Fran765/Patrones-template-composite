package eje5.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import eje5.dominio.Importada;
import eje5.dominio.Nacional;
import eje5.dominio.Remera;

class RemerasTest {

	@Test
	void remeraImportada() {
		
		Remera nuevaImportacion = new Importada(7000);
		
		double resultado = 7560;
				
		assertEquals(resultado, nuevaImportacion.calcularPrecioFinal());

	}

	@Test
	void remeraNacional() {
		
		Remera nuevaNacional = new Nacional(5000);
		
		double resultado = 4925;
				
		assertEquals(resultado, nuevaNacional.calcularPrecioFinal());
	}

}
