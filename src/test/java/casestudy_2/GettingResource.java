package casestudy_2;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Reusable.libraies.*;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

@Listeners(casestudy_2.ExtentReportManager.class)
public class GettingResource {

	@Test(priority=1)
			public void gettodos() {
		
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";
			given().log().all().
			when().get("/posts").
			then().log().all().assertThat().statusCode(200);
			
	}
	@Test(priority=2)
	
        public void singleUser() {
		
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";
       
			given().log().all().
			when().get("/posts/1").
			then().log().all().assertThat().statusCode(200);
        }
	@Test(priority=3)
			//create user
        public void createUser() {
    		
    		RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";
			given().log().all().
			body(Reusable.libraies.Payload1.updateUser()).
			when().post("/posts").
			then().log().all().assertThat().statusCode(201);
        }
		/*
		 * @Test(priority=4) //update the user public void updateUser() {
		 * 
		 * RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";
		 * given().log().all().header("Content-Type","application/json").
		 * body(Reusable.libraies.Payload1.updateUser()). when().put("/posts/1").
		 * then().log().all().assertThat().statusCode(200); }
		 * 
		 * @Test(priority=5) //patch public void patchUser() {
		 * 
		 * RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";
		 * given().log().all().header("Content-Type","application/json").
		 * body(Reusable.libraies.Payload1.patchUser()). when().patch("/posts/1").
		 * then().log().all().assertThat().statusCode(200);
		 * 
		 * }
		 * 
		 * @Test(priority=6) //Deleting the user public void DeleteUser() {
		 * 
		 * RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";
		 * 
		 * given().log().all().header("Content-Type","application/json").
		 * when().delete("/posts/1"). then().log().all().assertThat().statusCode(200); }
		 * 
		 * @Test(priority=7) //Filtering resource public void FilterResource() {
		 * 
		 * RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";
		 * given().log().all().header("Content-Type","application/json").
		 * when().get("/posts?userId=1").
		 * then().log().all().assertThat().statusCode(200); }
		 * 
		 * @Test(priority=8) //Listing nested methods public void listmethods() {
		 * 
		 * RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";
		 * 
		 * given().log().all().header("Content-Type","application/json").
		 * when().get("/posts/1/comments").
		 * then().log().all().assertThat().statusCode(200); }
		 */
			
	}


