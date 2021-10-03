package com.flipkart.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.qa.base.TestBase;

public class HelpCenter extends TestBase{
	
	@FindBy(xpath="//span[contains(text(),'Help with your issues')]")
	WebElement helpWithYourIssueLink;
	
	@FindBy(xpath="//div[@class='ogkecu A2ZSS0']//span[contains(text(),'Flipkart Plus')]")
	WebElement flipkartPlusLink;

	//initialize page objects
	public HelpCenter() {
		PageFactory.initElements(wd, this);
	}
	
	public void verifyHelpWithYourIssueLink() {
		 helpWithYourIssueLink.click();
		
	}
	
	public void verifyFlipkartPlusLink() {
		flipkartPlusLink.click();
	}
	
	//Note: if you want to select checkbox then dont go with @FindBy because then you have to create separate PageFactory object for each checkbox
	//simple create a method for that and pass the name which checkbox you want to select
	
	/*public void selectCheckboxByName(String name) {
		wd.findElement(By.xpath("//a[text()='"+name+"']")).click();;
		//this is the only example you have to pass name in your xpath
		
	}*/
	
	

}
