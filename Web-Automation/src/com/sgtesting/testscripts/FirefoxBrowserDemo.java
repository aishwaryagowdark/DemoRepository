package com.sgtesting.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserDemo {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	}
	
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.gecko.driver", "G:\\ExampleAutomation1\\Automation\\Web-Automation\\Library\\drivers\\geckodriver.exe");
			oBrowser=new FirefoxDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
