package com.cg.spring.boot.demo.Exception;

import com.cg.spring.boot.demo.model.Employee;

public class EmployeeNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public EmployeeNotFoundException() {
		super();

	}

	public EmployeeNotFoundException(String message) {
		super(message);

	}
}

