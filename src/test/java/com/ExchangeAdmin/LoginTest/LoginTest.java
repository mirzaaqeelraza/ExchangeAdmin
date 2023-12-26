/*
package com.ExchangeAdmin.LoginTest;

import java.io.IOException;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ExchangeAdmin.LoginPage.AccountPage;
import com.ExchangeAdmin.LoginPage.LoginPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import resources.BaseTest;

public class LoginTest extends BaseTest {

	Logger log;
	public WebDriver driver;
	private ExtentReports extent;
	private ExtentTest test;

	@BeforeTest
	public void setup() {
		extent = new ExtentReports();
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter("reportPath");
		extent.attachReporter(sparkReporter);
	}

	@Test(dataProvider = "LoginTestData") // LoginTestData
	// @Test(dataProvider = "loginData")
	public void login(String userName, String passWord, String expectedResult)
			throws IOException, InterruptedException {

		// log = LogManager.getLogger(LoginTest.class.getName());
		LoginPage loginpage = new LoginPage(driver);
		// loginpage.mylogin().click();
		// log.debug("Clicked on Login");
		Thread.sleep(3000);
		// loginpage.email().sendKeys(prop.getProperty(userName));
		// loginpage.password().sendKeys(prop.getProperty(passWord));
		// loginpage.email().sendKeys(userName);
		// loginpage.mobile().sendKeys(userName);
		loginpage.Email_UserName().sendKeys(userName);
		log.debug("Emai / UserName Number is entered");
		loginpage.password().sendKeys(passWord);
		log.debug("Password is entered");
		Thread.sleep(3000);
		// loginpage.Continue().click();
		loginpage.login().click();
		log.debug("Clicked on login button");

		Thread.sleep(3000);

		AccountPage account = new AccountPage(driver);
		String actualResult = null;

		try {
			if (account.myAccount().isEnabled()) {
				actualResult = "Success";
			}
		} catch (Exception e) {
			actualResult = "Failure";
		}

		/*
		 * String logMessage = "User got ";
		 * 
		 * if (actualResult.equals("Success")) { logMessage +=
		 * "successfully logged in using Email / Username: " + userName +
		 * " and Password: " + passWord; } else { logMessage +=
		 * "failed to log in using Email / Username: " + userName + " and Password: " +
		 * passWord; }
		 * 
		 */
		/*String logMessage = "User got ";

		if (actualResult.equals("Success")) {
			logMessage += "successfully logged in using Email / Username: " + userName + " and Password: " + passWord;
			test.log(Status.PASS, logMessage);
		} else {
			logMessage += "failed to log in using Email / Username: " + userName + " and Password: " + passWord;
			test.log(Status.FAIL, logMessage);
		}

		// Reporter.log(logMessage);
		Reporter.log("<font color='dark green'>" + logMessage + "</font>");

		// Reporter.log("Test executed with the following data: Username: " + userName +
		// ", Password: " + passWord + ", Expected Result: " + expectedResult);
		Assert.assertEquals(actualResult, expectedResult);
		// log.info("Login Test got closed");
		test.log(Status.PASS, "Login Test got closed");
	}

	/*
	 * @BeforeMethod public void openApplication() throws IOException { log =
	 * LogManager.getLogger(LoginTest.class.getName()); driver =
	 * initializeBrowser(); log.debug("Browser got launched");
	 * driver.get(prop.getProperty("url"));
	 * log.debug("Navigated to Application URL"); }
	 * 
	 * @AfterMethod public void closure() { driver.close();
	 * log.debug("Browser got closed");
	 * 
	 * }
	 */

	/*@BeforeClass
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

	@DataProvider(name = "LoginTestData")
	// @DataProvider()
	public Object[][] loginData() {
		Object[][] data = new Object[6][3];

		data[0][0] = "superdmin@gmail.com";
		data[0][1] = "123456";
		data[0][2] = "Success";

		data[1][0] = "superdmin@gmail.com";
		data[1][1] = "11";
		data[1][2] = "Failure";

		data[2][0] = "superadmin@gmail.com";
		data[2][1] = "123456";
		data[2][2] = "Failure";

		data[3][0] = "superdmin@gmail.com";
		data[3][1] = "";
		data[3][2] = "Failure";

		data[4][0] = " ";
		data[4][1] = "12346";
		data[4][2] = "Failure";

		data[5][0] = " ";
		data[5][1] = "";
		data[5][2] = "Failure";

		return data;

	}

}

*/

package com.ExchangeAdmin.LoginTest;

import java.io.IOException;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.ExchangeAdmin.LoginPage.AccountPage;
import com.ExchangeAdmin.LoginPage.LoginPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import resources.BaseTest;

public class LoginTest extends BaseTest {

   // Logger log;
    public WebDriver driver;
    private ExtentReports extent;
    private ExtentTest test;

    @BeforeTest
    public void setup() {
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("reportPath");
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
    }

    @BeforeMethod
    public void openApplication() throws IOException {
        String reportPath = System.getProperty("user.dir") + "\\reports\\index.html";
        driver = initializeBrowser();
        test = extent.createTest("Open Application"); // Initialize the test object
        test.log(Status.PASS, "Browser got launched");
        Reporter.log("<font color='green'>Browser got launched</font>");
        driver.get(prop.getProperty("url"));
        test.log(Status.PASS, "Navigated to Application URL");
        Reporter.log("<font color='green'>Navigated to Application UR</font>");
    }

    /*
    @Test(dataProvider = "LoginTestData")
    public void login(String userName, String passWord, String expectedResult)
            throws IOException, InterruptedException {
        LoginPage loginpage = new LoginPage(driver);
        loginpage.Email_UserName().sendKeys(userName);
       // log.debug("Email / Username is entered");
        loginpage.password().sendKeys(passWord);
       // log.debug("Password is entered");
        Thread.sleep(3000);
        loginpage.login().click();
       // log.debug("Clicked on login button");

        Thread.sleep(3000);

        AccountPage account = new AccountPage(driver);
        String actualResult = null;

        try {
            if (account.myAccount().isDisplayed()) {
                actualResult = "Success";
            }
        } catch (Exception e) {
            actualResult = "Failure";
        }

        String logMessage = "User got ";

        if (actualResult.equals("Success")) {
            logMessage += "successfully logged in using Email / Username: " + userName + " and Password: " + passWord;
            test.log(Status.PASS, logMessage);
        } else {
            logMessage += "failed to log in using Email / Username: " + userName + " and Password: " + passWord;
            test.log(Status.FAIL, logMessage);
        }

        Reporter.log("<font color='dark green'>" + logMessage + "</font>");
        Assert.assertEquals(actualResult, expectedResult);
        test.log(Status.PASS, "Login Test got closed");
    }  */

    @Test(dataProvider = "LoginTestData")
    public void login(String userName, String passWord, String expectedResult)
            throws IOException, InterruptedException {
        LoginPage loginpage = new LoginPage(driver);
        loginpage.Email_UserName().sendKeys(userName);
        loginpage.password().sendKeys(passWord);
        Thread.sleep(3000);
        loginpage.login().click();
        Thread.sleep(3000);

        AccountPage account = new AccountPage(driver);
        String actualResult = null;

        try {
            if (account.MyAccount().isDisplayed()) {
                actualResult = "Success";
            }
        } catch (Exception e) {
            actualResult = "Failure";
        }

        String logMessage = "User got ";

        if (actualResult.equals("Success")) {
            logMessage += "successfully logged in using Email / Username: " + userName + " and Password: " + passWord;
            test.log(Status.PASS, logMessage);
        } else {
            logMessage += "failed to log in using Email / Username: " + userName + " and Password: " + passWord;
            test.log(Status.FAIL, logMessage);
        }

        Reporter.log("<font color='dark green'>" + logMessage + "</font>");
        System.out.println("Actual Result: " + actualResult);
        System.out.println("Expected Result: " + expectedResult);

        Assert.assertEquals(actualResult, expectedResult, "Test failed for username: " + userName);
        test.log(Status.PASS, "Login Test got closed");
    }
    @AfterMethod
    public void closure() {
        driver.close();
        test.log(Status.PASS, "Browser got closed");
        Reporter.log("<font color='green'>Browser got closed</font>");
    }

    @AfterTest
    public void reportTeardown() {
        extent.flush();
    }

    @DataProvider(name = "LoginTestData")
    public Object[][] loginData() {
        Object[][] data = new Object[6][3];

        data[0][0] = "superdmin@gmail.com";
		data[0][1] = "123456";
		data[0][2] = "Success";

		data[1][0] = "superdmin@gmail.com";
		data[1][1] = "11";
		data[1][2] = "Failure";

		data[2][0] = "superadmin@gmail.com";
		data[2][1] = "123456";
		data[2][2] = "Failure";

		data[3][0] = "superdmin@gmail.com";
		data[3][1] = "";
		data[3][2] = "Failure";

		data[4][0] = " ";
		data[4][1] = "12346";
		data[4][2] = "Failure";

		data[5][0] = " ";
		data[5][1] = "";
		data[5][2] = "Failure";
        return data;
    }
}



