package com.jira.restAPi.REST_assured_Automation;

public class JSON_Body_basic
{
	public static String body()
	{
		String bodyContent = "{\r\n" + 
				"    \"body\": \"This is a comment that only administrators can see.\",\r\n" + 
				"    \"visibility\": {\r\n" + 
				"        \"type\": \"role\",\r\n" + 
				"        \"value\": \"Administrators\"\r\n" + 
				"    }\r\n" + 
				"}";
		return bodyContent;
	}
}
