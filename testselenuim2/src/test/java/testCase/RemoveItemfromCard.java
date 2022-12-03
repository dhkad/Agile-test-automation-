package testCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseTest;

public class RemoveItemfromCard extends BaseTest {
	
	public static boolean waitForElementToDisappear(WebElement element){
		 WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(3));
		 
		    try {
		    	wait.until((ExpectedConditions.visibilityOfElementLocated((By) element)));
		        return true;		    }
		    catch (Throwable t){
		        return false;
		    }
		}
	 
	
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


	 WebElement baskit= driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
	 Thread.sleep(500); 
	 baskit.click();
	 
	 WebElement remove = driver.findElement(By.id("remove-sauce-labs-backpack"));
	 Thread.sleep(500);
	 remove.click();
	 Thread.sleep(1000);
		
	 
	 boolean a= waitForElementToDisappear(remove);
	 
	 Reporter.log("RemoveItemFromCard", true);
	 
	 Assert.assertEquals(a, false, "Titles not equals");
	 
	
	
}
}
