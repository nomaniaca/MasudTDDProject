package Myntra.StepDef;

import Myntra.PageActions.MyntraUpdateAccountInfoActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyntraUpdateAccountInfoStepDef {
	
	MyntraUpdateAccountInfoActions accountInfoAction = new MyntraUpdateAccountInfoActions();

	@Given("Customer lands on Myntra homepage")
	public void customer_lands_on_Myntra_homepage() {
		
		accountInfoAction.getMyntraHomePage();
		accountInfoAction.verifyMyntraHomePage();
	    
	   
	}

	@When("Customer mousehover to profile")
	public void customer_mousehover_to_profile() {
		
		accountInfoAction.navigateToProfile();
	    
	   
	}

	@When("Customer clicks on Edit profile from dropdown")
	public void customer_clicks_on_Edit_profile_from_dropdown() {
		
		accountInfoAction.navigateToEditProfile();
	    
	   
	}

	
	@When("Customer put correct Email {string}")
	public void customer_put_correct_Email(String email) {
		
		accountInfoAction.inputEmail(email); 
	   
	}

	@When("Customer clicks on save details")
	public void customer_clicks_on_save_details() {
		
		accountInfoAction.clickSaveDetails();
	    
	   
	}

	@Then("Customer information will update successfully")
	public void customer_information_will_update_successfully() {
		
		accountInfoAction.verifyAcountPage();
	    
	   
	}

}