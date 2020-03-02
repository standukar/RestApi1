package com.example1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example1.dtos.PayrollDto;
import com.example1.services.PayrollServices;

@RestController
@RequestMapping("/payroll")
public class PayrollController {
	
	@Autowired
	private PayrollServices payrollServices;
	
	@GetMapping("")
	public PayrollDto getPayrollById() {
		return payrollServices.getDummyPayroll();
		
	}

	@GetMapping("/{payrollId}")
	public PayrollDto getPayrollByIdPath(@PathVariable(value = "payrollId") String payrollId) {
		return payrollServices.getDummyPayroll();
	}
}
