package com.jira.restAPi.REST_assured_Automation;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;

public class JIRA_Testing {

	public static void main(String[] args) 
	{
		RestAssured.baseURI="http://localhost:8080";
		
		SessionFilter session = new SessionFilter();
		
		String response = given().header("Content-Type","application/json")
		.body(login_jasonBody.loginBody()).log().all()
		.filter(session)
		.when().post("/rest/auth/1/session").then().log().all().extract().response().asString();
		System.out.println(response);
		
		given().pathParam("id", "10003").log().all()
		.header("Content-Type","application/json")
		.body(JSON_Body_basic.body())
		.filter(session)
		.when().post("/rest/api/2/issue/{id}/comment")
		.then().log().all().assertThat().statusCode(201);
	}

}
