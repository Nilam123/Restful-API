package CrudOperation;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSender;

public class GetUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Step 1: Create request body
		
		
		//Step 2:send request
		
		
		//Response resp = RestAssured.get("https://reqres.in/api/users?page=2");
		
		RequestSender res = RestAssured.when();
		Response respose = res.get("https://reqres.in/api/users?page=2");
		// step 3: validate the response
		respose.then().log().all();
	}

}
