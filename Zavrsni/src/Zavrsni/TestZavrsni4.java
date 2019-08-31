package Zavrsni;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestZavrsni4 {
	

	public WebDriver driver;

	   @BeforeTest
	   public void setup() {
	          System.setProperty("webdriver.gecko.driver",
	        		  "<enter full path of geckodriver>\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	       driver = new FirefoxDriver();
	   }
	   
// Test 5
	   
	   
	   @Test
	   
	   public void Test() throws Exception{
		   
		   driver.navigate().to(PageURLs.HOME_PAGE);
		   new NavigacioniMeni(driver).clickUpload();
		   String pageText = driver.getPageSource();
		   Assert.assertTrue(pageText.contains("Log in"));
		   Assert.assertTrue(pageText.contains("Sign up"));
           Thread.sleep(3000);
		   
	   }

}
