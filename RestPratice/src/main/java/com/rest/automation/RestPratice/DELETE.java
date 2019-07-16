package com.rest.automation.RestPratice;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DELETE {

	
	@Test
	public void delete() {
		  RequestSpecification request=RestAssured.given();
		 Response response=request.delete( "http://localhost:3000/posts/4");	
		 int code=response.getStatusCode();
		 Assert .assertEquals(code, 200);
		
	}
	
	
	
	
}
