package gaming;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class gaming {

	public static WebDriver  driver;
	
	public static String url="https://www.thegoodguys.com.au/LogonForm?myAcctMain=1&catalogId=30000&langId=-1&storeId=900";
	@BeforeTest
	public static void launchApp(){
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().deleteAllCookies();
		  driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		  driver.get(url);
	}
	@AfterTest
	public static void closeApp(){
		
		driver.close();
		
	}
}

