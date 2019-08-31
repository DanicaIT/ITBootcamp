package Zavrsni;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewsFeedSubject {
	
	static WebDriver driver;
    
    public NewsFeedSubject (WebDriver driver) {
        this.driver = driver;
    }
    
    private static WebElement edit() {
        return driver.findElement(By.linkText("edit"));
    }
    private static WebElement news() {
        return driver.findElement(By.linkText("news"));
    }
    private static WebElement replytothispost() {
        return driver.findElement(By.linkText("Reply to this post"));
    }
    private static WebElement goback() {
        return driver.findElement(By.linkText("Go Back"));
    }
    private static WebElement text() {
        return driver.findElement(By.linkText("text."));
    }
	
	

}
