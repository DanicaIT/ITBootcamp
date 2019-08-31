package Zavrsni;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Collection {
	
	static WebDriver driver;
    
    public Collection (WebDriver driver) {
        this.driver = driver;
    }
    
    private static List<WebElement> sortby() {
        return driver.findElements(By.xpath("//*[@id=\"tabby-collection\"]/div/div[2]/div[1]/div[2]/div[4]/div/span/a[1]"));
    }
    private static List<WebElement> video() {
        return driver.findElements(By.className("tile-img"));
    }
    private static List<WebElement> buttons() {
        return driver.findElements(By.cssSelector("div.facell input"));
    }
    private static List<WebElement> moreOption() {
        return driver.findElements(By.cssSelector(""));
    }
    private static WebElement count() {
    	return driver.findElement(By.className("results_count"));
    	
    }
    

}
