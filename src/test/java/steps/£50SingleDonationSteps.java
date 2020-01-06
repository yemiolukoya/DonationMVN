package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.MonthlyDonationPage;
import pages.SingleDonationPage;
import util.TestBase;

public class £50SingleDonationSteps extends TestBase {

	@Given("^user click donate £(\\d+)$")
	public void user_click_donate_£(int arg1) throws Throwable {
		singleDonationPage = new SingleDonationPage();
		monthlyDonationPage = new MonthlyDonationPage();
		singleDonationPage.Click£50Button();
		monthlyDonationPage.clickcontinueButtonOnDonation();
	}

	@Given("^user click credit/debit card payment type$")
	public void user_click_credit_debit_card_payment_type() throws Throwable {
		singleDonationPage.ClickCreditCard();

	}

	@Given("^user enters \"([^\"]*)\"$")
	public void user_enters(String arg1) throws Throwable {
		singleDonationPage.EnterCreditCardNumber(arg1);
		singleDonationPage.EnterExpirationDate();
		singleDonationPage.EnterCvv();
		
	}
	
	@When("^user click single donation confirm page complete donation tab$")
	public void user_click_single_donation_confirm_page_complete_donation_tab() throws Throwable {
		singleDonationPage.ClickYesSameAddress();
		singleDonationPage.ClickSingleDonationCompleteBtn();
	}
	
	@Given("^user click Is this address also your billing address checkbox$")
	public void user_click_Is_this_address_also_your_billing_address_checkbox() throws Throwable {
		singleDonationPage.ClickYesSameAddress();
	}


	

}
