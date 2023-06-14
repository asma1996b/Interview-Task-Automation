package utility;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Com.ivlytstage.TestBase.TestBase;

public class Utility extends TestBase{
	public static List <WebElement> products;
	public Utility(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void selectSize(String size) throws InterruptedException
	{
		
		List <WebElement> options= driver.findElements(By.xpath("//div[@class='MuiBox-root css-1657hfs']"));
		for(WebElement option :options){
		//	System.out.println(option.getText());
			if(option.getText().equalsIgnoreCase(size)){
				option.click();
				break;
			}
		}
	}
	public void explicitWait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void getAllProducts() {
		products= driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 css-1116d7h']"));
	}
	
	public void clickOnFirstProduct() {
		products.get(0).click();
	}
	
	
	public void getNamesOfProducts() throws InterruptedException
	{
		for(WebElement product : products){
			System.out.println(product.getText());
			
		}
		int count = products.size();
		System.out.println(count);

	}
	
	
	
	public void clickOnBrand(String brandName) throws InterruptedException
	{

		List <WebElement> brands= driver.findElements(By.xpath("(//label)"));
		for(WebElement brand : brands){
			Thread.sleep(2000);
			if(brand.getText().equalsIgnoreCase(brandName)){
				brand.click();
				break;
			}
		}
		

	}
	public void getLandingPageTitle() {
		String url =driver.getCurrentUrl();
		System.out.println("Page URL : "+url);
	}
	
}



	
	
	
