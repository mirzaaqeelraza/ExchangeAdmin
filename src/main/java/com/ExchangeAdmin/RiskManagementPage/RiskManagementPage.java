package com.ExchangeAdmin.RiskManagementPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RiskManagementPage {

	WebDriver driver;

	public RiskManagementPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text() =\"Risk Management\"]")
	WebElement riskmanagement;

	
	public WebElement Risk_ManagementPage() {
		return riskmanagement;
	}
}