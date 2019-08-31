package Zavrsni;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ABOUT {
	static WebDriver driver;
	public ABOUT(WebDriver driver) {
		this.driver = driver;
	}
	
	
	private static List<WebElement> news() {
        return driver.findElements(By.cssSelector("tr.forumRow a"));
	}
	private static WebElement moreOption(){
		return driver.findElement(By.linkText("[more]"));
	}	
	
	public List<WebElement> getnews(){
		return news();
	}
	public int numberNews() {
		return getnews().size();
	}
	public void News(Integer n){
		getnews().get(n).click();
	}
	
	public void  more() {
		moreOption().click();
	}
}

