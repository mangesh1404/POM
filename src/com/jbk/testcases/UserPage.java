package com.jbk.testcases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class UserPage {
	WebDriver driver;
	
	public UserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//th[1]")
	public WebElement header;
	
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
	
	///html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[3]
	
	/*public void verifyHeader(WebDriver driver) {
		ArrayList<String> explist= new ArrayList<String>();
		explist.add("Username");//0
		explist.add("Email");
		explist.add("Mobile");
		explist.add("Course");
		explist.add("Gender");
		explist.add("State");
		explist.add("Action");
		
		boolean flag=header.getText().equals("#");
		Assert.assertTrue(flag);
		//driver.getWindowHandles();
		List<WebElement> headersList = driver.findElements(By.xpath(""));
		
		for(int i=1;i<headersList.size();i++) {
			System.out.println(headersList.get(i).getText());
			boolean flag=headersList.get(i).getText().equals(explist.get(i-1));
			
			Assert.assertTrue(flag);
		}*/
		
		public void verifyHeader() {
			ArrayList<String> actList = new ArrayList<String>();
			actList.add("Username");
			actList.add("Email");
			actList.add("Mobile");
			actList.add("Course");
			actList.add("Gender");
			actList.add("State");
			actList.add("Action");

			List<WebElement> expList = driver.findElements(By.xpath("//th"));
					
			for (int i = 1; i < expList.size(); i++) {
				System.out.println(expList.get(i).getText());
				boolean flag = expList.get(i).getText().equals(actList.get(i - 1));
				Assert.assertTrue(flag);
			}
	}
		// user mail Id contains domain(@gmail.com) or not
		public void verifyEmail() {
			String exp="@gmail.com";

			List<WebElement> expList = driver.findElements(By.xpath("//td[3]"));
			
					System.out.println(expList.size());//4
					
			for (int i =0; i < expList.size(); i++) {
				System.out.println(expList.get(i).getText());//kiran@gmail.com, sagar@gmail.com
				boolean flag = expList.get(i).getText().contains(exp);
				Assert.assertTrue(flag);
			}
	}
		//user must have gender as a male or female
		public void verifyGender() {
			
						// 4 webElements
			List<WebElement> expList = driver.findElements(By.xpath("//td[6]"));	
			for (int i =0; i < expList.size(); i++) {
								// cndition 1						// OR  // cndition 2
				boolean flag = (expList.get(i).getText().contains("Male") || expList.get(i).getText().contains("Female")) ;
			
				Assert.assertTrue(flag);
			}
			
		}
		// write a test case to verify user able to click delete button
		
		public void verifyDeleteButton() {
			
				List <WebElement> deleteButton = driver.findElements(By.xpath("//td[8]"));
				for(int i = 0; i < deleteButton.size();i++) {
					boolean flag = deleteButton.get(i).isEnabled();
					
					deleteButton.get(i).isDisplayed();
					deleteButton.get(i).isSelected();
					Assert.assertTrue(flag);
				}

		}
		
		
		
		
	}
	
	
	

