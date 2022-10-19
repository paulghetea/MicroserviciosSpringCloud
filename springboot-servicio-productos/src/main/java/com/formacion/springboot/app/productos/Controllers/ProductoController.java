package com.formacion.springboot.app.productos.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.formacion.springboot.app.productos.entities.Producto;
import com.formacion.springboot.app.productos.serivices.IProductoService;

@RestController
public class ProductoController {
	
	@Autowired
	private IProductoService service;
	
	@GetMapping("/listar")
	public List<Producto> listar(){
		return service.findAll();
	}
	
	@GetMapping("/listar/{id}")
	public Producto detalle(@PathVariable Long id) {
		return service.findById(id);
	} 
}
