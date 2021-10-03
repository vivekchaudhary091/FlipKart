package com.flipkart.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//page factory--object repository
	//page factory used one annotation @FindBy
	//i will difined all the page library
	
	@FindBy(xpath="//div[@class='IiD88i _351hSN']//input[@type='text']")
	WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginBttn;
	
	@FindBy(xpath="//div[contains(text(),'Sign Up')]")
	WebElement SignUpButtn;
	
	@FindBy(xpath="//img[contains(@class,'_2xm1JU')]")
	WebElement Flipkartlogo;
	
	
	//how to initialize all the web Element by using PageFactory class and initElements method and this means current class object
	//create constructor
	public  LoginPage() {
		
		PageFactory.initElements(wd, this);
	}
	
	//defines different action available on login page
	//actions:
	public String validateLoginPageTitle() {
		return wd.getTitle();
	}
	
	public boolean validateFlipkartImage() {
		
	return Flipkartlogo.isDisplayed();
		
	}
	
	public HomePage login(String user,String pwd) {
		username.sendKeys("user");
		password.sendKeys("pwd");
		
		      JavascriptExecutor js=(JavascriptExecutor)wd;
		      WebElement element = wd.findElement(By.xpath("//button[@type='submit']"));
				js.executeScript("arguments[0].click();", element);
		//loginBttn.click();
		
		//after clicking login it will redirect to homepage so return type is homepage
		
		return new HomePage();
		
	}
	
	

}
