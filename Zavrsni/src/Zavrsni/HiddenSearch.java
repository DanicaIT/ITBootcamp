package Zavrsni;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HiddenSearch {
	
	static WebDriver driver;
    
    public HiddenSearch (WebDriver driver) {
        this.driver = driver;
    }
    
    private static List<WebElement> clicableImage() {
        return driver.findElements(By.className("screenshot"));
    }
    private static List<WebElement> clicableLink() {
        return driver.findElements(By.cssSelector("div.result-item-heading a"));
    }
    
    
    
    public void clicableImages(Integer I){
    	clicableImage().get(I).click();
    }
    public void clicableLinks(Integer L){
    	clicableLink().get(L).click();
    }
    
}
