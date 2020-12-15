package com.tavant.collection.exceptions;

import lombok.NoArgsConstructor;

@NoArgsConstructor

public class InvalidSalaryException extends Exception {
	
public InvalidSalaryException(String msg) {
	// TODO Auto-generated constructor stub
	super(msg);
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+super.getMessage();
	}
}
