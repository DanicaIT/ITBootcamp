package Zavrsni;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DONATE {
	
	static WebDriver driver;
	
	public DONATE (WebDriver driver) {
		this.driver = driver;
	}
	
	private static List<WebElement> buttonsD(){
		return driver.findElements(By.cssSelector("ul.donation-radio-list.donationlevel span.hit-area"));
	}
	private static WebElement inputMoney() {
		 return driver.findElement(By.cssSelector("input#amount_custom")); 
	 }
	
	// Actions
	
	
	public List<WebElement> getButtons(){
    	return buttonsD();
    }
    public void buttons(Integer n) {
    	getButtons().get(n).click();
    }
    public void clickInputMoney() {
		 inputMoney().click();
	 }
	 public void inputMoney(String M) {
		 inputMoney().sendKeys(M);
	 }	
}
