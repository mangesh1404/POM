package com.jbk.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashBoardPage {
	WebDriver driver;

	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
	}
	// all web element
	// all actions
	// all varifications
	// all navigations

	WebElement getLabelLogout() {
		return driver.findElement(By.xpath("logout xoath"));
	}
	WebElement getUserLink() {
		return driver.findElement(By.xpath("userLink"));
	}

	String getLabel() {
		return getLabelLogout().getText();
	}
	void  clickUserLink() {
		 getUserLink().click();
	}

	boolean checkLogoutLabel() {
		if (getLabel().equals("LogOut")) {
			return true;
		}
		return false;
	}

	boolean checkTitleDashBoard() {
		if (driver.getTitle().equals("DashBoard")) {
			return true;
		}
		return false;
	}
	
	UserPage navigateToUserPage(){
		clickUserLink();
		return new UserPage(driver);
	}

}
