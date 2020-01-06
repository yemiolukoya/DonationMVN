package steps;

import cucumber.api.java.en.Given;
import util.TestBase;

public class £5MonthlyDonationSteps extends TestBase{
	
	@Given("^user click £(\\d+) donation$")
	public void user_click_£_donation(int arg1) throws Throwable {
		monthlyDonationPage.click£5Button();
	}


}
