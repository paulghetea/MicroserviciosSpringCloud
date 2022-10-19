package com.formacion.springboot.item.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.formacion.springboot.item.entities.Item;
import com.formacion.springboot.item.services.ItemService;

@RestController
public class ItemController {

	@Autowired
	ItemService servicio;
	
	@GetMapping("/listar")
	public List<Item> listar(){
		return servicio.findAll();
	}
	
	@GetMapping("/listar/{id}/{cantidad}")
	public Item detalle(@PathVariable Long id, @PathVariable Integer cantidad) {
		return servicio.findById(id, cantidad);
	}
	
}
