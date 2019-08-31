package Zavrsni;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Upload {
	
	static WebDriver driver;
    
    public Upload (WebDriver driver) {
        this.driver = driver;
    }
    
    private static WebElement uploadfiles() {
        return driver.findElement(By.className("buttonG btn btn-success"));
    }
    private static WebElement LiveMusicArchiveuploader() {
        return driver.findElement(By.className("btn btn-primary"));
    }
    private static WebElement question() {
        return driver.findElement(By.className("iconochive-question-dark"));
    }
    
    // Actions
    
    private void clickUploadFiles() {
    	uploadfiles().click();
		}
	private void clickLiveMusic() {
		LiveMusicArchiveuploader().click();
		}
	private void clickQuestion() {
		question().click();
		}

}
