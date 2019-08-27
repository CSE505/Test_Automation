package com.suez.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.suez.qa.util.SuezUtil;

public class SuezBase {

	static WebDriver driver;
	static Properties prop;

	public SuezBase() {

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"D:\\Automation_github\\Test_Automation\\SuezWater\\src\\main\\java\\com\\suez\\qa\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initilization() {
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");	
			driver = new ChromeDriver();
		}else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "E:\\geckodriver-v0.24.0-win64\\geckodriver.exe");	
			driver = new FirefoxDriver(); 
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(SuezUtil.page_Load_Timeout,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(SuezUtil.implicit_Load_Timeout,TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("Url"));
	}

}
