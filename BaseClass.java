package chainingJIRA;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.restassured.RestAssured;

public class BaseClass {
	//global variable
	public static String issue_id;
	//common steps for all test cases
	//common methods and variables
	
	@BeforeMethod
	//BeforeSuite runs first

	public void preconditon() {
		RestAssured.baseURI = "https://api-may2020.atlassian.net/rest/api/2/issue/";
		
		RestAssured.authentication = RestAssured.preemptive().basic("Hari.radhakrishnan@testleaf.com",
				"ODWNgjWGBWQ6PLeMtv2W4C66");
	}
}
	

	
		

	


