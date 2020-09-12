package tripadvisor_getQuestion;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;

public class createRequest 
{
	@Test
	public void generateRequest()
	{
		RestAssured.baseURI="https://tripadvisor1.p.rapidapi.com";

		Main m = 
				given().log().all()
				.queryParam("question_id", "5283833").queryParam("limit", "10")
				.headers("x-rapidapi-key","d91f7cc63cmshe905f3dc92a455dp1d4e38jsnf2dae1705052").expect().defaultParser(Parser.JSON)
				.when().get("/answers/list").as(Main.class);

		System.out.println("The status of has more answers is: "+m.isHas_more_answers());

		System.out.println("The status of is_owner is:" +m.getAnswers().get(0).isIs_owner());

		System.out.println("user id is: "+m.getAnswers().get(0).getMember().getUser_id());

	}
}
