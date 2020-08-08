package POJOpackage;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class ComplexJsonPostrequest {

	public static void main(String[] args) {

		CustomerAddress address = new CustomerAddress();
		address.setHouseno("123");
		address.setSector("23");
		address.setCity("Gurgaon");
		address.setState("Delhi");

		Customer c = new Customer();
		c.setCustomerFirstName("Deepak");
		c.setCustomerLastName("Pahuja");
		c.setAccountID("Dpahuja");
		c.setId("Deepak");
	//	c.setAddress(address);

		Response res = given().contentType(ContentType.JSON).body(c).when()
				.post("http://localhost:3000/customerInformation");

		System.out.println(" Response code is " + res.getStatusCode());
		System.out.println(" Data is ");
		System.out.println(res.asString());
	}

}