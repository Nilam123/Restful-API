package CrudOperation;

import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSender;
import io.restassured.specification.RequestSpecification;

public class UpdateUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Step one :Create a Requst
		HashMap hash=new HashMap();
		hash.put("name", "avi");
		hash.put("job", "QA");
		
		//Step 2. send a Requst
	 RequestSpecification rest = RestAssured.given(); 
	 rest.body(hash);
	 rest.contentType(ContentType.JSON);
	 
		Response response = rest.put("https://reqres.in/api/users/2");
		
		//3. Validate the responsde
		response.then().log().all();
	}

}
