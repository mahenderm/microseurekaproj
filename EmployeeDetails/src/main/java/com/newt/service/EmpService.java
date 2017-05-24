package com.newt.service;

import java.util.Hashtable;

import org.springframework.stereotype.Service;

import com.newt.model.Employee;

@Service
public class EmpService {
	
	Hashtable<String, Employee> hashTable = new Hashtable<String, Employee>();
	
	public EmpService() {
		Employee employee = new Employee();
		
		employee.setEid(111);
		employee.setEname("Mukesh");
		employee.setEage(25);
		
		hashTable.put("1", employee);
		
		employee = new Employee();
		
		employee.setEid(222);
		employee.setEname("Raj");
		employee.setEage(22);
		
		hashTable.put("2", employee);
		
		
	}
	public Employee getEmployee(String eid) {
		if(hashTable.containsKey(eid))
		
		return hashTable.get(eid);
		else
		return null;
				
	}
	public Hashtable<String, Employee> getAll() {
		return hashTable;
		
	}

}
