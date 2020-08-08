package extraction;

import static com.jayway.restassured.RestAssured.given;

import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class ExtractionUsingContains {

	public static void main(String[] args) {

		Response res = given().contentType(ContentType.JSON).when().get("http://localhost:3000/employeeInformation");
		JSONArray js = new JSONArray(res.asString());
		int l = js.length();

		for (int i = 0; i < l; i++) {
			JSONObject j = js.getJSONObject(i);
			Set<String> allnames = j.keySet();

			for (String s : allnames) {
				if (s.contains("name")) {                   // contains word name
					System.out.println("Value of " + s + " inside " + i + " object is " + j.get(s).toString());
				}
			}

		}

	}

}
