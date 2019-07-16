package com.rest.automation.RestPratice;


import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Post_request {

@Test	
// post the data in json format
public void RegistrationSuccessful() {
	
	  RequestSpecification request=RestAssured.given();
	  request.header("Content-Type","application/json");
	  JSONObject json=new JSONObject();
	  json.put("id", "5");
	  json.put("title", "RestApi");
	  json.put("author", "DAMU");
	  request.body(json.toJSONString());
	 Response response=request.post( "http://localhost:3000/posts/5");
	  int code=response.getStatusCode();
	 System.out.println(code);
	
}
}