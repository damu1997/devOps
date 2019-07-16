package com.rest.automation.RestPratice;

import org.testng.Assert;
import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.*;

import java.awt.image.RescaleOp;

import static io.restassured.RestAssured.*;
public class GETBDDMethod {
	
@Test
public void test_NumberOfCircuitsFor2017(){
given().
when().
get("http://ergast.com/api/f1/2017/circuits.json").
then().
	assertThat().
	statusCode(200).
	and().
body("MRData.CircuitTable.Circuits.CircuitId", hasSize(20)).
and().
header("Content-Length", equalTo("4551"));
}

@Test
public void test_seasons() {
given().
when().	
get("http://ergast.com/api/f1/seasons.json").
then().
assertThat().
time(lessThan(350l)).
and().
log();

}
@Test
public void ResponseForF1Race() {
RestAssured.baseURI="http://ergast.com/api/f1/seasons.json";
RequestSpecification httprequest= RestAssured.given();
Response response=httprequest.request(io.restassured.http.Method.GET, "http://ergast.com/api/f1/seasons.json");
String responseBody=response.getBody().asString();
System.out.print(responseBody);	
}
@Test
public void GetWeatherDetailsValidCity() {
RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
RequestSpecification httprequest=RestAssured.given();
Response response =httprequest.request(Method.GET,"/hyderabad" );
String responseBody=response.getBody().asString();
System.out.print(responseBody);	
}

@Test
public void GetWeatherDetailsInvalidCity()
{
	RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
	RequestSpecification httpRequest = RestAssured.given();
	Response response = httpRequest.get("/78789798798");
	int statusCode = response.getStatusCode();
	Assert.assertEquals(statusCode /*actual value*/, 200 /*expected value*/, "Correct status code returned");
}



}













