package basic_RestAssuredResources;

public class Sec6_jsonBody 
{
	public static String sec6JsonBody()
	{
		String body_s6="{\n" + 
				"\n" + 
				"\"dashboard\": {\n" + 
				"\n" + 
				"\"purchaseAmount\": 910,\n" + 
				"\n" + 
				"\"website\": \"rahulshettyacademy.com\"\n" + 
				"\n" + 
				"},\n" + 
				"\n" + 
				"\"courses\": [\n" + 
				"\n" + 
				"{\n" + 
				"\n" + 
				"\"title\": \"Selenium Python\",\n" + 
				"\n" + 
				"\"price\": 50,\n" + 
				"\n" + 
				"\"copies\": 6\n" + 
				"\n" + 
				"},\n" + 
				"\n" + 
				"{\n" + 
				"\n" + 
				"\"title\": \"Cypress\",\n" + 
				"\n" + 
				"\"price\": 40,\n" + 
				"\n" + 
				"\"copies\": 4\n" + 
				"\n" + 
				"},\n" + 
				"\n" + 
				"{\n" + 
				"\n" + 
				"\"title\": \"RPA\",\n" + 
				"\n" + 
				"\"price\": 45,\n" + 
				"\n" + 
				"\"copies\": 10\n" + 
				"\n" + 
				"}\n" + 
				"\n" + 
				"]\n" + 
				"\n" + 
				"}";
		return body_s6;
	}
}
