package com.example.demo.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.Ciudadano;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class CiudadanoRepoImpl implements ICiudadanoRepo{
@Autowired
private EntityManager manager; 
	@Override
	public void agregar(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		this.manager.persist(ciudadano);
	}

	@Override
	public void actualizar(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		this.manager.merge(ciudadano);
	}

	@Override
	public Ciudadano encontrar(Integer id) {
		// TODO Auto-generated method stub
		return this.manager.find(Ciudadano.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Ciudadano ciudadano=this.encontrar(id);
		this.manager.remove(ciudadano);
	}

}
