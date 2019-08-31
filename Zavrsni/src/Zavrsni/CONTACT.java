package Zavrsni;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CONTACT {
	
static WebDriver driver;
	
	public CONTACT(WebDriver driver) {
		this.driver = driver;
	}
	private static List<WebElement> mape() {
		return driver.findElements(By.cssSelector("div.col-md-9 img"));
	}
	public void Mape(Integer m) {
		mape().get(m).click();
	}

}
