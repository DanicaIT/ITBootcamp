package Zavrsni;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutNewsMore {
	
	static WebDriver driver;
	public AboutNewsMore (WebDriver driver) {
		this.driver = driver;
	}
	
	
	private static List<WebElement> moenews() {
        return driver.findElements(By.xpath("//*[@id=\"maincontent\"]/div/div/div/table/tbody/tr[1]"));
	}
	
	private static WebElement mailicon(){
		return driver.findElement(By.className("iconochive-email"));
	}	
}
