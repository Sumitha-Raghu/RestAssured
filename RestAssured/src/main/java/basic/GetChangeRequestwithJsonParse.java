package basic;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetChangeRequestwithJsonParse {
	@Test
	public void getChange() {
		//Step 1: Get Change request
		RestAssured.baseURI = "https://dev105626.service-now.com/api/now/table/change_request"; 
		//Step 2: Basic Authentication
		RestAssured.authentication = RestAssured.basic("admin", "KAJxCmaSmy59");
		//Step 3: Request Type - Get
		Response response = RestAssured
				.given()
				.queryParam("sysparm_fields", "sys_id,number,short_description")
				.get();
		//Step 4: Response Print
		response.prettyPrint();
		
	

	

	}

}
