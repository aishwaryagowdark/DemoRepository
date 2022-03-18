package com.sgtesting.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser 
{
	public static WebDriver oBrowser=null; 
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();

	}
	
	private static void launchBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "E:\\AUTOMATION\\ExampleAutomation\\Web-Automation\\Library\\drivers\\geckodriver.exe");
		oBrowser=new FirefoxDriver();
	}
	
	private static void navigate()
	{
		oBrowser.get("http://localhost:81/login.do");
	}

}
