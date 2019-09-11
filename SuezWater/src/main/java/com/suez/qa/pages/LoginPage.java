package com.suez.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.suez.qa.base.SuezBase;

public class LoginPage extends SuezBase {
	
	// Page Factory - OR:
	
	@FindBy(xpath = ".//input[@type ='text' and @id ='edit-name']")
	WebElement Email;
	
	@FindBy(xpath = ".//input[@type ='password' and @id ='edit-pass']")
	WebElement Password;
	
	@FindBy(xpath = ".//input[@type ='submit' and @id ='edit-submit']")
	WebElement SignBtn;
	
	@FindBy(xpath = ".//a[@href='/user/mail']")
	WebElement forgotYourEmail;
	
	@FindBy (xpath = ".//a[@href='/user/password']")
	WebElement forgotYourPassword;
	
	@FindBy(xpath = ".//a[@href='/what-type-of-register']")
	WebElement RegisterANewAccount;
	
	@FindBy(xpath = ".//a[@href='/guest-checkout']")
	WebElement ContinueAsGuest;
	
	
	//Initializing the Page Objects:
	
		public LoginPage(){
			PageFactory.initElements(driver, this);
		}
		
	//Actions
		
		
	
	

}
