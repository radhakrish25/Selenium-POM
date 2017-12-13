package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_page {

	private static WebElement element = null;
	
	//Initial homepage
	 
	 public static WebElement lnk_MyAccount(WebDriver driver){
	 
	    element = driver.findElement(By.className("loginButton"));
	 
	    return element;
	 
	    }
	 
	 public static WebElement lnk_LogOut(WebDriver driver){
	 
	    element = driver.findElement(By.xpath("//*[@id='menu-item-5493']/a"));
	 
	 return element;
	 
	    }

}
