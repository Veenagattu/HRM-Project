package com.gittest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class Gittest {
	
	
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\gsreek\\eclipse-workspace\\Hybris\\Webdriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://itg.b2b.hpe.com/login/auth");
		driver.manage().timeouts().implicitlyWait(3 ,TimeUnit.SECONDS);
	}
	}


