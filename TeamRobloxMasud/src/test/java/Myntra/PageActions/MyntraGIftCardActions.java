package Myntra.PageActions;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import Myntra.PageElements.MyntraGiftCradElements;
import Myntra.Utilities.MyntraSetUpDrivers;

public class MyntraGIftCardActions {

	MyntraGiftCradElements giftCardElements = null;

	public MyntraGIftCardActions() {
		this.giftCardElements = new MyntraGiftCradElements();
		PageFactory.initElements(MyntraSetUpDrivers.chromeDriver, this.giftCardElements);
	}

	public void getMyntraHomePage() {
		MyntraSetUpDrivers.chromeDriver.get("https://www.myntra.com/");
		MyntraSetUpDrivers.chromeDriver.manage().window().maximize();
		MyntraSetUpDrivers.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

	public void verifyMyntraHomePage() {
		if (MyntraSetUpDrivers.chromeDriver.getTitle().toLowerCase().contains("myntra")) {
			System.out.println("Successfully Navigated to The Myntra Home Page");
		} else {
			System.out.println("Navigation to the Myntra Home Page site failed!");
			fail();
		}

	}

	public void navigateToProfileMenu() {
		Actions action = new Actions(MyntraSetUpDrivers.chromeDriver);
		action.moveToElement(giftCardElements.profile);
		action.perform();

	}

	public void navigateToGiftCard() {
		Actions action = new Actions(MyntraSetUpDrivers.chromeDriver);
		action.moveToElement(giftCardElements.giftCard);
		action.click();
		action.perform();
	}

	public void verifyGiftCardPage() {
		if (MyntraSetUpDrivers.chromeDriver.getTitle().toLowerCase().contains("gift cards")) {
			System.out.println("Successfully Navigated to The Myntra gift card Page");
		} else {
			System.out.println("Navigation to the Myntra gift card Page failed!");
			fail();
		}

	}

	public void clicksSendGiftCard() {
		giftCardElements.sendGiftCardBtn.click();

	}

	public void clicksOnBirthday() {
		giftCardElements.BirthdayBtn.click();

	}

	public void clicksOnNext() {
		giftCardElements.NextBtn.click();

	}

	public void inputPhoneNumber(String phonenumber) {
		giftCardElements.phonenumber.sendKeys(phonenumber);
	}

	public void continueBtn() {
		giftCardElements.continueBtn.click();
	}

	public void clickPasswordBtn() {
		giftCardElements.passwordBtn.click();
	}

	public void inputPassword(String password) {
		giftCardElements.password.sendKeys(password);
	}

	public void clickLoginBtn() {
		giftCardElements.LoginBtn.click();
	}

	public void clickOnChooseAmount() {
		giftCardElements.Chooseamount.click();
	}

	public void inputReceipentEmail() {
		giftCardElements.email.sendKeys("nomaniaca@yahoo.com");
	}

	public void inputName(String name) {
		giftCardElements.name.sendKeys(name);
	}

	public void clickOnPreview() {
		giftCardElements.showPreview.click();
	}

	public void verifyShowPreviewPage() {
		if (MyntraSetUpDrivers.chromeDriver.getTitle().toLowerCase().contains("Preview")) {
			System.out.println("Successfully Navigated to the Myntra Gift Card Preview Page");
		} else {
			System.out.println("Navigation to the Myntra Gift Card Preview Page failed!");
			fail();
		}

	}

}
