package Zavrsni;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestZavrsni {
	
	public WebDriver driver;
	public static final String TEXT = "ITEMS";
	
	   @BeforeTest
	   public void setup() {
	          System.setProperty("webdriver.gecko.driver",
	        		  "<enter full path of geckodriver>\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	       driver = new FirefoxDriver();
	   }
	   
	   
// Test1  
	   
	   @Test
	   
	   public void Test() throws Exception{
		   
		
	       driver.navigate().to(PageURLs.HOME_PAGE);
	       MAIN vel = new MAIN(driver);
	       Assert.assertTrue(vel.numberElements()>=20);
	       
	       List<WebElement> text = driver.findElements(By.cssSelector("div.item-ia.collection-ia"));
	        for(WebElement i : text)
	     
	        Assert.assertTrue(i.getText().toLowerCase().contains(TEXT));
	        driver.close();	
	        
	   }

}
