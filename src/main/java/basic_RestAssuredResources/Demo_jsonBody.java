package basic_RestAssuredResources;

public class Demo_jsonBody 
{
	public static String postBody()
	{
		String body_post = "{\n" + 
			"  \"location\": {\n" + 
			"    \"lat\": -38.383494,\n" + 
			"    \"lng\": 33.427362\n" + 
			"  },\n" + 
			"  \"accuracy\": 50,\n" + 
			"  \"name\": \"Attempt from automation - house\",\n" + 
			"  \"phone_number\": \"(+87) 887 887 8887\",\n" + 
			"  \"address\": \"87, bimbo layout, bimby 87\",\n" + 
			"  \"types\": [\n" + 
			"    \"shoe park\",\n" + 
			"    \"shop\"\n" + 
			"  ],\n" + 
			"  \"website\": \"http://google.com\",\n" + 
			"  \"language\": \"French-IN\"\n" + 
			"}";
		return body_post;
	}
	public static String deleteBody()
	{
		String body_delete = "76fbefb44e813271a8b22cc42a09a3d9";
		return body_delete;
	}
}
