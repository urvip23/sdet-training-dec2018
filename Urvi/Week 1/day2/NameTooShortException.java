package com.training.sdet.day2;

public class NameTooShortException extends Exception {
	private String msg;
	
	public NameTooShortException(String msg){
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "NameTooShortException [msg=" + msg + "]";
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return ":::::" + msg + ":::::";
		
		
	}
	
	

}
