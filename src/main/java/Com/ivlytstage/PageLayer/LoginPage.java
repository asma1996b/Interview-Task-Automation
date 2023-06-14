package Com.ivlytstage.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//div[@id='account-navbar-key']")
	private WebElement login_btn;
	
	@FindBy(xpath="//p[contains(text(),'Create an account')]")
		private WebElement account_link;
	
	
	@FindBy(xpath="//input[@placeholder='First name']")
	private WebElement firstname_textbox;
	
	@FindBy(xpath="//input[@placeholder='yourname@xyz.com']")
	private WebElement email_extbox;
	
	@FindBy(xpath="	//input[@type='password']")
	private WebElement password_extbox;
	
	@FindBy(xpath="	//input[@placeholder='Enter registered company name']")
	private WebElement company_textbox;
	@FindBy(xpath="	//div[@class='MuiBox-root css-1359lca']")
	private WebElement size_dropdown;
	
	@FindBy(xpath="(//button[@buttontype='primary'])[1]")
	private WebElement signin_btn;
	
	
	public void clickonLogin()
	{
		login_btn.click();
	}
	public void clickoncreateAccount()
		{
		account_link.click();
		}
	public void enterFirstname()
	{
		 firstname_textbox.sendKeys("Asma");
	}
	public void enteremail()
	{
		email_extbox.sendKeys("asmab3121@gmail.com");
	}
	
	public void enterpassword()
	{
		password_extbox.sendKeys("Asma@1996");
	}
	public void enterompanyname()
	{
		company_textbox.sendKeys("test");
	}
	public void clickonSelectSize()
	{
		size_dropdown.click();
	}
	public void clickOnsignin()
	{
		signin_btn.click();
	}
}


