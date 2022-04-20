package com.learnautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class NewCustomerSignInPage extends BaseClass{

	@FindBy(id = "firstname")
	WebElement firstName;
	
	@FindBy (id = "lastname")
	WebElement lastName;
	
	@FindBy (id = "street-address")
	WebElement streetAddress;
	
	@FindBy (id = "city")
	WebElement city;
	
	@FindBy (id = "stateZone")
	WebElement state;
	
	Select stateSelect = new Select(state); 
	
	@FindBy (id = "postcode")
	WebElement postcode;
	
	@FindBy (id = "country")
	WebElement country;
	
	Select selectCountry = new Select(country);
	
	@FindBy (name = "telephone")
	WebElement telephone;
	
	@FindBy (id = "email-address")
	WebElement email;
	
	@FindBy (id = "password-new")
	WebElement passwordNew;
	
	@FindBy (id = "password-confirm")
	WebElement passwordConfirm;
	
	@FindBy (className = "checkboxLabel")
	WebElement checkBox;
	
	@FindBy (xpath = "//*[@id=\\\"createAccountForm\\\"]/fieldset/fieldset[4]/label[2]")
	WebElement htmlButton;
	
	@FindBy (xpath = "//*[@id=\\\"createAccountForm\\\"]/fieldset/fieldset[4]/label[3]")
	WebElement textOnlyButton;
	
	@FindBy (xpath = "//*[@id=\\\"createAccountForm\\\"]/div/button")
	WebElement submitButton;
	
	public NewCustomerSignInPage(WebDriver ldriver)
	{
		this.driver =ldriver;
	}
    
	
	
	
}
