package com.example1.dtos;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component

public class PayrollDto {
	private String payrollId;
	private String Hours;
	private String Rate;
	
	private List<TeachersDto> teachers;

	public String getPayrollId() {
		return payrollId;
	}

	public void setPayrollId(String payrollId) {
		this.payrollId = payrollId;
	}

	public String getHours() {
		return Hours;
	}

	public void setHours(String hours) {
		Hours = hours;
	}

	public String getRate() {
		return Rate;
	}

	public void setRate(String rate) {
		Rate = rate;
	}

	public List<TeachersDto> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<TeachersDto> teachers) {
		this.teachers = teachers;
	}

	@Override
	public String toString() {
		return "PayrollDto [payrollId=" + payrollId + ", Hours=" + Hours + ", Rate=" + Rate + ", teachers=" + teachers
				+ "]";
	}
	
	
	

}
