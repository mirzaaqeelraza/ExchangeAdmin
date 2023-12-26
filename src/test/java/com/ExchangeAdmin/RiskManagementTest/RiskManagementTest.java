package com.ExchangeAdmin.RiskManagementTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ExchangeAdmin.LoginPage.LoginPage;
import com.ExchangeAdmin.RiskManagementPage.RiskManagementPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import resources.BaseTest;

public class RiskManagementTest extends BaseTest {

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
		test.log(Status.PASS, "Chrome Browser got launched");
		Reporter.log("<font color='green'>Browser got launched</font>");
		driver.get(prop.getProperty("url"));
		test.log(Status.PASS, "Navigated to BMS Application URL");
		Reporter.log("<font color='green'>Navigated to Application URL</font>");
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
		test.log(Status.PASS, "Clicked on the login button, which resulted in navigating to the Downline List page.");
		Reporter.log("Clicked on Continue Button");
		Thread.sleep(3000);
	}

	@Test(priority = 2)
	public void RiskManagement() throws InterruptedException {
		RiskManagementPage risk = new RiskManagementPage(driver);
		risk.Risk_ManagementPage().click();
		test.log(Status.PASS,
				"Clicked on the \"Risk Management\" link, which resulted in navigating to the Risk Management page");
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
