package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseTest;

public class Test002 extends BaseTest{
	@Test
	public static void cardTest() throws InterruptedException  {

	WebElement email = driver.findElement(By.id("user-name"));
	Thread.sleep(500);
	email.sendKeys("standard_user");

	WebElement password = driver.findElement(By.id("password"));
	Thread.sleep(500);
	password.sendKeys("secret_sauce");

	WebElement con = driver.findElement(By.id("login-button"));
		con.click();
	WebElement addtocard = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
	Thread.sleep(100);
	addtocard.click();


	 WebElement bascit= driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
	 Thread.sleep(500); 
	 bascit.click();
	 
	 Reporter.log("AddItemToCard", true);
	 String expectedur2 = "https://www.saucedemo.com/cart.html";
	 String currentUr2 = driver.getCurrentUrl();
	 Assert.assertEquals(currentUr2, expectedur2, "Titles not equals");
	
	 
	
}

}
