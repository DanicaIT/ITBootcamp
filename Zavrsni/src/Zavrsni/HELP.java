package Zavrsni;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HELP {
	
	static WebDriver driver;
	
	public HELP (WebDriver driver) {
		this.driver = driver;
	}
	
	private WebElement searchhelp() {
		return driver.findElement(By.id("query"));
	}
	private static List<WebElement> buttonsH(){
		return driver.findElements(By.className("blocks-item-title"));
	}
	private WebElement singInHelp() {
		return driver.findElement(By.cssSelector("div.nav-wrapper a.login"));
	}
	
	// Actions 
	public void searchHelp(String H) {
		searchhelp().sendKeys(H);
	}
	public void enter() {
		searchhelp().sendKeys(Keys.ENTER);
    }
	public List<WebElement> getbuttons(){
		return buttonsH();
	}
	public void buttons(Integer n) {
		buttonsH().get(n).click();
	}
	
	public void singIn() {
		singInHelp().click();
	}

}
