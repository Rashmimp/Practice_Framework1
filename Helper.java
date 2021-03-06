package com.learnautomation.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	
	public static void captureScreenshot(WebDriver driver)

	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		try
		{
			FileHandler.copy(src, new File("./Screenshots/Coach "+getCurrentDateAndTime()+".png"));
		}
		catch(IOException e)
		{
			System.out.println("Unable to capture the screenshot "+e.getMessage());
		}
	}
	
	public static String getCurrentDateAndTime()
	{
		DateFormat customFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		
		Date currentDate = new Date();
		
		return customFormat.format(currentDate);
	}

	
	public void  handleFrames()
	{
		
	}
	
	public void  alerts()
	{
		
	}
	
	public void  windows()
	{
		
	}
	
	public void  syncIssue()
	{
		
	}
}
