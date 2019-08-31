package Zavrsni;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PEOPLE {
	
	static WebDriver driver;
	
	public PEOPLE (WebDriver driver) {
		this.driver = driver;
	}
	
	private static List<WebElement> listpeople(){
		return driver.findElements(By.className("div.bio div"));
	}
	
	//Actions
	
	public List<WebElement> getPeoples() {
		return listpeople(); 
    }
    public void listpeople(Integer p) {
        listpeople().get(p).getText();
    }
    
    public void text(){
    	System.out.println(listpeople().size());
    	
    	List<WebElement> b = driver.findElements(By.cssSelector("div.bio b"));	
		for(WebElement var:b) {
			System.out.println(var.getText());
			
		}
		
		List<WebElement> i = driver.findElements(By.cssSelector("div.bio i"));	
		for(WebElement var1:i) {
			System.out.println(var1.getText());
			
		}
    }

}
