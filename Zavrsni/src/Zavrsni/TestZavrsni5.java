package Zavrsni;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestZavrsni5 {
	
	public static WebDriver driver;
	
	public static final String EMAIL = "foo@gmail.com";
	public static final String PASSWORD = "bar";
	public static final String ERROR_MESSAGE = "Email address and/or Password incorrect";
	
	public static WebElement logIn() {
 	   	 return driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div/div[2]/section[1]/p/a"));
 	   }
	
	
	   @BeforeTest
	   public void setup() {
	          System.setProperty("webdriver.gecko.driver",
	        		  "<enter full path of geckodriver>\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	       driver = new FirefoxDriver(); 
	   }
	  
	   
// Test 6
	   
	   @Test
	   
	   public void Test() throws Exception {
		   
		   driver.navigate().to(PageURLs.HOME_PAGE);
    	   new NavigacioniMeni(driver).clickSingIn();
    	   Assert.assertTrue(logIn().isDisplayed());
    	   
    	   new LogIn(driver).inputEmail(EMAIL);
    	   Thread.sleep(2000);
    	   new LogIn(driver).inputPassword(PASSWORD);
    	   Thread.sleep(2000);
    	   new LogIn(driver).clickLogin();
    	   
    	   Assert.assertTrue(driver.getPageSource().contains(ERROR_MESSAGE));
		   
		   
	   }

}
