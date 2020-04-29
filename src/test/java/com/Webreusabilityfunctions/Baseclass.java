package com.Webreusabilityfunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	
	public static WebDriver driver;
	/*
	 * Author: Praveena
	 * Method Description: Different Browser Launching
	 * DOC: April 19'2020
	 */
	
	public static void getBrowser(String Browser)
	{
		if(Browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravi\\eclipse-workspace\\HRM_Project\\BrowserDrivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://testingmasters.com/hrm/");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
		else if(Browser.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Ravi\\eclipse-workspace\\HRM_Project\\BrowserDrivers\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			driver.get("https://testingmasters.com/hrm/");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
		else if(Browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ravi\\eclipse-workspace\\HRM_Project\\BrowserDrivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get("https://testingmasters.com/hrm/");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
		else
		{
			System.out.print("Unable to launch browser");
		}
	}
 
	public void MousehoverActions(WebElement E1)
	{
		Actions act = new Actions(driver);
		act.moveToElement(E1).build().perform();
	}
	
	public void Dropdown(WebElement Element, String optionvalue)
	{
		Select sel = new Select(Element);
		sel.selectByVisibleText(optionvalue);
	}
	
	public void Takescreenshot(WebElement E1)
	{
		Actions act = new Actions(driver);
		act.moveToElement(E1).build().perform();
	}
	public void Datetime()
	{
		
	}
}

