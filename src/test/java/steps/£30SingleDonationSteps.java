package steps;

import cucumber.api.java.en.Given;
import pages.SingleDonationPage;
import util.TestBase;

public class £30SingleDonationSteps extends TestBase{
	
	@Given("^user click donate (\\d+) pounds$")
	public void user_click_donate_pounds(int arg1) throws Throwable {
	   
		singleDonationPage = new SingleDonationPage();
		singleDonationPage.Click£30Button();
		
	}

}
