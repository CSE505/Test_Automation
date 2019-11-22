package com.suez.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.suez.qa.base.SuezBase;
import com.suez.qa.pages.HomePage;
import com.suez.qa.pages.LoginPage;
import com.suez.qa.util.SuezUtil;

public class HomePageTest extends SuezBase {

	LoginPage loginPage;
	HomePage homePage;
	SuezUtil suezUtil;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initilization();
		suezUtil = new SuezUtil();
		loginPage = new LoginPage();
	}

	@Test
	public void VerifyRegisterLinkTest() {

	}

	@Test
	public void VerifySignInLinkTest() {
		loginPage = homePage.ClickOnSignInLink();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
