package Com.ivlytstage.TestLayer;


import org.testng.annotations.Test;

import Com.ivlytstage.PageLayer.Catalogue;
import Com.ivlytstage.PageLayer.Homepage;
import Com.ivlytstage.PageLayer.LoginPage;

import Com.ivlytstage.TestBase.TestBase;
import utility.Utility;


public class CatalogueTest extends TestBase{
	@Test(priority=1,enabled=true,description="Verify user can filter data by clicking on laptop")
	public void printAllProductNames() throws InterruptedException {
		Homepage home_obj = new Homepage(driver);
		Catalogue cat_obj = new Catalogue(driver);
		Utility util_obj = new Utility(driver);
		home_obj.clickOnCatelogueLink();
		Thread.sleep(2000);
		cat_obj.clickOnCatalogueLaptopImageLink();
		Thread.sleep(2000);
		util_obj.explicitWait(cat_obj.getLoad_more_products_button());
		Thread.sleep(2000);
		cat_obj.clickOnLoadMoreProductsButton();
		Thread.sleep(2000);
		util_obj.getAllProducts();
		Thread.sleep(2000);
		util_obj.getNamesOfProducts();
		
	}
	
	@Test(priority=2,enabled=true,description="Verify user can filter data by Brand")
	public void fliterProductsByBrand() throws InterruptedException {
		Homepage home_obj = new Homepage(driver);
		Catalogue cat_obj = new Catalogue(driver);
		Utility util_obj = new Utility(driver);
		home_obj.clickOnCatelogueLink();
		Thread.sleep(2000);
		cat_obj.clickOnCatalogueLaptopImageLink();
		Thread.sleep(2000);
		util_obj.clickOnBrand("dell");
		Thread.sleep(2000);
		
	}

}
