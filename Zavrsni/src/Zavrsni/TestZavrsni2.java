package Zavrsni;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestZavrsni2 {
	
	public WebDriver driver;
	
	
	   @BeforeTest
	   public void setup() {
	          System.setProperty("webdriver.gecko.driver",
	                  "<enter full path of geckodriver>\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	       driver = new FirefoxDriver();
	   }
	   
	   
	// Test3
	   
	   @Test
	   
	   public void Test() throws Exception{
	   
	      driver.navigate().to(PageURLs.HOME_PAGE);
	      new NavigacioniMeni(driver).clickNavBar(1);
	      new NavigacioniMeni(driver).clickNavFeaturedTop(0);
	      
	      String url = driver.getCurrentUrl();
	      Thread.sleep(3000);
	    
	      new NavigacioniMeni(driver).clickLogo();
	      new MAIN(driver).iconLink(1);
	      Thread.sleep(3000);
	      Assert.assertTrue(driver.getCurrentUrl().equals(url));
			    
	       
	   }

}

