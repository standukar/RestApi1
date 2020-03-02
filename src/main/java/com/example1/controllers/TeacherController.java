package com.example1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example1.dtos.TeachersDto;

@RestController
@RequestMapping("/teachers")
public class TeacherController {
	
	@Autowired
	
	@GetMapping(value = "")
	public TeachersDto getDummyTeachers() {
		
	TeachersDto dto = new TeachersDto();
	dto.setName("jack");
	dto.setEmail("jack@gmail.com");
	dto.setPhone("5478142541");
	
	
	return dto;
	}
	@PostMapping(value = "")
	public void createPassenger(@RequestBody TeachersDto dto) {
		System.out.println(dto.toString());
	}
}
