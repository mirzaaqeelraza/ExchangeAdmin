package com.ExchangeAdmin.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.BaseTest;

public class LoginPage extends BaseTest {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id=\"userName\"]") 
	WebElement Email_userName;

	@FindBy(xpath = "//input[@id=\"password\"]")  
	WebElement Password;

	@FindBy(xpath = "//button[text()=\"Submit\"]")  
	WebElement login_Page;

	public WebElement Email_UserName() {
		return  Email_userName;
	}

	public WebElement password() {
		return Password;
	}

	public WebElement login() {
		return login_Page;
	}

}