package eje2.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import eje2.dominio.HistoriaDeUsuario;
import eje2.dominio.Spike;
import eje2.dominio.Tarea;

class ItemDeUsuarioTest {

	@Test
	void itemDeUsuarioTest1() {
		
		HistoriaDeUsuario historia = new HistoriaDeUsuario("nuevaHistoria");
		Spike spike = new Spike("miSpike", 30);
		Tarea tarea = new Tarea("miTarea", 20);
		Tarea tarea1 = new Tarea("miTarea1", 30);

		historia.agregarItem(spike);
		historia.agregarItem(tarea);
		historia.agregarItem(tarea1);
		
		Integer resultado = 80;
		
		assertEquals(resultado, historia.tiempoNecesario());

	}
	
	@Test
	void itemDeUsuarioTest2() {
		
		HistoriaDeUsuario historia = new HistoriaDeUsuario("nuevaHistoria");
		Spike spike = new Spike("miSpike", 30);
		Spike spike1 = new Spike("miSpike1", 40);
		Tarea tarea = new Tarea("miTarea", 20);
		Tarea tarea1 = new Tarea("miTarea1", 30);

		historia.agregarItem(spike);
		historia.agregarItem(tarea);
		historia.agregarItem(spike1);
		historia.agregarItem(tarea1);
		
		Integer resultado = 120;
		
		assertEquals(resultado, historia.tiempoNecesario());
	}

}
