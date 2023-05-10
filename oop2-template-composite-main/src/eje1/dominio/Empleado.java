package eje1.dominio;

import java.util.Objects;

public abstract class Empleado {

	protected int salario;

	public Empleado(int salario) {
		Objects.requireNonNull(salario);
		this.salario = salario;
	}

	public abstract int montoTotalSalarial();


}
