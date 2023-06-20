package com.example.demo.service;

import com.example.demo.repo.modelo.Empleado;

public interface IEmpleadoService {

	
	public void insertar(Empleado empleado);
	public void actualizar(Empleado empleado);
	public void borrar(Integer id);
	public Empleado buscar(Integer id);
	
}
