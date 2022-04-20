package com.learnautomation.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.NewCustomerSignInPage;

public class NewCustomerSignInTestPage extends BaseClass{
	
	@Test
	public void NewCustomerSignIn()
	{
		NewCustomerSignInPage newCustomerSignInPage = PageFactory.initElements(driver,NewCustomerSignInPage.class);
	}

}
