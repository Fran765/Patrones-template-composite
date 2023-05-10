package eje1.dominio;

public class EmpleadoSinGente extends Empleado{

	public EmpleadoSinGente(int salario) {
		super(salario);
	}

	@Override
	public int montoTotalSalarial() {
		return this.salario;
	}

}
