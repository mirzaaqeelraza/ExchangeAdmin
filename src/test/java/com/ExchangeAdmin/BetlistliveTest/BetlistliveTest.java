
package com.ExchangeAdmin.BetlistliveTest;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ExchangeAdmin.BetlistLivePage.BetlistLivePage;
import com.ExchangeAdmin.LoginPage.LoginPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import resources.BaseTest;

public class BetlistliveTest extends BaseTest {

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
	public void MyAccount() throws InterruptedException {
		BetlistLivePage betlistlive = new BetlistLivePage(driver);
		Thread.sleep(3000);
		betlistlive.My_BetlistLivePage().click();
		test.log(Status.PASS,
				"The \"BetList Live\" navigation link has been clicked, leading to the navigation to the Betlist Live page");
		Thread.sleep(5000);
	}

	@Test(priority = 3)
	public void ColumnChooser() throws InterruptedException {
		BetlistLivePage betlistlive = new BetlistLivePage(driver);
		Thread.sleep(3000);
		betlistlive.openColumnChooser();
		Thread.sleep(3000);
		// betlistlive.closeColumnChooser();
		// Thread.sleep(3000);
	}

	
	@Test(priority = 4)
	public void ColumnChooserlist() throws InterruptedException {
		BetlistLivePage betlistlive = new BetlistLivePage(driver);
		test = extent.createTest("testColumnChooser", "Test to check column chooser functionality");

		List<WebElement> columnLabels = betlistlive.getColumnLabels();

		 StringBuilder columnsText = new StringBuilder();
		    
		    for (int i = 0; i < columnLabels.size(); i++) {
		        WebElement label = columnLabels.get(i);
		        String columnName = label.getText();
		       columnsText.append((i + 1) + ". " + columnName);
		        
		        // Append a new line after each column
		        //columnsText.append(System.lineSeparator());
		        
		     // Append a line break in HTML after each column
		        //columnsText.append("<br>");

		        // Log the column name to Extent Reports
		       // test.info("Column " + (i + 1) + ": " + columnName);
		    }

		 

		    // Append the columnsText to the Extent Report
		    test.info(columnsText.toString());

		    Thread.sleep(3000);
		    betlistlive.closeColumnChooser();
		    Thread.sleep(3000);
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
