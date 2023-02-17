package com.prowings.model;

import javax.persistence.CascadeType;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
public class Employee {

	int id;
	String name;

	@OneToOne(cascade = CascadeType.ALL)
	Address address;
}
