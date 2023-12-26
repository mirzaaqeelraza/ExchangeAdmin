/*
 * package com.ExchangeAdmin.DownlineListTest;
 * 
 * import java.io.IOException;
 * 
 * import org.apache.logging.log4j.LogManager; import
 * org.apache.logging.log4j.Logger; import org.openqa.selenium.WebDriver; import
 * org.testng.Reporter; import org.testng.annotations.AfterClass; import
 * org.testng.annotations.AfterTest; import org.testng.annotations.BeforeClass;
 * import org.testng.annotations.BeforeTest; import org.testng.annotations.Test;
 * 
 * import com.ExchangeAdmin.DownlineListPage.DownlinePage; import
 * com.ExchangeAdmin.LoginPage.LoginPage; import
 * com.ExchangeAdmin.LoginTest.LoginTest; import
 * com.aventstack.extentreports.ExtentReports; import
 * com.aventstack.extentreports.ExtentTest; import
 * com.aventstack.extentreports.Status; import
 * com.aventstack.extentreports.reporter.ExtentSparkReporter;
 * 
 * import resources.BaseTest;
 * 
 * 
 * 
 * public class DownlineTest extends BaseTest {
 * 
 * Logger log; WebDriver driver; private ExtentReports extent; private
 * ExtentTest test;
 * 
 * @BeforeTest public void setup() { extent = new ExtentReports();
 * ExtentSparkReporter sparkReporter = new ExtentSparkReporter("reportPath");
 * extent.attachReporter(sparkReporter); }
 * 
 * 
 * 
 * @Test(priority = 1) public void login() throws InterruptedException {
 * LoginPage loginpage = new LoginPage(driver);
 * loginpage.Email_UserName().sendKeys(prop.getProperty("email")); //
 * loginpage.email().sendKeys(prop.getProperty("email"));
 * log.debug("Email is entered"); Reporter.log("Email is entered");
 * Thread.sleep(3000);
 * loginpage.password().sendKeys(prop.getProperty("password"));
 * log.debug("Password is entered"); Reporter.log("Password is Entererd");
 * Thread.sleep(3000); loginpage.login().click(); //
 * loginpage.Continue().click(); log.debug("Clicked on Continue button");
 * Reporter.log("Clicked on Continue Button"); Thread.sleep(3000);
 * 
 * }
 * 
 * @Test(priority = 2) public void DownlineList() throws InterruptedException {
 * DownlinePage downlinelist= new DownlinePage(driver);
 * downlinelist.DownlineList().click(); Thread.sleep(5000); }
 * 
 * 
 * @BeforeClass public void openApplication() throws IOException { log =
 * LogManager.getLogger(LoginTest.class.getName()); String reportPath =
 * System.getProperty("user.dir") + "\\reports\\index.html"; driver =
 * initializeBrowser(); test.log(Status.PASS, "Login was successful");
 * log.debug("Browser got launched");
 * Reporter.log("<font color='green'>Browser got launched</font>");
 * driver.get(prop.getProperty("url"));
 * log.debug("Navigated to Application URL");
 * Reporter.log("<font color='green'>Navigated to Application UR</font>");
 * 
 * }
 * 
 * @AfterClass public void closure() { driver.close();
 * log.debug("Browser got closed");
 * Reporter.log("<font color='green'>Browser got closed</font>"); }
 * 
 * @AfterTest public void reportTeardown() { extent.flush(); }
 * 
 * }
 */

package com.ExchangeAdmin.DownlineListTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ExchangeAdmin.DownlineListPage.DownlinePage;
import com.ExchangeAdmin.LoginPage.LoginPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import resources.BaseTest;

public class DownlineTest extends BaseTest {

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
		test = extent.createTest("Open Application"); // Create a test instance
		String reportPath = System.getProperty("user.dir") + "\\reports\\index.html";
		driver = initializeBrowser();
		test.log(Status.PASS, "Browser got launched");

		Reporter.log("<font color='green'>Browser got launched</font>");
		driver.get(prop.getProperty("url"));
		test.log(Status.PASS, "Navigated to Application URL");

		Reporter.log("<font color='green'>Navigated to Application UR</font>");
	}

	@Test(priority = 1)
	public void login() throws InterruptedException {
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
	}

	@Test(priority = 2)
	public void DownlineList() throws InterruptedException {
		DownlinePage downlinelist = new DownlinePage(driver);
		downlinelist.DownlineList().click();
		test.log(Status.PASS, "The \"Downline List\" navigation link has been clicked, leading to the navigation to the Downline List page");
		Thread.sleep(5000);
	}

	@AfterClass
	public void closure() {
		driver.close();
		test.log(Status.PASS, "Browser got closed");
		Reporter.log("<font color='green'>Browser got closed</font>");
	}

	@AfterTest
	public void reportTeardown() {
		extent.flush();
	}
}
