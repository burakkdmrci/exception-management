package com.burakdemirci.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.burakdemirci.controller.IEmployeeController;
import com.burakdemirci.dto.DtoEmployee;
import com.burakdemirci.service.IEmployeeService;

@RestController
@RequestMapping("/rest/api/employee")
public class EmployeeControllerImpl implements IEmployeeController {
	
	@Autowired
	private IEmployeeService employeeService;
	
	@GetMapping("/list/{id}")
	@Override
	public DtoEmployee findEmployeebyId(@PathVariable(value = "id") Long id) {
		return employeeService.findEmployeebyId(id);
	}

}
