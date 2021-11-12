package com.cg.spring.boot.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spring.boot.demo.model.Department;

@RestController
public class DepartmentController {
@GetMapping("/getalldept")
	public List<Department> getDepartment() {
		Department obj=new Department(101,"HR");
		List<Department> mylist= new ArrayList<>();
		mylist.add(obj);
		mylist.add(new Department(102,"DEV"));
		
		return mylist;
	}
	
	
	
	
}
