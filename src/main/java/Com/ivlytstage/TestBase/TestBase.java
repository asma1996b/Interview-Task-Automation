package Com.ivlytstage.TestBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
public static WebDriver driver;
@BeforeMethod
public void setup()
{
	String br="ChRome";
	if(br.equalsIgnoreCase("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
	else {
		System.out.println("please provide correct browser ");
		
	}
	driver.get("https://livlytstage.site/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	
}
@AfterMethod
public void tearDown()
{
	driver.quit();
}
}
