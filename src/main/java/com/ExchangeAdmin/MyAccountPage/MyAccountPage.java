package com.ExchangeAdmin.MyAccountPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
	
WebDriver driver;
	
	public MyAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()=\"My Account\"]")
	WebElement myAccount;
	
	public WebElement My_AccountPage() {
		return myAccount;
	}
	
	@FindBy(xpath="//div[@role=\"tablist\"]//child::button[@id=\"full-width-tab-1\"]")
	WebElement clickPaymentHistory;
	
	public void ClickedPaymentHistory() {
		clickPaymentHistory.click();
	}
	
	@FindBy(xpath="//div[@role=\"tablist\"]//child::button[@id=\"full-width-tab-2\"]")
	WebElement clickLedgerHistory;
	
	public void ClickedLedgerHistory() {
		clickLedgerHistory.click();
	}
	
	@FindBy(xpath="//div[@role=\"tablist\"]//child::button[@id=\"full-width-tab-0\"]")
	WebElement clickProfile;
	
	public void ClickedProfile() {
		clickProfile.click();
	}
	
	@FindBy(xpath="//div[@role=\"tablist\"]//child::button[@id=\"full-width-tab-3\"]")
	WebElement clickActivityLog;
	
	public void ClickedactivityLog() {
		clickActivityLog.click();
	}
	
	/*
	 * @FindBy(xpath = "//iframe[@title=\"Secure payment input frame\"]") WebElement
	 * iframe;
	 * 
	 * @FindBy(xpath = "//input[@id=\"Field-numberInput\"]") WebElement
	 * cardNumberInput;
	 * 
	 * @FindBy(xpath = "//input[@id=\"Field-expiryInput\"]") WebElement expiryInput;
	 * 
	 * @FindBy(xpath = "//input[@id=\"Field-cvcInput\"]") WebElement cvcInput;
	 * 
	 * @FindBy(xpath = "//button[@id=\"submit\"]") WebElement submitButton;
	 * 
	 * 
	 * public void switchToPaymentFrame() { driver.switchTo().frame(iframe); }
	 * 
	 * public void switchToDefaultContent() { driver.switchTo().defaultContent(); }
	 * 
	 * public void enterCardNumber(String cardNumber) {
	 * cardNumberInput.sendKeys(cardNumber); }
	 * 
	 * public void enterExpiry(String expiry) { expiryInput.sendKeys(expiry); }
	 * 
	 * public void enterCVC(String cvc) { cvcInput.sendKeys(cvc); }
	 * 
	 * public void clickSubmitButton() { submitButton.click(); }
	 */
}
