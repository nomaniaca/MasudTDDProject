package com.ups.pageActions;

import org.openqa.selenium.WebDriver;

import com.ups.pageElements.UpsShippingPageElements;

public class UpsShippingPageActions {
	
	WebDriver driver;
	UpsShippingPageElements shippingPage;

	public UpsShippingPageActions(WebDriver driver) {

	this.shippingPage = new UpsShippingPageElements(driver);
	}

	public void handlecookie() {
	shippingPage.cookieButton().click();
	}

	public void clickShippingBtn() {
	shippingPage.shippingButton().click();;
	}

	public void clickCreateShipping() {
	shippingPage.createShipment().click();
	}

	public void enterName() {
	shippingPage.name().sendKeys("Masud Nomani");
	}

	public void enterContact() {
	shippingPage.contactName().sendKeys("Ruhi Tabassum");
	}

	public void enterAddress() {
	shippingPage.address().sendKeys("Long Beach, NY");
	}

	/*public void enterzipcode() {
	shippingPage.address().sendKeys("16735");
	}

	public void entercity() {
	shippingPage.address().sendKeys("Los Angeles");
	}*/

	public void enterEmail() {
	shippingPage.email().sendKeys("nomani@yahoo.com");
	}

	public void enterPhone() {
	shippingPage.phone().sendKeys("026754908");
	}

	public void clickContinue() {
	shippingPage.continueButton().click();
	}

	/*public String errorMessage() {
	String msg;
	return msg = shippingPage.errorMessage().getText();

	}*/

}
