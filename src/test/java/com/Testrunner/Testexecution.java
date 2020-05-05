package com.Testrunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Testcases.TestCaseImplementation;



public class Testexecution extends TestCaseImplementation{

	@Test(priority=0)
	public void executionwindow() throws IOException
	{
		try {
			logger=ers.createTest("Launch the browser");
			getBrowser("chrome");
			logger.pass("Browser launched");

		} catch (Exception e) {
			logger.fail("Browser not launched");
			System.out.print("Browser failed"+e.getMessage());
		}
		try {
			logger=ers.createTest("Log into app with valid data");
			tc_01_Login_Valid_data();
			logger.pass("User logged into app");

		} catch (Exception e) {
			logger.fail("User did not log into app");
			System.out.print("Login Failed message"+e.getMessage());
		}
		try {
			logger=ers.createTest("Try to apply leave");
			tc_02_ApplyLeave();
			logger.pass("User applied leave");

		} catch (Exception e) {
			logger.fail("User did not apply leave");
			System.out.print("Leave Failed message"+e.getMessage());
		}
		
		
	}

}
