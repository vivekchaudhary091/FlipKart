package com.flipkart.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.qa.base.TestBase;
import com.flipkart.qa.pages.AddToCartPage;
import com.flipkart.qa.pages.HomePage;
import com.flipkart.qa.pages.LoginPage;

public class AddToCartPageTest extends TestBase{
	HomePage homePage;
	LoginPage loginPage;
	AddToCartPage addToCartPage;
	
	public AddToCartPageTest() {
		super();
	}
@BeforeMethod
	 public void setUp() {
	    	initialization();
	    	loginPage= new LoginPage();
	    	homePage =new HomePage();
	    	addToCartPage =new AddToCartPage();
	    	homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	    	homePage.clickOnMobileLink();
	    }

@Test
public void AddToCartTest() {
	addToCartPage.addToCart();
}

@AfterMethod
public void tearDown() {
	wd.quit();
}

}
