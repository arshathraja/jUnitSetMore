import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class Reading_PropertiesFiles {

	
	public static void main(String[] args) throws IOException {
	System.out.println(System.getProperty("user.dir"));
		//inbuilt class called properties
		Properties prop = new Properties();
		FileInputStream ip= new FileInputStream(System.getProperty("user.dir")+"\\src\\readingproertiesfiles\\Employee.properites");
		prop.load(ip);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("dob"));
		System.out.println(prop.getProperty("age"));
		System.out.println(prop.getProperty("city"));
		System.out.println(prop.getProperty("hobbies"));		
	}

}
