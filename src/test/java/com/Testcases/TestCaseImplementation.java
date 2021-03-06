package com.Testcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import com.Frameworkutility.UtilityClass;
import com.Pageobjects.HRMWebpage;

public class TestCaseImplementation extends UtilityClass{
	
	public void tc_01_Login_Valid_data() throws IOException
	{
		HRMWebpage lpo=PageFactory.initElements(driver, HRMWebpage.class);
		String username = Getcelldata("cred",1,0);
		lpo.username.sendKeys(username);
		String password = Getcelldata("cred",1,1);
		lpo.pwd.sendKeys(password);
		lpo.loginbtn.click();
		Getscreenshot();
	}
	
	public void tc_02_ApplyLeave() throws IOException
	{
		HRMWebpage AppLeave=PageFactory.initElements(driver, HRMWebpage.class);
		MousehoverActions(AppLeave.Leave);
		AppLeave.ApplyLeave.click();
		Getscreenshot();
		Dropdown(AppLeave.Leavetype,"Annual Leave");
		Getscreenshot();
		
	}


}
