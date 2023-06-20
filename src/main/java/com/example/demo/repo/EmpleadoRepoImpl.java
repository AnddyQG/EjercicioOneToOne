package com.example.demo.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.Empleado;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class EmpleadoRepoImpl implements IEmpleadoRepo{
@Autowired
private EntityManager manager;
	@Override
	public void agregar(Empleado empleado) {
		// TODO Auto-generated method stub
		this.manager.persist(empleado);
	}

	@Override
	public void actualizar(Empleado empleado) {
		// TODO Auto-generated method stub
		this.manager.merge(empleado);
	}

	

	
	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Empleado empleado= this.encontrar(id);
		this.manager.remove(empleado);
	}

	@Override
	public Empleado encontrar(Integer id) {
		// TODO Auto-generated method stub
		return this.manager.find(Empleado.class, id);
	}

}
