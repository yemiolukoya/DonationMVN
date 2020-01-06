package steps;

import cucumber.api.java.en.Given;
import pages.MonthlyDonationPage;
import util.TestBase;

public class £12MonthlyDonationSteps extends TestBase{
	
	@Given("^user click £(\\d+) button$")
	public void user_click_£_button(int arg1) throws Throwable {
		  monthlyDonationPage = new MonthlyDonationPage();
		  monthlyDonationPage.click£12Button();
	}

}
