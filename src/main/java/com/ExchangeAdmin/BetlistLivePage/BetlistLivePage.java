package com.ExchangeAdmin.BetlistLivePage;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BetlistLivePage {

	WebDriver driver;

	public BetlistLivePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text() =\"Betlist Live\"]")
	WebElement myBetlistLive;
	
	@FindBy(xpath = "//button[@id=\"long-button\"]")
    WebElement columnChooserButton;

    //@FindBy(xpath = "//ul[@class=\"MuiList-root MuiList-padding MuiMenu-list css-r8u8y9\"]")
    //List<WebElement> columnCheckboxes;
    
    @FindBy(xpath = "//ul[@role=\"menu\"]")
    List<WebElement> columnLabels;

    public List<WebElement> getColumnLabels() {
        return columnLabels;
    }

    @FindBy(xpath = "//div[@id=\"long-menu\"]")
    WebElement closeColumnChooserButton;

	
	public WebElement My_BetlistLivePage() {
		// TODO Auto-generated method stub
		return myBetlistLive;
	}
	
	public void openColumnChooser() {
        columnChooserButton.click();
    }

    //public List<WebElement> getColumnCheckboxes() {
        //return columnCheckboxes;
    //}

    public void closeColumnChooser() {
        closeColumnChooserButton.click();
    }
}

