package ie.rccourse;

import java.io.IOException;
import java.io.InputStream;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

public class PropertiesTest {

	public static void main(String[] args) {
		
		//Locale locale = Locale.US; //locale names are standard
		
		Locale locale = new Locale("ga","IE"); // creating new local from scratch
		
		ResourceBundle bundle = ResourceBundle.getBundle("resources.messages", locale); // pass in local when load resources
		
		String header = bundle.getString("heading");
		String greeting = bundle.getString("greeting");
		String username ="Grainne";
		int recordCount = 99;
		
		greeting = String.format(greeting, username); // string.format is the one prob less used but more powerful
		
		
		String result2 = MessageFormat.format("There were {0} records returned by {1}", recordCount, username);
		// message format is the other way to do this. curly bracket 0 is a placeholder and will take recordcount and 
		//put it into 0 and take {1} and take username here. this is prob the most used one
		
		//double d = 3.1459873096;
		
		String s = String.format("Pi to 3 decimal places is %.3f", Math.PI); // can configure formats using this, ie.how many decimal places to use etc
		System.out.println(s);
		
		String result = bundle.getString("result");
		result = String.format(result, recordCount, username);
		
		String depart = bundle.getString("depart");
		String prompt = bundle.getString("prompt");
		
		String newstring = bundle.getString("newstring");
		
		System.out.println(header);
		System.out.println(greeting);
	
		System.out.println(result);
		System.out.println(depart);
		System.out.println(prompt);
		System.out.println(newstring);
		System.out.println(result2);
	/*	
		//Properties properties = new Properties();
		
		//InputStream is = PropertiesTest.class
					//.getResourceAsStream("messages.properties");
	 
	 try {
			properties.load(is);
		
		String heading = (String) properties.get("heading");
		String greeting = (String) properties.get("greeting");
		String depart = (String) properties.getProperty("depart");
		
		System.out.println(heading);
		System.out.println(greeting);
		System.out.println(depart);
		
		//System.out.println("Unlocalizable string");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */
		
	}

}
