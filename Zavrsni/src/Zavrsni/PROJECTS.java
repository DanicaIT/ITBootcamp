package Zavrsni;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PROJECTS {
	
	static WebDriver driver;
	
	public PROJECTS (WebDriver driver) {
		this.driver = driver;
	}
	private static List<WebElement> project(){
		return driver.findElements(By.cssSelector("div.col-sm-3 a img"));
	}
	
	// Actions 
	
	public List<WebElement> getprojectpicture(){
		return project();
	}
	public int PictureNumber() {
		return  project().size();
	}

}
