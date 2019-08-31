package Zavrsni;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutContribute {
	
	static WebDriver driver;
    
    public AboutContribute (WebDriver driver) {
        this.driver = driver;
    }
    private static List<WebElement> listofContributors() {
        return driver.findElements(By.cssSelector("div.items_list_img a"));
    }
    private static List<WebElement> graficon() {
        return driver.findElements(By.className("flot-overlay"));
    }
    private static List<WebElement> relatedcollections() {
        return driver.findElements(By.cssSelector("div.topinblock b a"));
    }
    private static WebElement table(){
    	return driver.findElement(By.className("stats-table"));
    }    

}
