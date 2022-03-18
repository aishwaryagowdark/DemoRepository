package com.sgtesting.pomassignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateModifyDelete 
{
	public static WebDriver oBrowser=null;
	public static ActiTimePage opage=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		Login();
		FlyoutWindow();
		createUser();
		deleteUser();
		Logout();
		deleteUser();
		
		closeApplication();
	}

	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","E:\\AUTOMATION\\ExampleAutomation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			opage=new ActiTimePage(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost:81/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void Login()
	{
		try
		{
			opage.getUserName().sendKeys("Admin");
			Thread.sleep(2000);
			opage.getPassword().sendKeys("manager");
			Thread.sleep(2000);
			opage.getLoginButton().click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void FlyoutWindow()
	{
		try
		{
			opage.getminimizeFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void createUser()
	{
		try
		{
			opage.getUserIcon().click();
			Thread.sleep(2000);
			opage.getAddUserButton().click();
			Thread.sleep(2000);
			opage.getFirstName().sendKeys("User1");
			Thread.sleep(2000);
			opage.getLastname().sendKeys("Demo");
			Thread.sleep(2000);
			opage.getEmail().sendKeys("user1@gmail.com");
			Thread.sleep(2000);
			opage.getUsername().sendKeys("User1");
			Thread.sleep(2000);
			opage.getpassword().sendKeys("12345");
			Thread.sleep(2000);
			opage.getComfirmPassword().sendKeys("12345");
			Thread.sleep(2000);
			opage.getCreateUserButton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteUser()
	{
		try
		{
			opage.getUser1().click();
			Thread.sleep(2000);
			opage.getDeletebtn().click();
			Thread.sleep(2000);
			Alert oalert=oBrowser.switchTo().alert();
			String content=oalert.getText();
			System.out.println(content);
			oalert.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void Logout()
	{
		try
		{
			opage.getLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}



}
