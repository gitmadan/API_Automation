package extraction;

import static com.jayway.restassured.RestAssured.*;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class ExtractionOfValue {

	public static void main(String[] args) {

		Response res = given().contentType(ContentType.JSON).when().get("http://localhost:3000/employeeInformation");

		/********** extracting single value using JSONPath *****************/
		// System.out.println(res.asString());
		// String domain=res.jsonPath().get("[4].Skills");
		// System.out.println(domain);

		/********** extracting multiple values using org.json *****************/
		JSONArray js = new JSONArray(res.asString());
		JSONObject ob = js.getJSONObject(4);
		String skills = ob.get("Skills").toString();
		System.out.println("Single Extracted value is " + skills);

		System.out.println("*************");

		System.out.println("existing list of ids are");
		int l = js.length();
		for (int i = 0; i < l; i++) {
			try {
				JSONObject j = js.getJSONObject(i);
				System.out.println(j.get("id"));
			} catch (Exception e) {
			}
		}

		
	}

}
