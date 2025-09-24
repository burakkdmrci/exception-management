package com.burakdemirci.service;

import com.burakdemirci.dto.DtoEmployee;

public interface IEmployeeService {
	
	public DtoEmployee findEmployeebyId(Long id);
}
