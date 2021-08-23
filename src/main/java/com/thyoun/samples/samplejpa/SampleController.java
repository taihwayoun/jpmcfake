package com.thyoun.samples.samplejpa;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class SampleController {
	
	@GetMapping("/")
	public String hell() {
		return "hello employee";
	}
	
	@GetMapping("/employee")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getEmployee() {
		Employee emp = new Employee();
		emp.setId(3);
		emp.setFn("James");
		emp.setLn("Jones");
		emp.setEmail("james.jones@chase.com");
		return emp;
	}

}
