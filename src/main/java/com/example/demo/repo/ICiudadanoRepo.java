package com.example.demo.repo;

import com.example.demo.repo.modelo.Ciudadano;

public interface ICiudadanoRepo {

	
	public void agregar(Ciudadano ciudadano);
	public void actualizar(Ciudadano ciudadano);
	public Ciudadano encontrar(Integer id);
	public void eliminar(Integer id);
}
