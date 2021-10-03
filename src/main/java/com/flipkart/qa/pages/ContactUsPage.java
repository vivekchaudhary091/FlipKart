/*package com.flipkart.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.qa.base.TestBase;

public class ContactUsPage  extends TestBase{
	

	
	@FindBy(xpath="//a[contains(text(),'Contact Us')]")
	WebElement contactUsLink;
	
	@FindBy(xpath="//span[contains(text(),'TYPE OF ISSUE')]")
	WebElement typeOfIssueLabel;
	
	//initialize page objects
		public ContactUsPage() {
			PageFactory.initElements(wd, this);
		}
		
		
		public HelpCenter clickOnContactUsLink() {
			JavascriptExecutor js=(JavascriptExecutor)wd;
			js.executeScript("arguments[0].click();", contactUsLink);
			return new HelpCenter();
		}
		
		public boolean verifyTypeOfIssueLabel() {
		return	typeOfIssueLabel.isDisplayed();
		}
		
	

}
*/