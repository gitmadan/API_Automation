package org_json_package;

import static com.jayway.restassured.RestAssured.*;

import org.json.JSONObject;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class PostWithComplexJson {

	public static void main(String[] args) {

        JSONObject basicInfo= new JSONObject();
        basicInfo.put("firstname", "Gitika");
        basicInfo.put("lastname", "Madan");
        basicInfo.put("id", "gpahuja");
        basicInfo.put("domain", "Testing");
        
        JSONObject address= new JSONObject();
        address.put("H.number", "12345");
        address.put("city", "sonipat");
        address.put("state", "Haryana");
        
        basicInfo.put("Address", address);
        System.out.println(basicInfo);
        
        Response info=
        		given()
        		.contentType(ContentType.JSON)
        		.body(basicInfo.toString())
        		.when()        		
        		.post("http://localhost:3000/employeeInformation");
        //.then()
       //.status
        
        System.out.println("Status code is : " +info.statusCode());
        System.out.println( info.asString());
        
        
	}

}
