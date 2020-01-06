package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import RandomMethods.Randoms;
import util.TestBase;
import util.waitHelper;

public class MonthlyDonationPage extends TestBase {

	Randoms randoms = new Randoms();
	JavascriptExecutor executor;
	 waitHelper WaitHelper;

	@FindBy(xpath = "//a[@data-target=\".regular\"]")
	WebElement monthlyDonationButton;

	@FindBy(xpath = "//input[@id=\"option1\" and @value=\"20\"]")
	WebElement £20Button;

	@FindBy(xpath = "//input[@id=\"option2\" and @value=\"12\"]")
	WebElement £12Button;

	@FindBy(xpath = "//input[@id=\"option3\" and @value=\"5\"]")
	WebElement £5Button;

	@FindBy(id = "txtAmount")
	WebElement otherAmount;

	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement continueButton;

	@FindBy(xpath = "//*[@id=\"btnContinue\"]/span")
	WebElement continueButtonOnDonation;

	@FindBy(xpath = "//select[@data-msg-required=\"Please select your title from the list\" and @name=\"CustomerTitle\"]")
	WebElement titleDropDown;

	@FindBy(name = "CustomerFirstName")
	WebElement firstName;

	@FindBy(name = "CustomerLastName")
	WebElement lastName;

	@FindBy(name = "Email")
	WebElement emailAddress;

	@FindBy(id = "findAddressFld")
	WebElement postCode;

	@FindBy(name = "DirectDebitStartDay")
	WebElement DirectDebitStartDay;

	@FindBy(name = "DirectDebitStartMonth")
	WebElement DirectDebitStartMonth;

	@FindBy(name = "DirectDebitStartYear")
	WebElement DirectDebitStartYear;

	@FindBy(name = "DirectDebitAccountName")
	WebElement DirectDebitAccountName;

	@FindBy(name = "DirectDebitSortCode1")
	WebElement DirectDebitSortCode1;

	@FindBy(name = "DirectDebitSortCode2")
	WebElement DirectDebitSortCode2;

	@FindBy(name = "DirectDebitSortCode3")
	WebElement DirectDebitSortCode3;

	@FindBy(name = "DirectDebitAccountNo")
	WebElement DirectDebitAccountNo;

	@FindBy(xpath = "//button[@id=\"btnContinue\"]")
	WebElement ContinueButton;

	public MonthlyDonationPage() {
		PageFactory.initElements(driver, this);
		WaitHelper = new waitHelper(driver);


	}

	public void clickMonthlyDonationButton() {

		WaitHelper.WaitForElement(monthlyDonationButton, 60);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", monthlyDonationButton);

	}

	public void click£20Button() {
		WaitHelper.WaitForElement(£20Button, 60);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", £20Button);

	}

	public void click£12Button() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", £12Button);

	}

	public void click£5Button() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", £5Button);

	}

	public void EnterOtherAmount(String amount) throws InterruptedException {
		
		WaitHelper.WaitForElement(otherAmount, 60);
		otherAmount.sendKeys(amount);

//		Thread.sleep(5000);

	}

	public void clickcontinueButton() {
		WaitHelper.WaitForElement(continueButton, 30);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", continueButton);

	}

	public void clickcontinueButtonOnDonation() {


		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", continueButtonOnDonation);

	}

	public void selectTitleDropDown() {
		WaitHelper.WaitForElement(titleDropDown, 60);


		Select TitleDrpDwn = new Select(titleDropDown);
		TitleDrpDwn.selectByIndex(3);
	}

	public void enterFirstName() {
		firstName.sendKeys(randoms.getSaltString());
	}

	public void enterLastName() {

		lastName.sendKeys(randoms.getSaltString());
	}

	public void enterEmail() {

		emailAddress.sendKeys(randoms.getSaltString() + "@gmail.com");
	}

	public void enterPostCode(String postcode) throws InterruptedException {
		WaitHelper.WaitForElement(postCode, 60);

		postCode.sendKeys(postcode);


		List<WebElement> autoSuggest = driver
				.findElements(By.xpath("//div[@class=\"pca pcalist\" and @style=\"height: 216px;\"]"));

		for (WebElement a : autoSuggest)

			autoSuggest.get(0).click();



//		Thread.sleep(2000);
	}

	public void SelectDirectDebitStartDay() {
		Select StartDayDrpDwn = new Select(DirectDebitStartDay);
		StartDayDrpDwn.selectByIndex(1);
	}

	public void SelectDirectDebitStartMonth() {
		Select StartMonthDrpDwn = new Select(DirectDebitStartMonth);
		StartMonthDrpDwn.selectByIndex(1);
	}

	public void SelectDirectDebitStartYear() {
		Select StartYearDrpDwn = new Select(DirectDebitStartYear);
		StartYearDrpDwn.selectByIndex(0);
	}

	public void EnterDirectDebitAccountName() {
		DirectDebitAccountName.sendKeys(randoms.getSaltString());
	}

	public void EnterDirectDebitSortCode1() {
		DirectDebitSortCode1.sendKeys("30");
	}

	public void EnterDirectDebitSortCode2() {
		DirectDebitSortCode2.sendKeys("80");
	}

	public void EnterDirectDebitSortCode3() {
		DirectDebitSortCode3.sendKeys("88");
	}

	public void EnterDirectDebitAccountNo(String accountNo) {
		DirectDebitAccountNo.sendKeys(accountNo);
	}

	public void ClickMyDonationContinueButton() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ContinueButton);
	}

}
