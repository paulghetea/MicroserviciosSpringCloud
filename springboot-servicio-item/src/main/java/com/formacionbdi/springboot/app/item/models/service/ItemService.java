package com.formacionbdi.springboot.app.item.models.service;

import java.util.List;

import com.formacionbdi.springboot.app.item.models.Item;
import com.formacion.springboot.app.commons.models.entity.Producto;

public interface ItemService {

	public List<Item> findAll();
	public Item findById(Long id, Integer cantidad);
	public Producto save(Producto producto);
	public Producto update(Producto producto);
	public void delete(Long id);
}
