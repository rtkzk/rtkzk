package com.stockaccounting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class maventest1 {
	@Test
	public void exe()

	 {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://webapp.qedgetech.com/");
		
	}

}
