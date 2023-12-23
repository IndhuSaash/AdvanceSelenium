package Shopperstackfileutility;

import java.io.FileInputStream;
import java.util.Properties;

import com.google.j2objc.annotations.Property;

public class ReadProperties {

	public String getDataFromProperty(String key) throws Throwable
	
	{
	
	FileInputStream fis = new FileInputStream("./src/test/resources/Shopper.properties");


	Properties pop = new Properties();
	pop.load(fis);
	String data = pop.getProperty(key);
	return data;
	
	

}
}
