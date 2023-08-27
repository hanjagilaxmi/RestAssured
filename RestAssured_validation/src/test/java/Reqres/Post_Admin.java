package Reqres;

import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;

public class Post_Admin {
	public static void main(String[] args) {
		String obj="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}";
		RestAssured.baseURI="https://reqres.in/";
		given().body(obj).when().post("/api/users").then().statusCode(201);
		System.out.println("Done");
	}
}
