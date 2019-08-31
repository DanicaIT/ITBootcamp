package Zavrsni;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MAIN {
	
static WebDriver driver;
	
	public MAIN(WebDriver driver) {
		this.driver = driver;
	}
	
	private static List<WebElement> topCollections() {
        return driver.findElements(By.className("collection-stats"));
	}
	private static WebElement searchMainBar() {
		return driver.findElement(By.name("search"));
	}
	private static WebElement goButton() {
		return driver.findElement(By.xpath("/html/body/div/main/div/div[2]/div[2]/div[2]/div/form/div/button"));
	}
	private static List<WebElement> iconLink() {
        return driver.findElements(By.cssSelector("center.mt-big a"));
	}
	private static WebElement advancedSearchlink() {
		return driver.findElement(By.cssSelector("div#search_options a"));
	}
	private static WebElement seeMore() {
		return driver.findElement(By.cssSelector("div.pull-right a"));
	}

	
	// Actions
	
	public List<WebElement> getTopColllection(){
		return topCollections();
		
	}
	public void TopCollections(Integer TC){
		getTopColllection().get(TC).click();
	}
	public int numberElements() {
		return getTopColllection().size();
	}
	public void clickSearch(){
		searchMainBar().click();
	}	
	public void SearchMainBar(String main) {
		searchMainBar().sendKeys(main);
	}
	public void GoButton() {
		goButton().click();
	}
	public List<WebElement> getIcons(){
		return iconLink();
	}
	public void iconLink(Integer IL){
		getIcons().get(IL).click();
	}
	public void AdvancedSearchlink() {
		advancedSearchlink().click();
	}
	public void SeeMore() {
		seeMore().click();
	}
	
	public String getElementText() {
		return getTopColllection().get(0).getText();
	}
	
}

