package basic_RestAssuredTests;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Demo_getRSA {

	public static void main(String[] args) 
	{ 
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String response = given().log().all()
		.queryParam("key", "qaclick123")
		.queryParam("place_id", "b48e8c198004c5cd00583a55b3dc8291")
		.when().get("/maps/api/place/get/json")
		.then().log().all()
		.assertThat().statusCode(200).body("language", equalTo("French-IN")).extract().response().asString();
		System.out.println(response);
		
		//Extract only one value from the response
		JsonPath js = new JsonPath(response);
		String latitude = js.getString("location.latitude");
		String longitude = js.getString("location.longitude");
		System.out.println("Latitude is: "+latitude);
		System.out.println("Longitude is: "+longitude);
	}

}
