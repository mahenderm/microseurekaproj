package com.newt.controller;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newt.model.Employee;
import com.newt.service.EmpService;

@RestController
@RequestMapping("/employee")
public class EmpController {
	@Autowired
	private EmpService empService;
	@RequestMapping("/all")
	public Hashtable<String, Employee> getAll() {
		return empService.getAll();
	}
	@RequestMapping("{eid}")
	public Employee getEmployee(@PathVariable("eid") String eid) {
		return empService.getEmployee(eid);
	}

}
