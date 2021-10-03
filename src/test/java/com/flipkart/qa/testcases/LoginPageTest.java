package com.flipkart.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.qa.base.TestBase;
import com.flipkart.qa.pages.HomePage;
import com.flipkart.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage loginpage;
	//loginpage redirect to homepage so we create reference variable of homepage
	HomePage homePage;
	
	
	//1st we call base class constructor beacuse all the property defined there
	
	public LoginPageTest() {
		
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		//we create loginpage class object so that we can access all the function and method of login page class
	loginpage=new LoginPage();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest() {
		String title=loginpage.validateLoginPageTitle();
		System.out.println(title);
		Assert.assertEquals(title,"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
	}     
	
	@Test(priority=2)
	public void flipKartLogoImageTest() {
		Boolean flipkartImage= loginpage.validateFlipkartImage();
		Assert.assertTrue(flipkartImage);
		
	}
	
	@Test(priority=3)
	public void LoginTest() {
		homePage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	
	@AfterMethod
	public void tearDown() {
		
		wd.quit();
	}

}
