package org_json_package;

import static com.jayway.restassured.RestAssured.given;

import org.json.JSONArray;
import org.json.JSONObject;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class PostRequestWithArrayJson {

	public static void main(String[] args) {
		
		JSONObject info= new JSONObject();
		info.put(" Fname: " , "Gitika");
		info.put("Lname: ", "Madan");
		info.put("id", "gitmadan");
		info.put("ProjectId", "2801");
		
		
		JSONArray address=new JSONArray();
		
		JSONObject primary= new JSONObject();
		primary.put("City", "Delhi");
		primary.put("State", "Delhi");		
		
		
		JSONObject secondary= new JSONObject();
		secondary.put("City", "Sonipat");
		secondary.put("State", "Haryana");
		
		address.put(primary);
		address.put(secondary);
		
		
		JSONObject education= new JSONObject();
		education.put("graduation", "BTech");
		education.put("postgraduation", "MTech");
		
		
		
		info.put("Address", address);
		info.put("Education", education);
		info.put("Skills", "Testing");
		
	System.out.println(info);
	
		
		Response information=given()
        		.contentType(ContentType.JSON)
				.body(info.toString()).when().post("http://localhost:3000/employeeInformation");
		
		System.out.println("Status Code is: " +information.statusCode());
		System.out.println(" Data inserted is : ");
		System.out.println(information.asString());
		
		

	}

}
