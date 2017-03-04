package com.demo1;

public class SubjectImpl extends Subject {
	
	private String message;
	
	public SubjectImpl(){
		message = "";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
