package Myntra.StepDef;

import Myntra.PageActions.MyntraGIftCardActions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyntraGiftCardStepDef {

	MyntraGIftCardActions giftCradAction = new MyntraGIftCardActions();

	@When("Customer click on Gift Cards")
	public void customer_click_on_Gift_Cards() {

		giftCradAction.navigateToGiftCard();
		giftCradAction.verifyGiftCardPage();
	}

	@When("Customer click on send gift card")
	public void customer_click_on_send_gift_card() {
		
		giftCradAction.clicksSendGiftCard();

	}

	@When("Customer click on birthday")
	public void customer_click_on_birthday() {

		giftCradAction.clicksOnBirthday();

	}

	@When("customer click on next")
	public void customer_click_on_next() {

		giftCradAction.clicksOnNext();

	}

	@When("Customer put correct phonenumber {string}")
	public void customer_put_correct_phonenumber(String phonenumber) {

		giftCradAction.inputPhoneNumber(phonenumber);

	}

	@When("Customer clicks on continue Btn")
	public void customer_clicks_on_continue_Btn() {

		giftCradAction.continueBtn();

	}

	@When("Customer clicks on password Btn")
	public void customer_clicks_on_password_Btn() {

		giftCradAction.clickPasswordBtn();

	}

	@When("Customer put correct password {string}")
	public void customer_put_correct_password(String password) {

		giftCradAction.inputPassword(password);

	}

	@When("Customer clicks on LogIn button")
	public void customer_clicks_on_LogIn_button() {

		giftCradAction.clickLoginBtn();

	}

	@When("customer click on choose amount")
	public void customer_click_on_choose_amount() {

		giftCradAction.clickOnChooseAmount();

	}

	@When("customer put receipent email")
	public void customer_put_receipent_email_nomani_yahoo_com() {

		giftCradAction.inputReceipentEmail();

	}

	@When("customer put receipent name {string}")
	public void customer_put_receipent_name(String name) {

		giftCradAction.inputName(name);

	}

	@When("customer click on show preview")
	public void customer_click_on_show_preview() {

		giftCradAction.clickOnPreview();

	}

	@Then("Customer should able to see show preview page")
	public void customer_should_able_to_see_show_preview_page() {

		giftCradAction.verifyShowPreviewPage();

	}

}
