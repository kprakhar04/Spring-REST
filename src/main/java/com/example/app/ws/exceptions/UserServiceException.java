package com.example.app.ws.exceptions;

public class UserServiceException extends RuntimeException {

	private static final long serialVersionUID = 5059466654962912096L;

	public UserServiceException(String message) {
		super(message);
	}
}
