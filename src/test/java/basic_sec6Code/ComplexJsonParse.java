package basic_sec6Code;

import java.util.ArrayList;

import basic_RestAssuredResources.Sec6_jsonBody;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {

	public static void main(String[] args) 
	{
		//Declare JSON path
		JsonPath js = new JsonPath(Sec6_jsonBody.sec6JsonBody());
		
		//Get count of number of courses
		int count = js.getInt("courses.size()");
		System.out.println(count);
		
		//Get the purchase amount
		int purchaseAmount = js.get("dashboard.purchaseAmount");
		System.out.println(purchaseAmount);
		
		//Get the name of second course title
		String secondCourseTitle = js.getString("courses[1].title");
		System.out.println(secondCourseTitle);
		
		//Declare some utilities
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int sum = 0, checkSum=0;
		
		//Print all the course titles at once
		for(int i=0;i<count;i++)
		{
			String title = js.getString("courses["+i+"].title");
			System.out.println(title);
			
			//Print the copies sold by RPA
			System.out.println(js.get("courses["+i+"].price").toString());
			if(title.equalsIgnoreCase("RPA"))
			{
				String copies = js.get("courses["+i+"].copies").toString();
				System.out.println("Number of copies sold by RPA is: "+copies);
			}
		}
		for (int j=0;j<count;j++)
		{
			int price = js.getInt("courses["+j+"].price");
			int copies = js.getInt("courses["+j+"].copies");
			checkSum=price*copies;
			arr.add(checkSum);
		}
		for (int i: arr) {
	        sum += i;
	    }
		System.out.println(arr);
		System.out.println(sum);
		if(sum==purchaseAmount)
		{
			System.out.println("Purchase amount verified.");
		}
		else
		{
			System.out.println("Purchase amount incorrect");
		}
	}

}
