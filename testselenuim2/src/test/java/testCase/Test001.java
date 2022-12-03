package testCase;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import base.BaseTest;

public class Test001 extends BaseTest {

	@Test
	public static void LoginTest() throws InterruptedException {

		WebElement email = driver.findElement(By.id("user-name"));
		Thread.sleep(500);
		email.sendKeys("standard_user");

		WebElement password = driver.findElement(By.id("password"));
		Thread.sleep(500);
		password.sendKeys("secret_sauce");

		WebElement con = driver.findElement(By.id("login-button"));
		con.click();
		Thread.sleep(1000);
		Reporter.log("LogIn", true);
		String expectedurl = "https://www.saucedemo.com/inventory.html";
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, expectedurl, "Titles not equals");}

	

		
	

}
