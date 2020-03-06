package com.example.async.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class EmployeeAddress implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9089911519863129623L;
	public String streetNo;
	public String houseNo;
	public String zipCode;


}
