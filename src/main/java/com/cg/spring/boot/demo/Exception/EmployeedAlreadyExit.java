package com.cg.spring.boot.demo.Exception;

public class EmployeedAlreadyExit extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public EmployeedAlreadyExit() {
		super();

	}

	public EmployeedAlreadyExit(String message) {
		super(message);

	}
	
}
