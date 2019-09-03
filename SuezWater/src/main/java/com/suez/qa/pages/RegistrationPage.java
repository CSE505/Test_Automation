package com.suez.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.suez.qa.base.SuezBase;

public class RegistrationPage extends SuezBase {

	// Page Factory - OR:

	@FindBy(xpath = ".//a [text () = 'Residential']")
	WebElement Residential;

	@FindBy(xpath = ".//a [text () = 'Business']")
	WebElement Business;

	// Initializing the Page Objects:

	public RegistrationPage() {

		PageFactory.initElements(driver, this);
	}

	// Actions
	
	

}
