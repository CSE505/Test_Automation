package com.suez.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.suez.qa.base.SuezBase;

public class RegistrationPage extends SuezBase {
	
	//Page Factory - OR:
	
	@FindBy(xpath = ".//a [text () = 'Residential']")
	WebElement Residential;
	
	@FindBy(xpath = ".//a [text () = 'Business']")
	WebElement Business;
	
	

}
