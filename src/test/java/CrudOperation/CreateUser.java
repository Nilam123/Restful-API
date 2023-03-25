package CrudOperation;

import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateUser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Step 1: create the data
		
		HashMap map= new HashMap();
		map.put("name", "Avnish");
		map.put("Job", "Tester");
		
	//	step 2://send a request
		
		RequestSpecification req = RestAssured.given();
		
		req.body(map);
		req.contentType(ContentType.JSON);
		Response response = req.post("https://reqres.in/api/users");
		//Step 3: validate the response
		
		response.then().log().all();
	}

}
