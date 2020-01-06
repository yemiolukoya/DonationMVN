package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.MonthlyDonationPage;
import pages.SingleDonationPage;
import util.TestBase;

public class £20MonthlyDonationSteps extends TestBase{
	
	@Given("^user navigate to https://alzheimers-donations\\.wpnc-uat\\.site/$")
	public void user_navigate_to_https_alzheimers_donations_wpnc_uat_site() throws Throwable {
	  TestBase.initialization();
	  monthlyDonationPage = new MonthlyDonationPage();
		singleDonationPage = new SingleDonationPage();

	}

	@Given("^user click on monthly donation tab$")
	public void user_click_on_monthly_donation_tab() throws Throwable {
		monthlyDonationPage.clickMonthlyDonationButton();
	   
	}

	@Given("^user click £(\\d+) tab$")
	public void user_click_£_tab(int arg1) throws Throwable {
		monthlyDonationPage.click£20Button();
	   
	}

	@Given("^user click landing page continue tab$")
	public void user_click_landing_page_continue_tab() throws Throwable {
		monthlyDonationPage.clickcontinueButton();
	    
	}

	@Given("^user click donation amount continue tab$")
	public void user_click_donation_amount_continue_tab() throws Throwable {
		monthlyDonationPage.clickcontinueButton();
	  
	}

	@Given("^user fill my detail page$")
	public void user_fill_my_detail_page() throws Throwable {
		monthlyDonationPage.selectTitleDropDown();
		monthlyDonationPage.enterFirstName();
		monthlyDonationPage.enterLastName();
		monthlyDonationPage.enterEmail();
	    
	}

	@Given("^user fill my address page$")
	public void user_fill_my_address_page() throws Throwable {
		monthlyDonationPage.enterPostCode("Se12jj");

	   
	}

	@Given("^user fill direct debit detail page$")
	public void user_fill_direct_debit_detail_page() throws Throwable {
		monthlyDonationPage.EnterDirectDebitAccountName();
		monthlyDonationPage.EnterDirectDebitSortCode1();
		monthlyDonationPage.EnterDirectDebitSortCode2();
		monthlyDonationPage.EnterDirectDebitSortCode3();
		monthlyDonationPage.EnterDirectDebitAccountNo("14457846");
	   
	}

	@Given("^user click your details continue tab$")
	public void user_click_your_details_continue_tab() throws Throwable {
		monthlyDonationPage.clickcontinueButtonOnDonation();
	    
	}

	@When("^user click confirm page complete donation tab$")
	public void user_click_confirm_page_complete_donation_tab() throws Throwable {
		monthlyDonationPage.ClickMyDonationContinueButton();
	   
	}

	@Then("^Thank you for your donation page should be displayed$")
	public void thank_you_for_your_donation_page_should_be_displayed() throws Throwable {
		driver.quit();
	    
	}



}
