package com.flipkart.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.flipkart.qa.util.TestUtil;

public class TestBase {
	
	public static WebDriver wd;
	public static Properties prop;//both are global variable we can read throughout my program from child class also
	
	public TestBase() {
		
		try {
		prop=new Properties();
		FileInputStream ip= new FileInputStream("C:\\eclipse\\eclipse_workspace\\FlipKartTest\\src\\main\\java\\com\\"
				+ "flipkart\\qa\\config\\config.properties");
		prop.load(ip);
		}
		catch(FileNotFoundException e) {
			
			e.printStackTrace();
		}
		catch(IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void initialization() {
		
		String browser=prop.getProperty("browser");
		if(browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
			wd=new FirefoxDriver();
		}
		else if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
			wd=new ChromeDriver();
		}
		
		wd.manage().window().maximize();
		wd.manage().deleteAllCookies();
		wd.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		wd.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
	     wd.get(prop.getProperty("url"));
		
		
		
	}
	
	
	
}
