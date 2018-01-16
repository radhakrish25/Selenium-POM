package automationframework;

  	import java.util.concurrent.TimeUnit;
  	import org.openqa.selenium.WebDriver;
  	import org.openqa.selenium.chrome.ChromeDriver;

  	// Import package pageObject.

    import pageObjects.Home_Page;
    import pageObjects.Login_Page;

public class POM_TC {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.zittyonline.com");

	// Use page Object library now

		Home_Page.lnk_MyAccount(driver).click();

		Login_Page.txtbx_UserName(driver).sendKeys("0764354255");

		Login_Page.txtbx_Password(driver).sendKeys("1511");

		Login_Page.btn_LogIn(driver).click();
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
		
		Home_Page.Opn_Sidebar(driver).click();
		
		Home_Page.lnk_LogOut(driver).click(); 

	driver.quit();

	}

}

