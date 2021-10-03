package com.flipkart.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.qa.base.TestBase;

public class HomePage extends TestBase {
	
	
	@FindBy(xpath="//span[contains(text(),'Cart')]")
	WebElement cartLabel;
	
	@FindBy(xpath="//a[contains(text(),'Contact Us')]")
	WebElement contactUsLink;
	
	@FindBy(xpath="//div[contains(text(),'Grocery')]")
	WebElement groceryLink;
	
	@FindBy(xpath="//div[contains(text(),'Travel')]")
	WebElement travelLink;
	
	@FindBy(xpath="//body/div[@id='container']/div/div[@class='_1kfTjk']/div[@class='_1rH5Jn']/div[@class='_2Xfa2_']/div[3]/div[1]")
	WebElement vivekLabel;
	
	@FindBy(xpath="/html/body/div[1]/div/div[3]/div[4]/div/div[1]/a/div/img[2]")
	WebElement mobilePath;
	
	
	
	
	
	//create a constructer of Home Page so that we can initialize all the web elements
		public HomePage() {
			PageFactory.initElements(wd, this);
		}
		
		public boolean verifyVivekName() {
			//JavascriptExecutor js=(JavascriptExecutor)wd;
			//boolean b=(boolean)js.executeScript("arguments[0].isDisplay();", vivekLabel);
			//return b;
			return vivekLabel.isDisplayed();
			
		}
		
		public boolean verifyCartName() {
			
			return cartLabel.isDisplayed();
		}
		
		public String verifyHomePageTitle() {
			return wd.getTitle();
		}
		
		public HelpCenter clickOnContactUsLink() {
			JavascriptExecutor js=(JavascriptExecutor)wd;
			js.executeScript("arguments[0].click();", contactUsLink);
			return new HelpCenter();
		}
		
		public GroceryPage clickOnGroceryLink() {
			groceryLink.click();
			return new GroceryPage();
			
			//return type is return objects of the GroceryPage
		}
		
		public TravelPage clickOnTravelLink() {
			travelLink.click();
			return new TravelPage();
		}
		
		public void addToCartLink() {
			//this action for if you are move your mouse to any web element
			/*Actions action= new Actions(wd); 
			action.moveToElement(cartLabel).build().perform();	*/	
			
			cartLabel.click();
			
		}
		
		public void clickOnMobileLink() {
			mobilePath.click();
			
		}
	
	
	
	

}
