package com.jbk.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class UsersTestCases {

	public WebDriver driver;

	@BeforeSuite
	public void setup_Browser() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Administrator/Desktop/Offline%20Website/Offline%20Website/index.html");
	}

	@Test(priority = 1)
	public void checkErrorMessage() {
		LoginPage lp = new LoginPage(driver);
		DashBoardPage dp=lp.navigateToDashBoard();
		UserPage up=dp.clickUserLink(driver);
		up.verifyHeader();
		up.verifyEmail();
		
	}


	@AfterSuite
	public void close_Browser() {
		driver.close();
	}
}
