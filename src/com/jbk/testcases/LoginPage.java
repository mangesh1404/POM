package com.jbk.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	///uname , pass, loginButton and error
	
	@FindBy(id="email")
	public WebElement uname;
	
	@FindBy(id="password")
	public WebElement pass;
	
	@FindBy(xpath="//button")
	public WebElement loginButton;
	
	@FindBy(xpath="//*[@id=\\\"email_error\\\"]")
	public WebElement error;
	

	/*public WebElement emailElement() {
		return driver.findElement(By.id("email"));
	}

	public WebElement passwordElement() {
		return driver.findElement(By.id("password"));
	}

	public WebElement buttonElement() {
		return driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button"));
	}

	public WebElement errorMessage() {
		return driver.findElement(By.xpath("//*[@id=\\\"email_error\\\"]"));
	}*/

	public String title() {
		return driver.getTitle();
	}

	// all actions related to those webelements
	public void enterTextIntoUname(String text) {
		uname.sendKeys(text);
	}

	public void enterTextIntoPassword(String text) {
		pass.sendKeys(text);
	}

	public void clickLoginButton() {
		loginButton.click();
	}

	public String textErrorMesage() {
		return error.getText();
	}

	// all navigations

	public DashBoardPage navigateToDashBoard() {
		enterTextIntoUname("kiran@gmail.com");
		enterTextIntoPassword("123456");
		clickLoginButton();
		return new DashBoardPage(driver);
	}

	// all verifications
	boolean checkTitle() {
		if (title().equals("JavaByKiran | Dashboard")) {
			return true;
		}
		return false;
	}

	boolean checkErrorMessage() {
		enterTextIntoUname("");
		enterTextIntoPassword("");
		clickLoginButton();
		if (textErrorMesage().equals("sssPlease enter email.")) {
			return true;
		} else {
			return false;
		}
	}

}
