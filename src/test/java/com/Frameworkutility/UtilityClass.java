package com.Frameworkutility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.Webreusabilityfunctions.Baseclass;

public class UtilityClass extends Baseclass
{
 
	public void Getscreenshot() throws IOException
	{
		String filepath = System.getProperty("user.dir")+"/Screenshots/hrm_"+getsystemdate()+".png";
		File filelocation = new File(filepath);
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, filelocation);
	}
	public String getsystemdate()
	{
		Date dt = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY-HH-mm-ss");
		String systemdate=sdf.format(dt);
		System.out.println(systemdate);
		return systemdate;
		
	}
}
