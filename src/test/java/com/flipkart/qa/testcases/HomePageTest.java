package com.flipkart.qa.testcases;

import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.qa.base.TestBase;
import com.flipkart.qa.pages.HelpCenter;
import com.flipkart.qa.pages.HomePage;
import com.flipkart.qa.pages.LoginPage;
import com.flipkart.qa.util.TestUtil;



public class HomePageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	HelpCenter helpCenter;
	
	public HomePageTest() {
		super();
	}
	
	//before test cases--- launch the browser and login
	//@test---execute test cases
	//after each test case--- close the browser
	
	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil= new TestUtil();
		helpCenter = new HelpCenter();
		
		//before enter home page we need to login 1st so that we create an object of login page and call login method
		loginPage=new LoginPage();
	homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}	
	
	@Test(priority=4)
	public void verifyHomePageTitleTest() {
		String homePageTitle=homePage.verifyHomePageTitle();
		System.out.println( homePageTitle);
		Assert.assertEquals(homePageTitle, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!","Home Page title not matched");
	//particular message print when test result failed
	}
	
	@Test(priority=2)
	public void verifyCartNameTest() {
	Assert.assertTrue(homePage.verifyCartName());
	}
	
	@Test(priority=3)
	public void verifyVivekNameTest() {
		//testUtil.switchToFrame();
		Assert.assertTrue(homePage.verifyVivekName());
	}
	
	@Test(priority=1)
	public void verifyContactsLinkTest() {
		helpCenter=homePage.clickOnContactUsLink();
	}
	
	@AfterMethod
	public void tearDown() {
		wd.quit();
	}
	
	//this will quit the browser and this is very necessary lets say if you run 100 test cases on same browser then there may be a chance your browser will be exhausted, there may be memory issue and cache issue,cookies issue
	//so it will recommended test cases are independent to each other
	
	

}
