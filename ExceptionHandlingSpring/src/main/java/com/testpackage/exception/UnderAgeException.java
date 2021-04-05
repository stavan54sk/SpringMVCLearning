package com.testpackage.exception;

public class UnderAgeException extends RuntimeException {

	private String exceptionMessage;

	public UnderAgeException(String exceptionMessage) {
		// TODO Auto-generated constructor stub
		this.exceptionMessage=exceptionMessage;
	}

	public String getExceptionMessage() {
		return exceptionMessage;
	}

	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}

}
