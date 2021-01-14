package Myntra.PageActions;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import Myntra.PageElements.MyntraWishlistElements;
import Myntra.Utilities.MyntraSetUpDrivers;

public class MyntraWishlistActions {

	MyntraWishlistElements wishlistElements = null;

	public MyntraWishlistActions() {

		this.wishlistElements = new MyntraWishlistElements();
		PageFactory.initElements(MyntraSetUpDrivers.chromeDriver, this.wishlistElements);
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

	public void navigateToMenMenu() {
		Actions action = new Actions(MyntraSetUpDrivers.chromeDriver);
		action.moveToElement(wishlistElements.menMenu);
		action.perform();

	}

	public void navigateToTShirt() {
		Actions action = new Actions(MyntraSetUpDrivers.chromeDriver);
		action.moveToElement(wishlistElements.tShirt);
		action.click();
		action.perform();
	}

	public void verifyTShirtPage() {
		if (MyntraSetUpDrivers.chromeDriver.getTitle().toLowerCase().contains("buy men's t-shirt")) {
			System.out.println("Successfully Navigated to The tshirt Page");
		} else {
			System.out.println("Navigation to the tshirt Page site failed!");
			fail();
		}

	}

	public void wishlistBtn() {
		wishlistElements.wishlistBtn.click();
	}

	public void wishlistIcon() {
		wishlistElements.wishlistIcon.click();
		;
	}

	public void verifywishlistPage() {
		if (MyntraSetUpDrivers.chromeDriver.getTitle().toLowerCase().contains("wishlist")) {
			System.out.println("Successfully Navigated to The wishlist Page");
		} else {
			System.out.println("Navigation to the wishlist Page site failed!");
			fail();
		}

	}

}
