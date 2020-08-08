package existingJson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.regex.Pattern;

import org.json.JSONObject;
import org.json.JSONTokener;

public class ExistingJsonPostrequest {

	public static void main(String[] args) throws FileNotFoundException {
	
		File f=new File("../RestAssuredProject/payload_existing.json");
		FileReader fr=new FileReader(f);
		JSONTokener js=new JSONTokener(fr);		
		JSONObject data =new JSONObject(js);
		
		String value =data.toString().replaceAll(Pattern.quote("{{" +"id"+ "}}"), "d3006");    //giving value to id 
		
		System.out.println(value);

	}

}
