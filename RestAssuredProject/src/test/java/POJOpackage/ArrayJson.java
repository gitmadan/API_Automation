package POJOpackage;

import static com.jayway.restassured.RestAssured.given;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class ArrayJson {

	public static void main(String[] args) {
		
		CustomerAddress[] address=new CustomerAddress[2];
		address[0]=new CustomerAddress();
		address[0].setHouseno("123");
		address[0].setSector("23");
		address[0].setCity("Gurgaon");
		address[0].setState("Haryana");

		
		address[1]=new CustomerAddress();
		address[1].setHouseno("123");
		address[1].setSector("24");
		address[1].setCity("Delhi");
		address[1].setState("Delhi");
		
		
		Customer c = new Customer();
		c.setCustomerFirstName("Deepak");
		c.setCustomerLastName("Pahuja");
		c.setAccountID("Dpahuja");
		c.setId("deepika");
		c.setAddress(address);

		Response res = given().contentType(ContentType.JSON).body(c).when()
				.post("http://localhost:3000/customerInformation");

		System.out.println(" Response code is " + res.getStatusCode());
		System.out.println(" Data is ");
		System.out.println(res.asString());
	}
	}
	
	
	
	

