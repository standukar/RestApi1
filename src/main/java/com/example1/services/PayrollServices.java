package com.example1.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example1.dtos.PayrollDto;
import com.example1.dtos.TeachersDto;

@Service
public class PayrollServices {

	
		public PayrollDto getDummyPayroll( ) {
			PayrollDto p = new PayrollDto();
			p.setPayrollId("1234");
			p.setHours("80");
			p.setRate("40");
			
			List<TeachersDto> teachers = new ArrayList<TeachersDto>();
			TeachersDto t1 = new TeachersDto();
			t1.setName("abc");
			t1.setEmail("abc@gmail.com");
			t1.setPhone("8754584755");
			
			TeachersDto t2 = new TeachersDto();
			t2.setName("jack");
			t2.setEmail("jack@gmail.com");
			t2.setPhone("5478142541");
			
			teachers.add(t1);
			teachers.add(t2);
			
			p.setTeachers(teachers);
			return p;
			
		}
	
		public PayrollDto getPayrollgetDummyPayroll(String payrollId) {
			PayrollDto p = new PayrollDto();
			p.setPayrollId(payrollId);
			p.setHours("80");
			p.setRate("40");
			
			List<TeachersDto> teachers = new ArrayList<TeachersDto>();
			TeachersDto t1 = new TeachersDto();
			t1.setName("abc");
			t1.setEmail("abc@gmail.com");
			t1.setPhone("8754584755");
			
			TeachersDto t2 = new TeachersDto();
			t2.setName("jack");
			t2.setEmail("jack@gmail.com");
			t2.setPhone("5478142541");
			
			teachers.add(t1);
			teachers.add(t2);
			
			p.setTeachers(teachers);
			
			return p;
		}
	
}
