package Com.ivlytstage.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDisplayPage {
	
		public ProductDisplayPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		
		@FindBy(xpath="(//p[@class='MuiTypography-root MuiTypography-body1 css-9bgsxc'])[1]")
		private WebElement products_title_text;
		
		
		
		
		public void getProductTitle(){
			String title = products_title_text.getText();
			System.out.println("Product Name : "+ title);
		}
	}


