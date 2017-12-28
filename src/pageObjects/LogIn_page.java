package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page {
	
	private static WebElement element = null;
	
	public static WebElement txtbx_UserName(WebDriver driver){

	element = driver.findElement(By.xpath("//html/body/div[7]/div[2]/form/div[2]/input[1]"));

	return element; }

    public static WebElement txtbx_Password(WebDriver driver){

	element = driver.findElement(By.xpath("//html/body/div[7]/div[2]/form/div[2]/input[2]"));

	return element;}

    public static WebElement btn_LogIn(WebDriver driver){

    	element =  driver.findElement(By.className("loginButton"));

    	return element;}
    
}
