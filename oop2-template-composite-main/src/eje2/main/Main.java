package eje2.main;

import eje2.dominio.HistoriaDeUsuario;
import eje2.dominio.Spike;
import eje2.dominio.Tarea;

public class Main {

	public static void main(String[] args) {

		HistoriaDeUsuario historia = new HistoriaDeUsuario("nuevaHistoria");
		Spike spike = new Spike("miSpike", 30);
		Tarea tarea = new Tarea("miTarea", 20);
		Tarea tarea1 = new Tarea("miTarea1", 30);

		historia.agregarItem(spike);
		historia.agregarItem(tarea);
		historia.agregarItem(tarea1);

		System.out.println(historia.tiempoNecesario());

	}

}
