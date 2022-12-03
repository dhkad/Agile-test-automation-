package utilities;


import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class readPropFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("C:\\Users\\Dhifaf\\Documents\\test_auto\\test_agil\\Selenium_dh_test\\testselenuim\\src\\test\\resources\\configfile\\config.properties");
		Properties pr = new Properties();
		pr.load(fr);
		System.out.print(pr.getProperty("browser"));
	}

}
