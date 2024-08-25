package com.ap.interfaces;

import java.util.List;
import com.ap.implementacion.Empleado;


public interface Interface {
	void registrarEmpleado(Empleado empleado);

	List<Empleado> listarEmpleados();

	void bajarEmpleado(int id);

	double calcularIgss(Empleado empleado);

	double calcularIrtra(Empleado empleado);

	void agregarBono(Empleado empleado, double bono);

	void agregarDescuento(Empleado empleado, double descuento);
}
