package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import pages.MonthlyDonationPage;
import pages.SingleDonationPage;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static MonthlyDonationPage monthlyDonationPage;
	public static SingleDonationPage singleDonationPage;
	
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(
					"/Users/yemioluv/eclipse-workspace/donationMvn/src/test/java/config/config.properties");

			prop.load(fis);
		} catch (IOException e) {
			e.getMessage();

		}

	}

	public static void initialization() throws IOException {
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"/Users/yemioluv/Desktop/eclipse-workspace/Donation/chromedriver 6");
			driver = new ChromeDriver();

//				 driver = new HtmlUnitDriver();

		} else if (browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver",
					"/Users/yemioluv/Desktop/eclipse-workspace/Donation/geckodriver 2");
			driver = new FirefoxDriver();

		} else if (browserName.equals("opera")) {
			System.setProperty("webdriver.opera.driver", "/Users/yemioluv/eclipse-workspace/Donation/operadriver");
			driver = new OperaDriver();
			// WebDriver driver = new HtmlUnitDriver();
		}

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("no-sandbox");
		// Fix for cannot get automation extension
		chromeOptions.addArguments("disable-extensions");
		chromeOptions.addArguments("--start-maximized");
		chromeOptions.addArguments("headless");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));
	}

}
