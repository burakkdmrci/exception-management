package com.burakdemirci.controller;

import com.burakdemirci.dto.DtoEmployee;

public interface IEmployeeController {
	
	public DtoEmployee findEmployeebyId(Long id);

}
