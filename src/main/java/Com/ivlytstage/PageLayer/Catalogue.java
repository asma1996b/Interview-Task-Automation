package Com.ivlytstage.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class Catalogue{
		
		public Catalogue(WebDriver driver) {
		
				
				PageFactory.initElements(driver, this);
			}
			
			@FindBy(xpath="(//h4[contains(text(),'Laptops')])[2]")
			private WebElement catalogue_laptop_image_link;
			
			@FindBy(xpath="//button[contains(text(),'Load more products')]")
			private WebElement load_more_products_button;
			
			
			
			
			public void clickOnCatalogueLaptopImageLink(){
				catalogue_laptop_image_link.click();
			}
			
			public void clickOnLoadMoreProductsButton(){
				load_more_products_button.click();
			}

			public WebElement getLoad_more_products_button() {
				return load_more_products_button;
			}

			public void setLoad_more_products_button(WebElement load_more_products_button) {
				this.load_more_products_button = load_more_products_button;
			}
			
			
			
			
		}
