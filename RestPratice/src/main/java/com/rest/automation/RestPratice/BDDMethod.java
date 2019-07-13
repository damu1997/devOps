package com.rest.automation.RestPratice;

import org.testng.annotations.Test;

import groovyjarjarasm.asm.commons.Method;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.*;
public class BDDMethod {
	
//@Test
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

//@Test
public void test_seasons() {
given().
when().	
get("http://ergast.com/api/f1/seasons.json").
then().
assertThat().
//time(lessThan(350l)).
and().
log();

}
@Test
public void Response() {
RestAssured.baseURI="http://ergast.com/api/f1/seasons.json";
RequestSpecification httprequest= RestAssured.given();
Response response=httprequest.request(io.restassured.http.Method.GET, "http://ergast.com/api/f1/seasons.json");
String responseBody=response.getBody().asString();
System.out.print(responseBody);	
}
}
