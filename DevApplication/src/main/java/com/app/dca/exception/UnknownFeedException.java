package com.app.dca.exception;


public class UnknownFeedException extends Exception{
   
	String message = null;
	
	public void UnknownFeedException() {
		message = "Invalid Feed Id, try again";
	}
	
	

	@Override
	public String toString() {
		return "UnknownFeedException [message=" + message + "]";
	}
	
	
}
