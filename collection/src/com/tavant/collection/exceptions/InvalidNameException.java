package com.tavant.collection.exceptions;

public class InvalidNameException extends Exception {

	public InvalidNameException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+ this.getMessage();
	}
}
