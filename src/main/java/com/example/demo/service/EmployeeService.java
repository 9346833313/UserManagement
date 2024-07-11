package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	public Employee getEmployeeById(long id) {
		Optional<Employee> optionalEmployee = employeeRepository.findById(id);
		return optionalEmployee.get();
	}

	public Employee updateEmployee(Employee employee, long id) {
		Employee e = employeeRepository.findById(id).get();
		e.setName(employee.getName());
		e.setEmail(employee.getEmail());
		e.setSalary(employee.getSalary());
		return employeeRepository.save(e);
	}

	public void deleteEmployeeById(long id) {
		employeeRepository.findById(id).get();
		employeeRepository.deleteById(id);

	}
}
