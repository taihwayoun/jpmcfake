package com.thyoun.samples.samplejpa;


import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

import io.restassured.RestAssured;
import static io.restassured.module.mockmvc.RestAssuredMockMvc.*;
//import static io.restassured.module.mockmvc.matcher.RestAssuredMockMvcMatchers.*;

public class SampleControllerTest {

	@LocalServerPort
	private static int port=9090;
	
	@BeforeAll
	public static void init() {
		RestAssured.baseURI="http://localhost";
		RestAssured.port=port;
	}

	@Test
	public void testGetEmployee() {
		given()
			.standaloneSetup(new SampleController())
		.when()
			.get("/employee")
		.then()
			.body("id",  equalTo(3))
			.body("fn", equalTo("James"))
			.body("ln", equalTo("Jones"))
			.body("email", equalTo("james.jones@chase.com"));
		
	}
}