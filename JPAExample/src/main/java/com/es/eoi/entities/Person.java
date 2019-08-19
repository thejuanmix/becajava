package com.es.eoi.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "person")
@Getter
@Setter
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idPerson;
	
	@Column
	private String name;
	
	@Column
	private String surname;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "person")
	private Adress adress;
	
	

}
