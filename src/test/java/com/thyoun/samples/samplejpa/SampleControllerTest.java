package com.thyoun.samples.samplejpa;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;
import static org.hamcrest.CoreMatchers.equalTo;;

public class SampleControllerTest {

	@BeforeAll
	public static void init() {
		RestAssured.baseURI="http://localhost";
		RestAssured.port=9090;
	}

	@Test
	public void testUserFetchesSuccess() {
		RestAssured.get("/employee")
		.then()
		.body("id",  equalTo(3))
		.body("fn", equalTo("James"))
		.body("ln", equalTo("Jones"))
		.body("email", equalTo("james.jones@chase.com"));
		
	}
}