package com.example.demo.repo;

import com.example.demo.repo.modelo.Empleado;

public interface IEmpleadoRepo {

	
	public void agregar(Empleado empleado);
	public void actualizar(Empleado empleado);
	public void eliminar(Integer id);
	public Empleado encontrar(Integer id);
	
}
