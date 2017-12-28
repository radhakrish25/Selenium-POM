package automationframework;


    import java.util.concurrent.TimeUnit;

    import org.openqa.selenium.WebDriver;

    import org.openqa.selenium.firefox.FirefoxDriver;

    // Import package pageObject.*

    import pageObjects.Home_Page;

    import pageObjects.Login_Page;

public class POM_TC {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {

	driver = new FirefoxDriver();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	driver.get("http://www.zittyonline.com");

	// Use page Object library now

	Home_Page.lnk_MyAccount(driver).click();

	Login_Page.txtbx_UserName(driver).sendKeys("0764354255");

	Login_Page.txtbx_Password(driver).sendKeys("1511");

	Login_Page.btn_LogIn(driver).click();

	System.out.println(" Login Successfully, now it is the time to Log Off buddy.");

	Home_Page.lnk_LogOut(driver).click(); 

	driver.quit();

	}

}

