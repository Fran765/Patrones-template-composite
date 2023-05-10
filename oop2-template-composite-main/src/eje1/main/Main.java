package eje1.main;

import eje1.dominio.EempleadoConGente;
import eje1.dominio.EmpleadoSinGente;

public class Main {

	public static void main(String[] args) {
		
		
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
		
		System.out.println(empresaLaserX.montoTotalSalarial());
	}

}
