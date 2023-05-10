package eje1.dominio;

import java.util.ArrayList;
import java.util.List;

public class EempleadoConGente extends Empleado {

	private List<Empleado> empleadosACargo;

	public EempleadoConGente(int salario) {
		super(salario);
		this.empleadosACargo = new ArrayList<>();
	}

	public void agregarPersonal(Empleado nuevo) {
		this.empleadosACargo.add(nuevo);
	}

	@Override
	public int montoTotalSalarial() {
		int monto = this.salario;
		for (Empleado unEmpleado : empleadosACargo) {
			monto += unEmpleado.montoTotalSalarial();
		}
		return monto;
	}

}
