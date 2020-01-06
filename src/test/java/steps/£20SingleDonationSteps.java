package steps;

import cucumber.api.java.en.Given;
import pages.SingleDonationPage;
import util.TestBase;

public class £20SingleDonationSteps extends TestBase{

	@Given("^user click donate twenty pound$")
	public void user_click_donate_twenty_pound() throws Throwable {
	   
		singleDonationPage = new SingleDonationPage();
		singleDonationPage.Click£20Button();

	}
}
