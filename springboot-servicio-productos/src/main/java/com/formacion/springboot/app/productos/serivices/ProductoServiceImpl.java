package com.formacion.springboot.app.productos.serivices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formacion.springboot.app.productos.entities.Producto;
import com.formacion.springboot.app.productos.repository.ProductoDao;

@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	private ProductoDao repository;

	@Override
	@Transactional(readOnly=true)
	public List<Producto> findAll() {
		return (List<Producto>) repository.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Producto findById(Long id) {
		//el repo devuelve un optional. Si no se encuentra devuelve un null
		return repository.findById(id).orElse(null);
	}

}
