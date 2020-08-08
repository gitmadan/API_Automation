package POJOpackage;

import static com.jayway.restassured.RestAssured.*;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import POJOpackage.Customer;

public class SimpleJsonPostRequest {
	
	public static void main(String[] args) 
	{
	
		Customer c=new Customer();				
		c.setCustomerFirstName("Gitika");
		c.setCustomerLastName("Madan");
		c.setAccountID("gmadan");
		c.setId("geet");
			
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(c)
		.when()
		.post("http://localhost:3000/customerInformation");
		
		System.out.println(" Response code is " +res.getStatusCode());
		System.out.println(" Data is " );
		System.out.println(res.asString());
	}
	
	
	
	

}
