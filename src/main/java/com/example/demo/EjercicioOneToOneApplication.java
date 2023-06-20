package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repo.modelo.Ciudadano;
import com.example.demo.repo.modelo.Empleado;
import com.example.demo.service.ICiudadanoService;
import com.example.demo.service.IEmpleadoService;

@SpringBootApplication
public class EjercicioOneToOneApplication implements CommandLineRunner{
@Autowired
private ICiudadanoService ciudadanoService;
@Autowired
private IEmpleadoService empleadoService;
	public static void main(String[] args) {
		SpringApplication.run(EjercicioOneToOneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Ciudadano ciudadano = new Ciudadano();
		ciudadano.setNombre("Anddy");
		ciudadano.setApellido("Quisilema");
		ciudadano.setCedula("1721483814");
		
		
		Empleado empleado= new Empleado();
		empleado.setCargo("Gerente");
		empleado.setSueldo(new BigDecimal(100));
		Ciudadano ciudadanoE= this.ciudadanoService.buscar(2);
		empleado.setCiudadano(ciudadanoE);
		
		
		//this.ciudadanoService.insertar(ciudadano);
		//this.empleadoService.insertar(empleado);
		this.empleadoService.borrar(2);
		
		
	}

}
