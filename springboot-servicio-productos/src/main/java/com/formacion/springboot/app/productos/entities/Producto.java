package com.formacion.springboot.app.productos.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "productos")
@Getter
@Setter
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
public class Producto implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NonNull
	private String nombre;

	@NonNull
	private Double precio;

	@NonNull
	@Column(name = "fecha_de_creacion")
	@Temporal(TemporalType.DATE) // Establece el formato de la fecha. Date = aa/mm/dd . Se puede usar "Time" o
									// "TimeStamp"(incluye todo).
	private Date fechaDeCreacion;

	// Permite comvertir el objeto en bytes. Util para guardar la entidad en sesión http.
	private static final long serialVersionUID = -1330584369224771991L;
	
}
