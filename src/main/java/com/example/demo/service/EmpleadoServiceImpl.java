package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.IEmpleadoRepo;
import com.example.demo.repo.modelo.Empleado;

@Service

public class EmpleadoServiceImpl implements IEmpleadoService{
@Autowired
private IEmpleadoRepo empleadoRepo;
	@Override
	public void insertar(Empleado empleado) {
		// TODO Auto-generated method stub
		this.empleadoRepo.agregar(empleado);
	}

	@Override
	public void actualizar(Empleado empleado) {
		// TODO Auto-generated method stub
		this.empleadoRepo.actualizar(empleado);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.empleadoRepo.eliminar(id);
	}

	@Override
	public Empleado buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.empleadoRepo.encontrar(id);
	}

}
