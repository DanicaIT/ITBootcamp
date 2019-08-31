package Zavrsni;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigacioniMeni {
	
	static WebDriver driver;
	public NavigacioniMeni(WebDriver driver) {
		this.driver = driver;
	}
	
	// HiddenIcons
	private static List<WebElement> navBar() {
        return driver.findElements(By.cssSelector("li.dropdown.dropdown-ia.pull-left"));
    }
    private static List<WebElement> navPictures() {
        return driver.findElements(By.cssSelector("div.widgets"));
    }
    private static List<WebElement> navFeatured_Top() {
        return driver.findElements(By.cssSelector("div.linx a"));
    }
    private static WebElement waybackMachine() {
    	return driver.findElement(By.cssSelector("div.col-sm-6 a"));
    }
    private static WebElement navSearch() {
    	return driver.findElement(By.id("nav-wb-url"));
    }
    
    // Actions
    
    public List<WebElement> getnavBar(){
    	return navBar();
    }
    public void clickNavBar(Integer index) {
    	getnavBar().get(index).click();
    }
    
    
    public List<WebElement> getNavPictures(){
    	return navPictures();
    }
    // pictures
    public void clickNavPictures1() {
    	getNavPictures().get(0).click();
    }
    public void clickNavPictures2() {
    	getNavPictures().get(1).click();
    }
    
    
    
    public List<WebElement> getNavFeaturedTop(){
    	return navFeatured_Top();
    }
    public void clickNavFeaturedTop(Integer index) {
    	getNavFeaturedTop().get(index).click();
    }
    
    public void clickwaybackMachine() {
    	waybackMachine().click();
    }
    public void clicknavSearch(String text) {
    	navSearch().sendKeys(text);
    }
    public void enter() {
    	navSearch().sendKeys(Keys.ENTER);
    }
    
    // NavIcons
    
	private static WebElement logo() {
		return driver.findElement(By.className("iconochive-logo"));
	}
	private static WebElement singIn() {
		return driver.findElement(By.xpath("//*[@id=\"navwrap2\"]/div[2]/ul[1]/li[10]/a/span[3]"));
	}
	private static WebElement upload() {
		return driver.findElement(By.className("iconochive-upload"));
	}
	private static WebElement search2() {
		return driver.findElement(By.id("search-bar-2"));
	}
	private static WebElement username() {
		return driver.findElement(By.xpath("//*[@id=\"user-menu\"]/span"));
	}
	
	// Actions 
	
	public void clickLogo() {
		logo().click();
	}
	public void clickSingIn() {
		singIn().click();
	}
	public void clickUpload() {
		upload().click();
	}
	public void myUsername() {
		username().click();
	}
	public void clickSearch2() {
		search2().click();
	}
	public void inputSearch2(String text2) {
		search2().sendKeys(text2);
	}
	
	// PageLinks
	private List<WebElement> icons() {
		return driver.findElements(By.cssSelector("ul#nav-abouts a"));
	}
	
	public void clickOnIcons(Integer n) {
		icons().get(n).clear();
	}


}


