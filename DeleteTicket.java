package chainingJIRA;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteTicket extends BaseClass {
	@Test()
	public void deleteticket() {
		Response response= RestAssured
				.given()
				.log()
				.all()
				.when()
				.delete(issue_id);
		System.out.println(response.statusCode());
		
		

	
	}

}
