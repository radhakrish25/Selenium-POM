package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Home_Page {
	
	private static WebElement element = null;

	 public static WebElement lnk_MyAccount(WebDriver driver){

	    element = driver.findElement(By.className("loginButton"));

	    return element;

	    }
			
	public static WebElement lnk_LogOut(WebDriver driver){
		
		WebElement element = driver.findElement(By.xpath("//*[@id='et_mobile_nav_menu']/a/span[2]"));
		Actions actions = new Actions(driver);
		
		actions.moveToElement(element).click().perform();
	
	    element = driver.findElement(By.xpath("//*[@id='menu-item-5493']/a"));

	 return element;

	    }

}
