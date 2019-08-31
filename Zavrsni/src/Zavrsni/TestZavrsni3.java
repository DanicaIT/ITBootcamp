package Zavrsni;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestZavrsni3 {
	

	public static WebDriver driver;
	public static final String TEXT = "qa";
	public static final String SEARCH = "?query=qa";
	
	   @BeforeTest
	   public void setup() {
	          System.setProperty("webdriver.gecko.driver",
	        		  "<enter full path of geckodriver>\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	       driver = new FirefoxDriver();
	   }
	   
	   public static WebElement drop() {
		   	 return driver.findElement(By.id("search_options"));
		    }
	   
	   
// Test4	   
	   
	   @Test
	   
	   public void Test() throws Exception{
		   
	       driver.navigate().to(PageURLs.HOME_PAGE);
	       new MAIN(driver).clickSearch();
	       Assert.assertTrue(drop().isDisplayed());
	       
	       new MAIN(driver).SearchMainBar(TEXT);
	       Thread.sleep(3000);
	       new MAIN(driver).GoButton();
	       Thread.sleep(3000);
	       Assert.assertTrue(driver.getCurrentUrl().contains(SEARCH));
	       	   
	   }

}
