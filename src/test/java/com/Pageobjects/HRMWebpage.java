package com.Pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HRMWebpage 
{
	/*
	 * 
	 * 
	 */
	@FindBy(id="txtUsername") public WebElement username;
	@FindBy(id="txtPassword") public WebElement pwd;
	@FindBy(id="btnLogin") public WebElement loginbtn;
	
	/*
	 * 
	 * 
	 */
	@FindBy(linkText="Leave") public WebElement Leave;
	@FindBy(id="menu_leave_applyLeave") public WebElement ApplyLeave;
	@FindBy(xpath="//select[@id='applyleave_txtLeaveType']") public WebElement Leavetype;
	

}
