package org_json_package;

import org.json.JSONObject;

import static com.jayway.restassured.RestAssured.*;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class PostRequest {

	public static void main(String[] args) {
		
		JSONObject data=new JSONObject();
		data.put("Firstname","Gitika");
		data.put("Lastname", "Madan");
		data.put("id", "geet");
		System.out.println(data);
		
		Response res=
	     given()
		.contentType(ContentType.JSON)
		.body(data.toString())
		.when()
		.post("http://localhost:3000/studentsInformation");
		
		System.out.println("Response code is: " +res.statusCode() );
		System.out.println(" data is");
		System.out.println(res.asString());
		System.out.println("                      ");
		System.out.println("*******************************************************************************");
		
		
		

	}

	
	}


