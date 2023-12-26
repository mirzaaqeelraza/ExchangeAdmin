/*
 * package com.ExchangeAdmin.LoginPage;
 * 
 * public class MyAccountPage {
 * 
 * }
 */

package com.ExchangeAdmin.LoginPage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {

	WebDriver driver;

	public AccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	 @FindBy(xpath = "//a[text()=\"My Account\"]")   ////button[@class="page_log_btn__3tNNt page_profile__zP7Lk"]
	 WebElement myAccountPage;

	 public WebElement MyAccount() {
	 return myAccountPage;
	 }
	 
}