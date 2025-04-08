package lesson_20_ReadPropertyFile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class ReadConfig {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		
		try {
			FileReader reader = new FileReader("C:\\Users\\Yashupriya\\eclipse-workspace\\JavaLessons\\config.properties");
			prop.load(reader);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String appURL = prop.getProperty("url");
		System.out.println(appURL);
		
		String appBrowser = prop.getProperty("browser");
		System.out.println(appBrowser);

	}

}
