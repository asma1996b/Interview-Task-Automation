package Com.ivlytstage.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
		public Homepage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		
		
		@FindBy(xpath="//span[normalize-space()='Login']")
		private WebElement home_login_link;
		

		@FindBy(xpath="//span[normalize-space()='Catalogue']")
		private WebElement home_catalogue_link;
		
		
		public void clickOnHomeLoginLink(){
			home_login_link.click();
		}
		
		public void clickOnCatelogueLink(){
			home_catalogue_link.click();
		}
		
	}



