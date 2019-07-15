package com.rest.automation.RestPratice;


import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.util.JSONPObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Post_request {

@Test	
public void RegistrationSuccessful() {
	
	  //specify the URL
	 	RestAssured.baseURI=	"http://restapi.demoqa.com/customer" 
	 			
	//RequestObjectt
	RequestSpecification httprequest=RestAssured.given();
	//Sending along with post request
	JSONObject requestparam=new JSONObject();
	requestparam.put("FirstName","Damu");
	requestparam.put("LastName","CR7");
	requestparam.put("UserName","DamCR7");
	requestparam.put("Password","Damu1997");
	requestparam.put("Email","DamuCR7@gmail.com");
	httprequest.header("Content-Type","application/json");
	httprequest.body( requestparam.toJSONString());
	//response object
	Response response=httprequest.request(Method.POST,"/register");
	//print response
	String responseBody=response.getBody().asString();
System.out.println("Response body->"+responseBody);
//status code validation
int statusCode=response.getStatusCode();
System.out.println("Status code is: "+statusCode);
Assert.assertEquals(statusCode, 201);

//success code validation
String successCode=response.jsonPath().get("SuccessCode");
Assert.assertEquals(successCode, "OPERATION_SUCCESS");

	
	
	
	

}
	
}
