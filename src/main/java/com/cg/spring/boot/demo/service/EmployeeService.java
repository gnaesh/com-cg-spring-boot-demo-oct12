package com.cg.spring.boot.demo.service;


import java.util.ArrayList;
import java.util.List;

//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cg.spring.boot.demo.Controller.EmployeeController;
import com.cg.spring.boot.demo.model.Employee;

//@Component

@Service
public class EmployeeService {

	private List<Employee> empList = new ArrayList<>();

	{
		empList.add(new Employee(101, "Sonu", 10.5));
		empList.add(new Employee(102, "Monu", 15.5));
		empList.add(new Employee(103, "Tonu", 12.5));
	}

	public List<Employee> getAllEmployees() {
		System.out.println("Service getAllEmployees");
		return empList;
	}

public static void delete(int eid) {
	Employee.deleteById(eid);
}
	
	public Employee getEmployeeById(int eid) {
	return empList.stream().filter(e -> eid == e.getEid()).findAny().get();
//		return obj;
	}
//
	
	public Employee addEmployee(Employee employee) {
		empList.add(employee);
		return employee;
	}
//	public Employee addEmployee(Employee employee) {
//		return employee;
//	}

}