package com.ExchangeAdmin.BetlistPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BetlistPage {

	WebDriver driver;

	public BetlistPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()=\"Betlist\"]")
	WebElement myBetlist;

	
	public WebElement My_BetlistPage() {
		// TODO Auto-generated method stub
		return myBetlist;
	}
	
	

	/*
	 * @FindBy(xpath =
	 * "//div[@role=\"tablist\"]//child::button[@id=\"full-width-tab-1\"]")
	 * WebElement clickPaymentHistory;
	 * 
	 * public void ClickedPaymentHistory() { clickPaymentHistory.click(); }
	 * 
	 * @FindBy(xpath =
	 * "//div[@role=\"tablist\"]//child::button[@id=\"full-width-tab-2\"]")
	 * WebElement clickLedgerHistory;
	 * 
	 * public void ClickedLedgerHistory() { clickLedgerHistory.click(); }
	 * 
	 * @FindBy(xpath =
	 * "//div[@role=\"tablist\"]//child::button[@id=\"full-width-tab-0\"]")
	 * WebElement clickProfile;
	 * 
	 * public void ClickedProfile() { clickProfile.click(); }
	 * 
	 * @FindBy(xpath =
	 * "//div[@role=\"tablist\"]//child::button[@id=\"full-width-tab-3\"]")
	 * WebElement clickActivityLog;
	 * 
	 * public void ClickedactivityLog() { clickActivityLog.click(); }
	 */
}
