package com.example.demo.service;

import com.example.demo.repo.modelo.Ciudadano;

public interface ICiudadanoService {

	public void insertar(Ciudadano ciudadano);
	public void actualizar(Ciudadano ciudadano);
	public Ciudadano buscar(Integer id);
	public void borrar(Integer id);
	
}
