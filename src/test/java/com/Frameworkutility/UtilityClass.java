package com.Frameworkutility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.naming.spi.DirStateFactory.Result;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

import com.Webreusabilityfunctions.Baseclass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class UtilityClass extends Baseclass
{
    public ExtentReports ers;
    public ExtentTest logger;
    public String Getscreenshot() throws IOException
	{
		//String filepath = System.getProperty("user.dir")+"/Screenshots/hrm_"+getsystemdate()+".png";
    	String filepath = "C:\\Users\\Ravi\\eclipse-workspace\\HRM_Project\\Screenshots\\hrm_"+getsystemdate()+".png";
		File filelocation = new File(filepath);
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, filelocation);
		return filepath;
	}
	public String getsystemdate()
	{
		Date dt = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY-HH-mm-ss");
		String systemdate=sdf.format(dt);
		System.out.println(systemdate);
		return systemdate;
		
	}
	@BeforeSuite
	public void gethtmlreport()
	{
		System.out.println("Load html reports");
		String reportpath=System.getProperty("user.dir")+"/Reports/hrm_"+getsystemdate()+".html";
		ExtentHtmlReporter er= new ExtentHtmlReporter(reportpath);
		ExtentReports ers = new ExtentReports();
		ers.attachReporter(er);
		
	}
	@AfterMethod
	
	public void attachscreenshotintoreport(ITestResult result) throws IOException
	{
		Reporter.log("Capture success of test");
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			logger.pass("Success", MediaEntityBuilder.createScreenCaptureFromPath(Getscreenshot()).build());
			Reporter.log("success screens are captured");
		}
		else if(result.getStatus()==ITestResult.FAILURE)
		{
			Reporter.log("Capture Failed of test");
			logger.fail("Failure", MediaEntityBuilder.createScreenCaptureFromPath(Getscreenshot()).build());
			Reporter.log("Failure screens are captured");
		}
		else
		{
			Reporter.log("Screenshot not Captured");
		}
		ers.flush();
		Reporter.log("Html reports Captured",true);
	}
}
