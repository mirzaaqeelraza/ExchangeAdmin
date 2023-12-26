package com.ExchangeAdmin.AdminSettingPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminSettingPage {

	WebDriver driver;

	public AdminSettingPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text() =\"Admin Setting\"]")
	WebElement adminsetting;

	
	public WebElement Admin_SettingPage() {
		return adminsetting;
	}
}