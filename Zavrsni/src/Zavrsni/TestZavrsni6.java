package Zavrsni;

import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestZavrsni6 {
	
	public static WebDriver driver;
	public static final String SEARCH = "terms";
	public static WebElement forgotPassword() {
	   	 return driver.findElement(By.cssSelector("span.reset-password a"));
	}
	
	
	
	   @BeforeTest
	   public void setup() {
	          System.setProperty("webdriver.gecko.driver",
	        		  "<enter full path of geckodriver>\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	       driver = new FirefoxDriver();
	   }
	   
// Test 7
	   
	   @Test 
	   
	   public void Test() throws Exception {
		   driver.navigate().to(PageURLs.HOME_PAGE);
    	   new NavigacioniMeni(driver).clickSingIn();
    	  
    	   Assert.assertTrue(forgotPassword().isDisplayed());
    	   new LogIn(driver).singUpForFree();
    	   Thread.sleep(2000);
    	   new LogIn(driver).clickTerms();
    	   Thread.sleep(2000);
    	   new LogIn(driver).switchNewWindow();
    	   System.out.print(driver.getCurrentUrl());
    	   Assert.assertTrue(driver.getCurrentUrl().contains(SEARCH));
    	   
		   
	   }

}
