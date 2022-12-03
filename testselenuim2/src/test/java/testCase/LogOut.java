package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseTest;

public class LogOut extends BaseTest{
	
	  @Test
	  public static void LogoutTest() throws InterruptedException {
		  
			WebElement email = driver.findElement(By.id("user-name"));
			Thread.sleep(500);
			email.sendKeys("standard_user");

			WebElement password = driver.findElement(By.id("password"));
			Thread.sleep(500);
			password.sendKeys("secret_sauce");

			WebElement con1 = driver.findElement(By.id("login-button"));
			con1.click();
			WebElement con2 = driver.findElement(By.id("react-burger-menu-btn"));
			Thread.sleep(500);
			con2.click();

			

			WebElement logout = driver.findElement(By.id("logout_sidebar_link"));
			Thread.sleep(500);
			logout.click();
			Reporter.log("LogOut", true);
			String expectedurl = "https://www.saucedemo.com/";
			String currentUrl = driver.getCurrentUrl();
			Assert.assertEquals(currentUrl, expectedurl, "Titles not equals");

	  }
	 
}
