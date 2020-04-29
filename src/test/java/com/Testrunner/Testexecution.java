package com.Testrunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Testcases.TestCaseImplementation;



public class Testexecution extends TestCaseImplementation{

	@Test
	public void executionwindow() throws IOException
	{
		getBrowser("chrome");
		tc_01_Login_Valid_data();
		tc_02_ApplyLeave();
	}

}
