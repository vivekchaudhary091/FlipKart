package com.flipkart.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.flipkart.qa.base.TestBase;


public class AddToCartPage extends TestBase {
	
	

    @FindBy(xpath="//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	   WebElement mobile;
    
    @FindBy(xpath="//a[@href='/apple-iphone-11-black-64-gb/p/itm0f37c2240b217']")
    WebElement iphoneLink;
    public AddToCartPage() {
    	PageFactory.initElements(wd, this);
    }
    

   
    public void addToCart() {
		mobile.click();
		iphoneLink.click();

	}
	
}
