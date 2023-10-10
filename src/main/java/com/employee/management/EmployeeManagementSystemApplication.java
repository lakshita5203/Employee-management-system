package com.employee.management;

import com.employee.management.model.Employee;
import com.employee.management.repository.EmployeeRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagementSystemApplication{

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);

	}

//	@Autowired
//	private EmployeeRespository emp;
//	@Override
//	public void run(String... args) throws Exception {
//		Employee e1 = new Employee(23082, "lakshita","", "manie", "java");
//		emp.save(e1);
//		Employee e2 = new Employee(23062, "micheal","cartar", "john", "SDE");
//		emp.save(e2);
//	}
}
