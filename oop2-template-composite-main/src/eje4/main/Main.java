package eje4.main;

import eje4.dominio.Jubilado;
import eje4.dominio.NoJubilado;

public class Main {

	public static void main(String[] args) {
		
		Jubilado jubilado = new Jubilado(5);
		NoJubilado noJubilado = new NoJubilado(5);
		
		Jubilado jubilado1 = new Jubilado(3);
		NoJubilado noJubilado1 = new NoJubilado(3);
		
		System.out.println(jubilado.calcularPrecio(1000));
		System.out.println(jubilado1.calcularPrecio(1000));
		
		System.out.println(noJubilado.calcularPrecio(1000));
		System.out.println(noJubilado1.calcularPrecio(1000));

	}

}
