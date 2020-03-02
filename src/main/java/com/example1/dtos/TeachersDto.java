package com.example1.dtos;

import java.io.Serializable;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component

public class TeachersDto implements Serializable {
	private String Name;
	private String Email;
	private String Phone;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	@Override
	public String toString() {
		return "TeachersDto [Name=" + Name + ", Email=" + Email + ", Phone=" + Phone + "]";
	}
	
	
}
