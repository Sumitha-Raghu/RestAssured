package chainingJIRA;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UpdateTicket extends BaseClass {
	
	@Test

	//@Test(dependsOnMethods ="chainingJIRA".CreateIssue.create)
	public void Update() {
		Response response= 
		RestAssured.given().contentType(ContentType.JSON)
				.body("{ \"fields\": { \"description\": \"updates using RestAssured\" } }")
				.when()
				.log()
				.all()
				.put(issue_id);
		
		System.out.println(response.prettyPrint());
		

	}


		
		

	}


