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

public class AllInOneJBK {

	public WebDriver driver;

	@BeforeSuite
	public void setup_Browser() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("file:///D:/AdminLTE/index.html");
	}

	@Test(priority = 7)
	public void checkErrorMessage() {
		LoginPage lp = new LoginPage(driver);
		Assert.assertTrue(lp.checkErrorMessage());
	}

	@Test(priority = 7)
	public void checkDahBoardLogoutLaabel() {
		LoginPage lp = new LoginPage(driver);
		DashBoardPage boardPage=  lp.navigateToDashBoard();
		Assert.assertTrue(boardPage.checkLogoutLabel());
	}

	@AfterSuite
	public void close_Browser() {
		driver.close();
	}
}
