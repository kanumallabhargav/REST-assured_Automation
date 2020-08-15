package oAuth_Automation;
import static io.restassured.RestAssured.given;

public class BasicResponse 
{
	public static void main(String[] args)
	{
		String response = 
		given().queryParam("AccessToken", "")
		.when()
		.get("https://rahulshettyacademy.com/getCourse.php").asString();
		
		System.out.println(response);

	}
}
