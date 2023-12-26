/*
package com.ExchangeAdmin.MyReportsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyReportPage {

	WebDriver driver;

	public MyReportPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text() =\"My Report\"]")
	WebElement myreport;

	@FindBy(xpath = "//input[@name=\"userId\"]")
	WebElement searchbyuserid;
	
	@FindBy(xpath = "//input[@name=\"eventId\"]")
	WebElement searchbyeventid;
	

	@FindBy(xpath = "//div[@class=\"pt-2 px-1 flex flex-col gap-4\"]//child::button[text()=\"Search\"]")
	WebElement searchbutton;
	
	@FindBy(xpath = "//div[@class=\"pt-2 px-1 flex flex-col gap-4\"]//child::button[text()=\"Reset\"]")
	WebElement resetbutton;

	@FindBy(xpath="//label[@for=\"FANCY\"]")
	WebElement fancy;
	
	@FindBy(xpath="//label[@for=\"BOOK_MAKER\"]")
	WebElement bookmaker;
	
	@FindBy(xpath="//label[@for=\"BET_FAIR\"]")
	WebElement betfair;
	
	@FindBy(xpath="//div[@class=\"pt-2 px-1 flex flex-col gap-4\"]//child::input[@name=\"Start Date\"]")
	WebElement startdate;
	
	@FindBy(xpath="//div[@class=\"pt-2 px-1 flex flex-col gap-4\"]//child::input[@name=\"End Date\"]")
	WebElement enddate;
	
	

	
	

	public WebElement My_ReportPage() {
		return myreport;
	}

	public WebElement Search_UserID() {
		return searchbyuserid;
	}
	
	public WebElement Search_EventID() {
		return searchbyeventid;
	}


	public WebElement SearchButton() {
		return searchbutton;
	}
	
	public WebElement ResetButton() {
		return resetbutton;
	}
	

	public void clickOnFancy() {
		// Check if the radio button is not already selected (optional)
		if (!fancy.isSelected()) {
			// Click the radio button
			fancy.click();
		}
	}
	
	public void clickOnBM() {
		// Check if the radio button is not already selected (optional)
		if (!bookmaker.isSelected()) {
			// Click the radio button
			bookmaker.click();
		}
	}
	
	public void clickOnBetfair() {
		// Check if the radio button is not already selected (optional)
		if (!betfair.isSelected()) {
			// Click the radio button
			betfair.click();
		}
	}  */
	
	/* public void clickOnRadioButton() {
		
		 //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // Adjust the timeout as needed


	    // Wait for the radio button to be clickable
	   // wait.until(ExpectedConditions.elementToBeClickable(radioButton));
        // Check if the radio button is displayed and enabled
        if (betfair.isDisplayed() && betfair.isEnabled()) {
            // Check if the radio button is not already selected (optional)
            if (!betfair.isSelected()) {
                // Scroll to the element if needed
                // You can use JavaScriptExecutor for scrolling if required
                // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", radioButton);

                // Click the radio button
                radioButton.click();

                // You can perform additional actions or assertions after clicking the radio button if needed
            }
        } else {
            System.out.println("Radio button is not interactable");
          
            
        }
    } 
      */
	
/*
	public WebElement ClickonStartDate() {
		return startdate;
	}
	
	public WebElement ClickonEndDate() {
		return enddate;
	}
}

*/

/////////////////////////////////////////////////////////////////////////////////////////////////////////

package com.ExchangeAdmin.MyReportsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyReportPage {

    WebDriver driver;

    @FindBy(xpath = "//a[text() =\"My Report\"]")
    WebElement myreport;

    @FindBy(xpath = "//input[@name=\"userId\"]")
    WebElement searchbyuserid;

    @FindBy(xpath = "//input[@name=\"eventId\"]")
    WebElement searchbyeventid;

    @FindBy(xpath = "//div[@class=\"pt-2 px-1 flex flex-col gap-4\"]//child::button[text()=\"Search\"]")
    WebElement searchbutton;

    @FindBy(xpath = "//div[@class=\"pt-2 px-1 flex flex-col gap-4\"]//child::button[text()=\"Reset\"]")
    WebElement resetbutton;

    @FindBy(xpath = "//label[@for=\"FANCY\"]")
    WebElement fancy;

    @FindBy(xpath = "//label[@for=\"BOOK_MAKER\"]")
    WebElement bookmaker;

    @FindBy(xpath = "//label[@for=\"BET_FAIR\"]")
    WebElement betfair;

    @FindBy(xpath = "//div[@class=\"pt-2 px-1 flex flex-col gap-4\"]//child::input[@name=\"Start Date\"]")
    WebElement startdate;

    @FindBy(xpath = "//div[@class=\"pt-2 px-1 flex flex-col gap-4\"]//child::input[@name=\"End Date\"]")
    WebElement enddate;

    public MyReportPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement My_ReportPage() {
        return myreport;
    }

    public WebElement Search_UserID() {
        return searchbyuserid;
    }

    public WebElement Search_EventID() {
        return searchbyeventid;
    }

    public WebElement SearchButton() {
        return searchbutton;
    }

    public WebElement ResetButton() {
        return resetbutton;
    }

    public void clickOnFancy() {
        try {
            if (!fancy.isSelected()) {
                fancy.click();
            }
        } catch (Exception e) {
            System.out.println("Exception while clicking on Fancy: " + e.getMessage());
        }
    }

    public void clickOnBM() {
        try {
            if (!bookmaker.isSelected()) {
                bookmaker.click();
            }
        } catch (Exception e) {
            System.out.println("Exception while clicking on Bookmaker: " + e.getMessage());
        }
    }

    public void clickOnBetfair() {
        try {
            if (!betfair.isSelected()) {
                betfair.click();
            }
        } catch (Exception e) {
            System.out.println("Exception while clicking on Betfair: " + e.getMessage());
        }
    }

    public WebElement ClickonStartDate() {
        return startdate;
    }

    public WebElement ClickonEndDate() {
        return enddate;
    }
}





