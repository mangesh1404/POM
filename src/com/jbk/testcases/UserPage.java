package com.jbk.testcases;

import org.openqa.selenium.WebDriver;

public class UserPage {

	public UserPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}
	boolean checkLogoutLabel() {
		if (getLabel().equals("LogOut")) {
			return true;
		}
		return false;
	}
	private String getLabel() {
		// TODO Auto-generated method stub
		return null;
	}
}
