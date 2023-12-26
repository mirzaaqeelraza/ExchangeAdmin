package com.ExchangeAdmin.MyAccountPageTest;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ExchangeAdmin.LoginPage.LoginPage;
import com.ExchangeAdmin.LoginTest.LoginTest;
import com.ExchangeAdmin.MyAccountPage.MyAccountPage;

import resources.BaseTest;

public class MyAccountPageTest extends BaseTest {

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
	public void MyAccount() throws InterruptedException {
		MyAccountPage myaccount = new MyAccountPage(driver);
		Thread.sleep(3000);
		myaccount.My_AccountPage().click();
		Thread.sleep(5000);
		/*
		 * myaccount.ClickedPaymentHistory(); Thread.sleep(5000);
		 * myaccount.ClickedLedgerHistory(); Thread.sleep(5000);
		 * myaccount.ClickedactivityLog(); Thread.sleep(5000);
		 * myaccount.ClickedProfile(); Thread.sleep(5000);
		 */
	}
	/*
	 * chips.Addchips().click(); Thread.sleep(3000); Reporter.
	 * log("Clicked on Add Chips icon and Add Chips page is being displayed");
	 * chips.ClickedCard().click(); Thread.sleep(3000);
	 * Reporter.log("Clicked on 50 card and card input details are displayed");
	 * chips.switchToPaymentFrame();
	 * Reporter.log("Switched to Payment Details frmae"); Thread.sleep(3000);
	 * chips.enterCardNumber("3782 822463 10005");
	 * Reporter.log("Card Nuumber is Entered"); Thread.sleep(3000);
	 * chips.enterExpiry("02 / 55"); Reporter.log("Expiry date is entered");
	 * Thread.sleep(3000); chips.enterCVC("786"); Reporter.log("CVV is Entered");
	 * Thread.sleep(3000); chips.switchToDefaultContent();
	 * Reporter.log("Switched to DefautContent"); Thread.sleep(3000);
	 * chips.clickSubmitButton(); Reporter.log("Clicked on Submit Button");
	 * Thread.sleep(5000); driver.navigate().refresh();
	 * Reporter.log("Total chips balance is updated"); Thread.sleep(3000);
	 */
    
	@Test(priority = 5)
	public void Profile() {
		MyAccountPage myaccount = new MyAccountPage(driver);
		myaccount.ClickedProfile();
	}

	@Test(priority = 3)
	public void Payment_History() throws InterruptedException {
		MyAccountPage myaccount = new MyAccountPage(driver);
		myaccount.ClickedPaymentHistory();
		Thread.sleep(5000);
	}

	@Test(priority = 4)
	public void Ledger_History() throws InterruptedException{
		MyAccountPage myaccount = new MyAccountPage(driver);
		myaccount.ClickedLedgerHistory();
		Thread.sleep(5000);
	}

	@Test(priority = 6)
	public void Activity_log() throws InterruptedException {
		MyAccountPage myaccount = new MyAccountPage(driver);
		myaccount.ClickedactivityLog();
		Thread.sleep(5000);
	}

	@BeforeClass
	public void openApplication() throws IOException {
		//log = LogManager.getLogger(LoginTest.class.getName());
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
