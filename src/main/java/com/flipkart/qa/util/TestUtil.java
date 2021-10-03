package com.flipkart.qa.util;

import com.flipkart.qa.base.TestBase;

public class TestUtil extends TestBase {
	
	public static long PAGE_LOAD_TIMEOUT=50;
	public static long IMPLICIT_WAIT= 40;
	
	public void switchToFrame() {
		wd.switchTo().frame("");
	}

}
