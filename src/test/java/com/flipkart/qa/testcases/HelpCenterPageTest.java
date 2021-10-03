package com.flipkart.qa.testcases;

//import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.qa.base.TestBase;
import com.flipkart.qa.pages.HelpCenter;
import com.flipkart.qa.pages.HomePage;
import com.flipkart.qa.pages.LoginPage;
import com.flipkart.qa.util.TestUtil;

public class HelpCenterPageTest extends TestBase {
	LoginPage loginPage;
	HelpCenter helpCenter;
	HomePage homePage;
	TestUtil testUtil;
	
	public HelpCenterPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage= new LoginPage();
		homePage =new HomePage();
		helpCenter= new HelpCenter();
		testUtil=new TestUtil();
	homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	//testUtil.switchToFrame();	if frame is there then perform this line
	helpCenter =homePage.clickOnContactUsLink();//it will return helpcenter class object so i will stored in helpcenter class reference variable
	
	}
	
	@Test(priority=1)
	public void verifyHelpWithYourIssueLinkTest() {
		helpCenter.verifyHelpWithYourIssueLink();
	}
	
	@Test(priority=2)
	public void verifyFlipkartPlusLinkTest() {
		helpCenter.verifyFlipkartPlusLink();
	}
	
	@AfterMethod
	public void tearDown() {
		wd.quit();
	}

}
