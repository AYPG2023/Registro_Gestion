package com.ap.implementacion;

import java.time.LocalDate;


public class Empleado {
    private int id;
    private String nombre;
    private String puestoTrabajo;
    private double salarioBase;
    private LocalDate fechaIngreso;
    private String departamento;
    private double igss;
    private double irtra;
    private double deducciones;
    private double bonificaciones;
    
    public Empleado(int id, String nombre, String puestoTrabajo, double salarioBase, LocalDate fechaIngreso, String departamento) {
        this.id = id;
        this.nombre = nombre;
        this.puestoTrabajo = puestoTrabajo;
        this.salarioBase = salarioBase;
        this.fechaIngreso = fechaIngreso;
        this.departamento = departamento;
        this.igss = 0;
        this.irtra = 0;
        this.deducciones = 0;
        this.bonificaciones = 0;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPuestoTrabajo() {
		return puestoTrabajo;
	}

	public void setPuestoTrabajo(String puestoTrabajo) {
		this.puestoTrabajo = puestoTrabajo;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getIgss() {
		return igss;
	}

	public void setIgss(double igss) {
		this.igss = igss;
	}

	public double getIrtra() {
		return irtra;
	}

	public void setIrtra(double irtra) {
		this.irtra = irtra;
	}

	public double getDeducciones() {
		return deducciones;
	}

	public void setDeducciones(double deducciones) {
		this.deducciones = deducciones;
	}

	public double getBonificaciones() {
		return bonificaciones;
	}

	public void setBonificaciones(double bonificaciones) {
		this.bonificaciones = bonificaciones;
	}
    
}