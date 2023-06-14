package Com.ivlytstage.TestLayer;

import org.testng.annotations.Test;

import Com.ivlytstage.PageLayer.Catalogue;
import Com.ivlytstage.PageLayer.Homepage;
import Com.ivlytstage.PageLayer.ProductDisplayPage;
import Com.ivlytstage.TestBase.TestBase;
import utility.Utility;

public class ProductDisplayTest extends TestBase {
	@Test(priority=1,enabled=true,description="Verify user can redirected to product display page")
	public void ProductDisplayLandingPage() throws InterruptedException {
		Homepage home_obj = new Homepage(driver);
		Catalogue cat_obj = new Catalogue(driver);
		Utility util_obj = new Utility(driver);
		ProductDisplayPage prod_obj = new ProductDisplayPage(driver);
		
		home_obj.clickOnCatelogueLink();
		Thread.sleep(2000);
		cat_obj.clickOnCatalogueLaptopImageLink();
		Thread.sleep(2000);
		util_obj.getAllProducts();
		Thread.sleep(2000);
		util_obj.clickOnFirstProduct();
		Thread.sleep(2000);
		util_obj.getLandingPageTitle();
		Thread.sleep(2000);
		prod_obj.getProductTitle();
		
		
	}
}


