package com.rest.automation.RestPratice;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PUT {

@Test
public void put() {
	RequestSpecification request=RestAssured.given();
	  request.header("Content-Type","application/json");
	  JSONObject json=new JSONObject();
	  json.put("id", "2");
	  json.put("title", "RestApi");
	  json.put("author", "DAMU");
	  request.body(json.toJSONString());
	 Response response=request.put( "http://localhost:3000/posts/2");	
	 int code=response.getStatusCode();
	 Assert .assertEquals(code, 200);
	
}
	

}
