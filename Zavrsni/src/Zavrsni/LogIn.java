package Zavrsni;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn {
	
static WebDriver driver;
	
	public LogIn (WebDriver driver) {
		this.driver = driver;
	}
	
	private static WebElement email() {
		return driver.findElement(By.name("username"));
	}
	private static WebElement password() {
		return driver.findElement(By.name("password"));
	}
	private WebElement loginbutton() {
		return driver.findElement(By.name("submit-to-login"));
	}
	private WebElement singupforFree() {
		return driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div/div[2]/section[1]/p/a"));
	}
	private WebElement forgotpassword() {
		return driver.findElement(By.cssSelector("span.reset-password a"));
	}
	private WebElement keepmeLoggedIn() {
		return driver.findElement(By.name("remember"));
	}
	private WebElement termsOfService() {
		return driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/section[2]/form/fieldset[2]/div/a"));
	}

	
	
	// Actions
	public void inputEmail(String textE) {
        email().sendKeys(textE);
    }
    public void inputPassword(String textP) {
        password().sendKeys(textP);
    }
    public void clickLogin() {
        loginbutton().click();
    }
    public void singUpForFree() {
    	singupforFree().click();
    }
    public void forgotPassword() {
    	forgotpassword().click();
    }
    public void keepMeLoggedIn() {
    	keepmeLoggedIn().getText();
    }
    public void clickTerms(){
    	termsOfService().click();
    }
    
    public void switchNewWindow(){
    	Set<String> win = driver.getWindowHandles();
    	Iterator<String> window = win.iterator();
    	while(window.hasNext()) {
    		driver.switchTo().window(window.next());
    	}
    	
    }
    	
    
 }
