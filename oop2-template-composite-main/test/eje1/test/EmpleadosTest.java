package eje1.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import eje1.dominio.EempleadoConGente;
import eje1.dominio.EmpleadoSinGente;

class EmpleadosTest {

	@Test
	void empleadosTest1() {

		EempleadoConGente empresaLaserX = new EempleadoConGente(0);

		EempleadoConGente director = new EempleadoConGente(100);
		EempleadoConGente gerente = new EempleadoConGente(80);
		EempleadoConGente mandoMedio = new EempleadoConGente(60);
		EempleadoConGente liderProyecto = new EempleadoConGente(40);
		EmpleadoSinGente empleadoRegular = new EmpleadoSinGente(20);

		director.agregarPersonal(gerente);
		gerente.agregarPersonal(mandoMedio);
		mandoMedio.agregarPersonal(liderProyecto);
		liderProyecto.agregarPersonal(empleadoRegular);

		empresaLaserX.agregarPersonal(director);
		
		assertEquals(300, empresaLaserX.montoTotalSalarial());
	}
	
	@Test
	void empleadosTest2() {

		EempleadoConGente empresaLaserX = new EempleadoConGente(0);

		EempleadoConGente director = new EempleadoConGente(100);
		EempleadoConGente gerente = new EempleadoConGente(80);
		EempleadoConGente gerente1 = new EempleadoConGente(80);
		EempleadoConGente mandoMedio = new EempleadoConGente(60);
		EempleadoConGente mandoMedio1 = new EempleadoConGente(60);
		EempleadoConGente liderProyecto = new EempleadoConGente(40);
		EempleadoConGente liderProyecto1 = new EempleadoConGente(40);
		EmpleadoSinGente empleadoRegular = new EmpleadoSinGente(20);
		EmpleadoSinGente empleadoRegular1 = new EmpleadoSinGente(20);

		empresaLaserX.agregarPersonal(director);
		
		director.agregarPersonal(gerente);
		gerente.agregarPersonal(mandoMedio);
		mandoMedio.agregarPersonal(liderProyecto);
		liderProyecto.agregarPersonal(empleadoRegular);
		
		director.agregarPersonal(gerente1);
		gerente.agregarPersonal(mandoMedio1);
		mandoMedio.agregarPersonal(liderProyecto1);
		liderProyecto.agregarPersonal(empleadoRegular1);
		

	
		
		assertEquals(500, empresaLaserX.montoTotalSalarial());
	}

}
