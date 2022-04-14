package com.learnautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseClass{

	
	
	
	
	@FindBy(xpath = "//*[@id=\"navigation\"]/ul[2]/li/a[1]")
	WebElement signIn;
	
	@FindBy(name = "email_address")
	WebElement userEmailId;
	
	@FindBy(id = "login-password")
	WebElement password;
	
	@FindBy(className = "btn")
	WebElement loginButton;
	
	public LoginPage(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	public void loginToCoach(String userId, String pass)
	{
		driver.findElement(By.className("null")).click();
		//signIn.click();
		userEmailId.sendKeys(userId);
		password.sendKeys(pass);
		
		loginButton.click();
	}
	

}
