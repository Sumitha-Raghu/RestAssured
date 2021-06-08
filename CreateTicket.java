package chainingJIRA;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class CreateTicket extends BaseClass {

	@Test
		
	public  void createticket() {
		Response response= RestAssured
				.given()
			
				.contentType(ContentType.JSON)
		
				.body(new File("./datajira/data1.json"))
				.when()
				//.log()
				//.all()
				.post();
		response.prettyPrint();
		
		
		//Formatting the response in json format
		JsonPath jsonPath = response.jsonPath();
		issue_id= jsonPath.get("id");
		
		//System.out.println(issue_id);
		
		
						
		

	}

}
