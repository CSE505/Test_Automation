package com.suez.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.suez.qa.base.SuezBase;

public class HomePage extends SuezBase {

	// Page Factory - OR:

	@FindBy(xpath = ".//a [text () = 'Sign In']")
	WebElement sign_btn;

	@FindBy(xpath = ".//a [text () = 'Register']")
	WebElement Register_btn;

	// Initializing the Page Objects:

	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}

	// Actions
	
	public LoginPage SignIn () {
		sign_btn.click();
		return new LoginPage();		
	}
	
	public RegistrationPage Register() {
		Register_btn.click();
		return new RegistrationPage();
	}

}
