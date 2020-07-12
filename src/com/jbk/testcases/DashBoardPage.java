package com.jbk.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
	WebDriver driver;

	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	// all web element
	// all actions
	// all varifications
	// all navigations
	
	@FindBy(xpath="//span[text()='Users']")
	public WebElement userLink;
	
	
	
	WebElement getLabelLogout() {
		return driver.findElement(By.xpath("logout xoath"));
	}
	/*WebElement getUserLink() {
		return driver.findElement(By.xpath("userLink"));
	}*/

	String getLabel() {
		return getLabelLogout().getText();
	}
	public UserPage  clickUserLink(WebDriver driver) {
		userLink.click();
		return new UserPage(driver);
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
		clickUserLink(driver);
		return new UserPage(driver);
	}

}
