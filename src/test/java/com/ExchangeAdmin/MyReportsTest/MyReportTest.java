/*
package com.ExchangeAdmin.MyReportsTest;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ExchangeAdmin.BetlistLivePage.BetlistLivePage;
import com.ExchangeAdmin.LoginPage.LoginPage;
import com.ExchangeAdmin.LoginTest.LoginTest;
import com.ExchangeAdmin.MyReportsPage.MyReportPage;

import resources.BaseTest;

public class MyReportTest extends BaseTest {

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
	public void MyReport() throws InterruptedException {
		MyReportPage myreport = new MyReportPage(driver);
		Thread.sleep(3000);
		myreport.My_ReportPage().click();
		Thread.sleep(5000);
	}
	
	@Test(priority = 5)
	public void SearchbyFeedType() throws InterruptedException {
	MyReportPage validuser = new MyReportPage(driver);
	Thread.sleep(2000);
	
	validuser.clickOnFancy();
	Thread.sleep(2000);
	validuser.SearchButton().click();
	Thread.sleep(4000);
	
	validuser.clickOnBM();
	Thread.sleep(2000);
	validuser.SearchButton().click();
	Thread.sleep(4000);
	
	validuser.clickOnBetfair();
	Thread.sleep(2000);
	validuser.SearchButton().click();
	Thread.sleep(4000);
	validuser.ResetButton().click();
	Thread.sleep(4000);
	
	}
	
	
	@Test(priority = 3)
	public void SearchbyValidUserId() throws InterruptedException {
		MyReportPage validuser = new MyReportPage(driver);
		Thread.sleep(2000);
		validuser.Search_UserID().sendKeys("100000110");
		Thread.sleep(2000);
		validuser.SearchButton().click();
		Thread.sleep(4000);
		validuser.ResetButton().click();
		Thread.sleep(3000);
		
	}
	
	@Test(priority = 4)
	public void SearchbyValidEventId() throws InterruptedException {
		MyReportPage validevent = new MyReportPage(driver);
		validevent.Search_EventID().sendKeys("32880222");
		Thread.sleep(3000);
		validevent.SearchButton().click();
		Thread.sleep(3000);
		validevent.ResetButton().click();
		Thread.sleep(3000);
		
	}
	
	@Test(priority = 6)
	public void SearchbyDate() throws InterruptedException {
		MyReportPage validDate = new MyReportPage(driver);
		validDate.ClickonStartDate().sendKeys("20-11-2023");
		Thread.sleep(3000);
		validDate.ClickonEndDate().sendKeys("20-12-2023");
		Thread.sleep(3000);
		validDate.SearchButton().click();
		Thread.sleep(3000);
		
		
	} */

/*@Test(priority = 4)
public void SearchbyInvalidUserId() {
	MyReportPage invaliduser = new MyReportPage(driver);
	invaliduser.Search_UserID().sendKeys("");
}

@Test(priority = 5)
public void SearchbySportName() {
	MyReportPage validuser = new MyReportPage(driver);
	validuser.Search_UserID().sendKeys("");
	
} */

/*
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

}*/

////////////////////////////////////////////////////////////////////////////////////////////////////////////

package com.ExchangeAdmin.MyReportsTest;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ExchangeAdmin.LoginPage.LoginPage;
import com.ExchangeAdmin.LoginTest.LoginTest;
import com.ExchangeAdmin.MyReportsPage.MyReportPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import resources.BaseTest;

public class MyReportTest extends BaseTest {

	Logger log;
	// WebDriver driver;
	private WebDriver driver;
	private ExtentReports extent;
	private ExtentTest test;

	@BeforeTest
	public void setup() {
		extent = new ExtentReports();
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter("reportPath");
		extent.attachReporter(sparkReporter);
	}

	@BeforeClass
	public void openApplication() throws IOException {
		try {
			log = LogManager.getLogger(LoginTest.class.getName());
			test = extent.createTest("Open Application"); // Create a test instance
			String reportPath = System.getProperty("user.dir") + "\\reports\\index.html";
			driver = initializeBrowser();
			test.log(Status.PASS, "Browser got launched");
			log.debug("Browser got launched");
			Reporter.log("<font color='green'>Browser got launched</font>");
			driver.get(prop.getProperty("url"));
			test.log(Status.PASS, "Navigated to Application URL");
			log.debug("Navigated to Application URL");
			Reporter.log("<font color='green'>Navigated to Application UR</font>");
		} catch (Exception e) {
			Reporter.log("Exception during openApplication: " + e.getMessage());
		}
	}

	@Test(priority = 1)
	public void login() throws InterruptedException {
		try {
			LoginPage loginpage = new LoginPage(driver);
			loginpage.Email_UserName().sendKeys(prop.getProperty("email"));
			test.log(Status.PASS, "Email is entered");
			Reporter.log("Email is entered");
			Thread.sleep(3000);
			loginpage.password().sendKeys(prop.getProperty("password"));
			test.log(Status.PASS, "Password is entered");
			Reporter.log("Password is Entered");
			Thread.sleep(3000);
			loginpage.login().click();
			Reporter.log("Clicked on Continue Button");
			test.log(Status.PASS, "Clicked on Login Button");
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println("Exception during login: " + e.getMessage());
		}
	}

	@Test(priority = 2)
	public void MyReport() throws InterruptedException {
		try {
			MyReportPage myreport = new MyReportPage(driver);
			Thread.sleep(3000);
			myreport.My_ReportPage().click();
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("Exception during MyReport: " + e.getMessage());
		}
	}

	@Test(priority = 5)
	public void SearchbyFeedType() throws InterruptedException {
		try {
			MyReportPage validuser = new MyReportPage(driver);
			Thread.sleep(2000);

			validuser.clickOnFancy();
			Thread.sleep(2000);
			validuser.SearchButton().click();
			Thread.sleep(4000);

			validuser.clickOnBM();
			Thread.sleep(2000);
			validuser.SearchButton().click();
			Thread.sleep(4000);

			validuser.clickOnBetfair();
			Thread.sleep(2000);
			validuser.SearchButton().click();
			Thread.sleep(4000);
			validuser.ResetButton().click();
			Thread.sleep(4000);
		} catch (Exception e) {
			System.out.println("Exception during SearchbyFeedType: " + e.getMessage());
		}
	}

	@Test(priority = 3)
	public void SearchbyValidUserId() throws InterruptedException {
		try {
			MyReportPage validuser = new MyReportPage(driver);
			Thread.sleep(2000);
			validuser.Search_UserID().sendKeys("100000110");
			Thread.sleep(2000);
			validuser.SearchButton().click();
			Thread.sleep(4000);
			validuser.ResetButton().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println("Exception during SearchbyValidUserId: " + e.getMessage());
		}
	}

	@Test(priority = 4)
	public void SearchbyValidEventId() throws InterruptedException {
		try {
			MyReportPage validevent = new MyReportPage(driver);
			validevent.Search_EventID().sendKeys("32880222");
			Thread.sleep(3000);
			validevent.SearchButton().click();
			Thread.sleep(3000);
			validevent.ResetButton().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println("Exception during SearchbyValidEventId: " + e.getMessage());
		}
	}

	@Test(priority = 6)
	public void SearchbyDate() throws InterruptedException {
		try {
			MyReportPage validDate = new MyReportPage(driver);
			validDate.ClickonStartDate().sendKeys("20-11-2023");
			Thread.sleep(3000);
			validDate.ClickonEndDate().sendKeys("20-12-2023");
			Thread.sleep(3000);
			validDate.SearchButton().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println("Exception during SearchbyDate: " + e.getMessage());
		}
	}

	@AfterClass
	public void closure() {
		try {
			driver.close();
			log.debug("Browser got closed");
			Reporter.log("<font color='green'>Browser got closed</font>");
		} catch (Exception e) {
			Reporter.log("Exception during closure: " + e.getMessage());
		}
	}
	
	@AfterTest
	public void reportTeardown() {
		extent.flush();
	}
}
