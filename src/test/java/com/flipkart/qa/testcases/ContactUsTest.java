/*package com.flipkart.qa.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.qa.base.TestBase;
import com.flipkart.qa.pages.ContactUsPage;
import com.flipkart.qa.pages.HelpCenter;
import com.flipkart.qa.pages.HomePage;
import com.flipkart.qa.pages.LoginPage;



public class ContactUsTest extends TestBase {
	LoginPage loginPage;
	ContactUsPage contactUsPage;
	HomePage homePage;
	HelpCenter helpCenter;
	
	
	public ContactUsTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage= new LoginPage();
		homePage =new HomePage();
		helpCenter=new HelpCenter();
		contactUsPage= new ContactUsPage();
	homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test
	public void verifyclickOnContactUsLinkTest() {
		contactUsPage.clickOnContactUsLink();
	}

	@Test
	public void verifyTypeOfIssueLabelTest() {
		Assert.assertTrue(contactUsPage.verifyTypeOfIssueLabel());
		}
	
	@AfterMethod
	public void tearDown() {
		wd.quit();
	}

}
*/