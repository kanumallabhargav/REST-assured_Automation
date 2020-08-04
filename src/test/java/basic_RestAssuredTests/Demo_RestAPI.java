package basic_RestAssuredTests;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import basic_RestAssuredResources.Demo_jsonBody;

public class Demo_RestAPI 
{
	public static void main(String[] aregs)
	{
		RestAssured.baseURI="https://rahulshettyacademy.com";
		given().log().all().queryParam("key", "qaclick123")
		.headers("Contrent-Type","application/json")
		.body(Demo_jsonBody.postBody())
		.when().post("/maps/api/place/add/json")
		.then().log().all()
		.assertThat().statusCode(200);
	}
}
