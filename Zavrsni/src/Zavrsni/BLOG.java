package Zavrsni;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BLOG {
	static WebDriver driver;
	
	public BLOG (WebDriver driver) {
		this.driver = driver;
	}
	
	private static List<WebElement> navigation(){
		return driver.findElements(By.cssSelector("ul#menu-menu li"));
	}
	private static List<WebElement> FaceTvit(){
		return driver.findElements(By.cssSelector("div.archive-sharing-widget a"));
	}
	private static WebElement dropdown() {
		return driver.findElement(By.id("archives-dropdown-2"));
	}
	private static WebElement searchfield() {
		return driver.findElement(By.id("s"));
	}
	private static WebElement searchbutton() {
		return driver.findElement(By.id("searchsubmit"));
	}
	private static List<WebElement> dinamElementi(){
		return driver.findElements(By.cssSelector("h2.entry-title a"));
	}
	
	// Actions
	
	public List<WebElement> getnavMenu(){
		return navigation();
	}	
	public void navigationMenu(Integer n) {
		getnavMenu().get(n).click();
	}
	
	public List<WebElement> getFaceTvit(){
		return FaceTvit();
	}	
	public void clickFacebook() {
		getFaceTvit().get(0).click();
	}
	public void clickTwiter() {
		getFaceTvit().get(1).click();
	}
	// for drop down
	public void clickDropDown(String searchTerm) {
		Select drop = new Select(dropdown());
		drop.selectByVisibleText(searchTerm);
	}
	public void searchField(String s) {
		searchfield().sendKeys(s);
	}
	public void searchButton() {
		searchbutton().click();
	}
	public void dinamicElementi(Integer n) {
		dinamElementi().get(n).click();
	}

}
