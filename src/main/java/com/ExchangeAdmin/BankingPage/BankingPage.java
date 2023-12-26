package com.ExchangeAdmin.BankingPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankingPage {

	WebDriver driver;

	public BankingPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text() =\"Banking\"]")
	WebElement banking;

	
	public WebElement Banking_Page() {
		return banking;
	}
}