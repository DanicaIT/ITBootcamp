package Zavrsni;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JOBS {
	
	static WebDriver driver;
	
	public JOBS (WebDriver driver) {
		this.driver = driver;
	}
	
	private static WebElement searchBar(){
		return driver.findElement(By.id("q"));
	}
	private static WebElement searchButton(){
		return driver.findElement(By.id("btn_search_jobs"));
	}
	private static WebElement advanced(){
		return driver.findElement(By.cssSelector("a#link_show_advanced_search span"));
	}
	private static List<WebElement> listElement(){
		return driver.findElements(By.className("job_title_link"));
	}
	
	// Actions
	
	public void clickSearchBar() {
		 searchBar().click();
	}
   public void inputsearchBar(String J){
       searchBar().sendKeys(J);
   }   
   public void clicksearchButton(){
       searchButton().click();
   }
   public void Advanced(){
       advanced().click();
   }
   
   public List<WebElement> getJob(){
   	return listElement();
   }
   public void listelement(Integer J) {
   	getJob().get(J).click();
   }
   
   public int jobsListSize() {
		 return listElement().size();
	 }
	
	
}
