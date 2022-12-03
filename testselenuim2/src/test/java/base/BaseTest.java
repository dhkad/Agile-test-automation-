package base;


import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	public static WebDriver driver;
	public static Properties p = new Properties();
	public static FileReader fr;
	@BeforeTest
	public void setUp() throws IOException {
		if (driver == null) {
			FileReader fr = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfile\\config.properties");
			p.load(fr);
			

		}
		if (p.getProperty("browser").equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    	    
			driver.get(p.getProperty("testurl"));
			
			
		
			
		}
		
		if (p.getProperty("browser").equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.get(p.getProperty("testurl"));
			driver.manage().window().maximize();
			
		}
				
	}
	@AfterTest
	public void tearDown() {
		 
	       
	    //driver.quit();
	   // driver.close();
	        
	        
		
		
	}

}
