package Zavrsni;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Advanced {
	
	static WebDriver driver;
    
    public Advanced (WebDriver driver) {
        this.driver = driver;
    }
    
    private static List<WebElement> inputcustomfield() {
        return driver.findElements(By.cssSelector("div.row div.col-sm-2 input"));
    }
    private static List<WebElement> input() {
        return driver.findElements(By.cssSelector("div.row div.col-sm-7 input"));
    }
    private static List<WebElement> dropdown(){
    	return driver.findElements(By.cssSelector("div.row div.col-sm-2 select"));
    }
    private static List<WebElement> Y_M_D(){
    	return driver.findElements(By.cssSelector("div.row div.col-sm-7 select"));
    }
    private static WebElement searchbutton() {
    	return driver.findElement(By.className("btn btn-primary"));
    }
    
    // Advanced Search returning JSON, XML, and more
    private static WebElement query() {
    	return driver.findElement(By.name("q"));
    }
    private static List<WebElement> fieldstoReturn() {
        return driver.findElements(By.linkText("avg_rating"));
    }
    private static List<WebElement> sortResults() {
    	return driver.findElements(By.name("sort[]"));
    }
    private static WebElement numberofResults() {
    	return driver.findElement(By.id("numresults"));
    }
    private static WebElement page() {
    	return driver.findElement(By.name("page"));
    }
    private static List<WebElement> format() {
    	return driver.findElements(By.name("output"));
    }
    
    
    

}
