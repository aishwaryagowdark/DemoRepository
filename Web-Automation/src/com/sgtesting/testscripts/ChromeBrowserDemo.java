package com.sgtesting.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	}
	
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","E:\\AUTOMATION\\ExampleAutomation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			
		}catch(Exception e)
		{
			e.printStackTrace();;
		}
	}
	
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
