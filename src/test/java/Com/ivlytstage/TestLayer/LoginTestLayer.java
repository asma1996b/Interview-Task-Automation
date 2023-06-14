package Com.ivlytstage.TestLayer;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Com.ivlytstage.PageLayer.LoginPage;
import Com.ivlytstage.TestBase.TestBase;
import utility.Utility;

public class LoginTestLayer extends TestBase{
	@Test
	public void verifyLoginFunctionality() throws InterruptedException
	{
		LoginPage login_obj=new LoginPage(driver);
		Utility util_obj = new Utility(driver);

		Thread.sleep(2000);
		//login_obj.clickonMulOption();
		login_obj.clickonLogin();
		Thread.sleep(5000);
		login_obj.clickoncreateAccount();
		Thread.sleep(2000);
		login_obj.enterFirstname();
		login_obj.enteremail();
		login_obj.enterpassword();
		login_obj.enterompanyname();
		//login_obj.clickonSize();
	//	Thread.sleep(5000);
	//	util_obj.SelectSize();
		Thread.sleep(5000);
	//	WebDriverWait wait=new 	WebDriverWait(10,TimeUnit.SECONDS);
		//wait.until(ExpectedConditions)
		login_obj.clickonSelectSize();
		Thread.sleep(2000);
		util_obj.selectSize(null);
		Thread.sleep(10000);
		util_obj.selectSize("1-10");
		

		login_obj.clickOnsignin();
		Thread.sleep(5000);
	}

}
