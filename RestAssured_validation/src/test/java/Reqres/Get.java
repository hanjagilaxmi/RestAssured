package Reqres;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;


public class Get {
	public static void main(String[] args) {
		Response res = given().spec(Generic.req_spec()).get("/api/users/2")
		.then().spec(Generic.res_spec(200)).extract().response();
		System.out.println(res.asString());
	}
}
