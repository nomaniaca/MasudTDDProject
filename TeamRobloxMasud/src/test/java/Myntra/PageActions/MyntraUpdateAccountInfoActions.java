package Myntra.PageActions;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import Myntra.PageElements.MyntraUpdateAccountInfoElements;
import Myntra.PageElements.MyntraWishlistElements;
import Myntra.Utilities.MyntraSetUpDrivers;

public class MyntraUpdateAccountInfoActions {

	MyntraUpdateAccountInfoElements accountInfoElements = null;

	public MyntraUpdateAccountInfoActions() {

		this.accountInfoElements = new MyntraUpdateAccountInfoElements();
		PageFactory.initElements(MyntraSetUpDrivers.chromeDriver, this.accountInfoElements);
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

	public void navigateToProfile() {
		Actions action = new Actions(MyntraSetUpDrivers.chromeDriver);
		action.moveToElement(accountInfoElements.profile);
		action.perform();

	}

	public void navigateToEditProfile() {
		Actions action = new Actions(MyntraSetUpDrivers.chromeDriver);
		action.moveToElement(accountInfoElements.editProfile);
		action.click();
		action.perform();
	}

	public void verifyEditProfilePage() {
		if (MyntraSetUpDrivers.chromeDriver.getTitle().toLowerCase().contains("profile")) {
			System.out.println("Successfully Navigated to The Edit Profile Page");
		} else {
			System.out.println("Navigation to the Edit Profile Page site failed!");
			fail();
		}

	}

	public void inputEmail(String email) {
		accountInfoElements.email.sendKeys(email);

	}

	public void clickSaveDetails() {

		accountInfoElements.savedetails.click();

	}
	
	public void verifyAcountPage() {
		if (MyntraSetUpDrivers.chromeDriver.getTitle().toLowerCase().contains("Update profile")) {
			System.out.println("Successfully Navigated to The Update Profile Page");
		} else {
			System.out.println("Navigation to the Update Profile Page site failed!");
			fail();
		}

	}

}
