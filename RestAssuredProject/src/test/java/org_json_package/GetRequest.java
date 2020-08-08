package org_json_package;

import static com.jayway.restassured.RestAssured.given;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class GetRequest {

	public static void main(String[] args) {
		Response res=given().contentType(ContentType.JSON).when().get("http://localhost:3000/friendslist");

		System.out.println("Status code is " + res.statusCode());
		System.out.println(" data of api is ");
		System.out.println(res.asString());
		System.out.println(res.getTime());
		System.out.println(res.toString());   //shows that  tostring does not convert the data in string value
	
		given().contentType(ContentType.JSON).when().get("http://localhost:3000/friendslist").then().statusCode(200);
		System.out.println("Status code matched which is  " + res.statusCode());

	}

}
