package com.thyoun.samples.samplejpa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	@GetMapping("/")
	public String root() {
		return "hello gamma";
	}

}
