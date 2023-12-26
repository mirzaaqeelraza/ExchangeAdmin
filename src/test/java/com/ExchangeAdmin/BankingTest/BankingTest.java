package com.ExchangeAdmin.BankingTest;


import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ExchangeAdmin.AdminSettingPage.AdminSettingPage;
import com.ExchangeAdmin.BankingPage.BankingPage;
import com.ExchangeAdmin.LoginPage.LoginPage;
import com.ExchangeAdmin.LoginTest.LoginTest;

import resources.BaseTest;

public class BankingTest extends BaseTest {

	Logger log;
	WebDriver driver;

	@Test(priority = 1)
	public void login() throws InterruptedException {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.Email_UserName().sendKeys(prop.getProperty("email"));
		// loginpage.email().sendKeys(prop.getProperty("email"));
		log.debug("Email is entered");
		Reporter.log("Email is entered");
		Thread.sleep(3000);
		loginpage.password().sendKeys(prop.getProperty("password"));
		log.debug("Password is entered");
		Reporter.log("Password is Entererd");
		Thread.sleep(3000);
		loginpage.login().click();
		// loginpage.Continue().click();
		log.debug("Clicked on Continue button");
		Reporter.log("Clicked on Continue Button");
		Thread.sleep(3000);

	}

	@Test(priority = 2)
	public void bank() throws InterruptedException {
		BankingPage banking = new BankingPage(driver);
		banking.Banking_Page().click();
		Thread.sleep(5000);
	}
		

	@BeforeClass
	public void openApplication() throws IOException {
		log = LogManager.getLogger(LoginTest.class.getName());
		driver = initializeBrowser();
		log.debug("Browser got launched");
		Reporter.log("<font color='green'>Browser got launched</font>");
		driver.get(prop.getProperty("url"));
		log.debug("Navigated to Application URL");
		Reporter.log("<font color='green'>Navigated to Application UR</font>");

	}

	@AfterClass
	public void closure() {
		driver.close();
		log.debug("Browser got closed");
		Reporter.log("<font color='green'>Browser got closed</font>");
	}

}




