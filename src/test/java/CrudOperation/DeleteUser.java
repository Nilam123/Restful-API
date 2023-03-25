package CrudOperation;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSender;

public class DeleteUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Response response = RestAssured.delete("https://reqres.in/api/users/2");
		
		RequestSender response = RestAssured.when();
		Response re = response.delete("https://reqres.in/api/users/2");
		re.then().log().all();
		}

}
