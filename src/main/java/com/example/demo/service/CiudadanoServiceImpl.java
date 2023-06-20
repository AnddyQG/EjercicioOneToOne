package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.ICiudadanoRepo;
import com.example.demo.repo.modelo.Ciudadano;
@Service
public class CiudadanoServiceImpl implements ICiudadanoService{
@Autowired
private ICiudadanoRepo ciudadanoRepo;
	@Override
	public void insertar(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		this.ciudadanoRepo.agregar(ciudadano);
	}

	@Override
	public void actualizar(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		this.ciudadanoRepo.actualizar(ciudadano);
	}

	@Override
	public Ciudadano buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.ciudadanoRepo.encontrar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.ciudadanoRepo.eliminar(id);
	}

}
