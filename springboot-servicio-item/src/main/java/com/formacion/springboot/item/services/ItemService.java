package com.formacion.springboot.item.services;

import java.util.List;

import com.formacion.springboot.item.entities.Item;

public interface ItemService {
	
	public List<Item> findAll();
	public Item findById(Long id, Integer cantidad);

}
