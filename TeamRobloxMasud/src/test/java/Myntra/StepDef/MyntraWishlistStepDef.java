package Myntra.StepDef;

import Myntra.PageActions.MyntraWishlistActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyntraWishlistStepDef {

	MyntraWishlistActions wishlistAction = new MyntraWishlistActions();

	@Given("Customer land on Myntra homepage <\" https:\\/\\/www.myntra.com\\/\">")
	public void customer_land_on_Myntra_homepage_https_www_myntra_com() {
		
		wishlistAction.getMyntraHomePage();
		wishlistAction.verifyMyntraHomePage();

	}

	@When("Customer mousehover to men")
	public void customer_mousehover_to_men() {
		
		wishlistAction.navigateToMenMenu();

	}

	@When("Customer click on T-shirt")
	public void customer_click_on_T_shirt() {
		
		wishlistAction.navigateToTShirt();

	}

	@When("Customer click on wishlist btn")
	public void customer_click_on_wishlist_btn() {
		
		wishlistAction.wishlistBtn();

	}

	@When("Customer click on wishlist manubar")
	public void customer_click_on_wishlist_manubar() {
		
		wishlistAction.wishlistIcon();

	}

	@Then("Customer should be able to see product appears on Wishlist page")
	public void customer_should_be_able_to_see_product_appears_on_Wishlist_page() {
		

	}

}
