package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.TestBase;
import util.waitHelper;

public class SingleDonationPage extends TestBase {
	JavascriptExecutor executor;
	waitHelper WaitHelper;

	@FindBy(xpath = "//a[@data-target=\".oneoff\"]")
	WebElement singleDonationButton;

	@FindBy(xpath = "//*[@id=\"main\"]/section[2]/div/div/div[2]/ul/li[1]/p[2]/a")
	WebElement £50Button;

	@FindBy(xpath = "//a[@href=\"/home/single-donation-amount/?amount=30\"]")
	WebElement £30Button;

	@FindBy(xpath = "//a[@href=\"/home/single-donation-amount/?amount=20\"]")
	WebElement £20Button;

	@FindBy(xpath = "//input[@id=\"txtAmount\" and @name=\"tamount\"]")
	WebElement otherAmount;

	@FindBy(xpath = "//a[@class=\"c-payment-buttons__button e-button c-payment-buttons__button_credit\"]")
	WebElement creditCard;

	@FindBy(id = "credit-card-number")
	WebElement creditCardNumber;

	@FindBy(name = "expiration")
	WebElement expirationDate;

	@FindBy(id = "cvv")
	WebElement cvv;

	@FindBy(xpath = "//input[@id=\"AddressSameYes\"]")
	WebElement yesSameAddress;

	@FindBy(id = "btnCompleteSingleDonation")
	WebElement singleDonationCompleteBtn;

	public SingleDonationPage() {
		PageFactory.initElements(driver, this);
		WaitHelper = new waitHelper(driver);

	}

	public void ClickSingleDonationButton() {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(singleDonationButton));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", singleDonationButton);

	}

	public void Click£50Button() {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(£50Button));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", £50Button);

	}

	public void Click£30Button() {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(£30Button));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", £30Button);

	}

	public void Click£20Button() {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(£20Button));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", £20Button);

	}

	public void EnterOtherAmount(String amount) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(otherAmount));

		otherAmount.sendKeys(amount);

	}

	public void ClickCreditCard() throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver, 90);
//		wait.until(ExpectedConditions.visibilityOf(creditCard));
		
		WaitHelper.WaitForElement(creditCard, 60);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", creditCard);


	}

	public void EnterCreditCardNumber(String cardNumber) throws InterruptedException {

		driver.switchTo().frame("braintree-hosted-field-number");

	
		WaitHelper.WaitForElement(creditCardNumber, 60);


		creditCardNumber.sendKeys(cardNumber);

		Thread.sleep(5000);

		driver.switchTo().defaultContent();

	}

	public void EnterExpirationDate() {

		driver.switchTo().frame("braintree-hosted-field-expirationDate");

		WaitHelper.WaitForElement(expirationDate, 60);

		expirationDate.sendKeys("112022");
		driver.switchTo().defaultContent();

	}

	public void EnterCvv() {

		driver.switchTo().frame("braintree-hosted-field-cvv");

		WaitHelper.WaitForElement(cvv, 60);

		cvv.sendKeys("123");
		driver.switchTo().defaultContent();

	}

	public void ClickYesSameAddress() {

		WaitHelper.WaitForElement(yesSameAddress, 60);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", yesSameAddress);

	}

	public void ClickSingleDonationCompleteBtn() {
		WaitHelper.WaitForElement(singleDonationCompleteBtn, 60);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", singleDonationCompleteBtn);
	}

}
