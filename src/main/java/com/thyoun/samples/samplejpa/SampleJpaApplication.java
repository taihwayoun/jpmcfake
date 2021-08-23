package com.thyoun.samples.samplejpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleJpaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SampleJpaApplication.class, args);
	}
	
	@Override
	public void run(String[] args) {
		System.out.println("hello jpa");
	}

}
