package com.formacion.springboot.app.productos.serivices;

import java.util.List;

import com.formacion.springboot.app.productos.entities.Producto;

public interface IProductoService {

	public List<Producto> findAll();
	public Producto findById(Long id);
	
	
}
