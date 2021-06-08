package chainingJIRA;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class GetTicket extends BaseClass{
	//@Test(dependsOnMethods = "chaining.UpdateTicket.Update")

@Test
	public void getIssue() {
		Response response= 
				RestAssured
		.given()
		.contentType(ContentType.JSON)
		.log().all()
		.when()
		.get(issue_id);
	
		response.prettyPrint();
}
}

