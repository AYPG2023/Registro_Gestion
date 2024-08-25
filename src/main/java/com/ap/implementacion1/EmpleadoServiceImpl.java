package com.ap.implementacion1;
import java.util.ArrayList;
import java.util.List;
import com.ap.implementacion.Empleado;
import com.ap.interfaces.Interface;

public class EmpleadoServiceImpl implements Interface {
    private List<Empleado> empleados = new ArrayList<>();

    @Override
    public void registrarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    @Override
    public List<Empleado> listarEmpleados() {
        return empleados;
    }

    @Override
    public void bajarEmpleado(int id) {
        empleados.removeIf(empleado -> empleado.getId() == id);
    }

    @Override
    public double calcularIgss(Empleado empleado) {
        double igss = empleado.getSalarioBase() * 0.0483; // Ejemplo de cálculo de IGSS
        empleado.setIgss(igss);
        return igss;
    }

    @Override
    public double calcularIrtra(Empleado empleado) {
        double irtra = empleado.getSalarioBase() * 0.01; // Ejemplo de cálculo de IRTRA
        empleado.setIrtra(irtra);
        return irtra;
    }

    @Override
    public void agregarBono(Empleado empleado, double bono) {
        empleado.setBonificaciones(empleado.getBonificaciones() + bono);
    }

    @Override
    public void agregarDescuento(Empleado empleado, double descuento) {
        empleado.setDeducciones(empleado.getDeducciones() + descuento);
    }
}
