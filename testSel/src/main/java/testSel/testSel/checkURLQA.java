package testSel.testSel;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class checkURLQA {

	ExtentReports report;
	ExtentTest test;
	WebDriver driver;

	// public void qaURL() throws InterruptedException, IOException {
	//
	// report = new
	// ExtentReports("C:\\ExtentReports\\checkURLQA\\automationreport.html", true);
	// // Optional, if not specified, WebDriver will search your path for
	// chromedriver.
	// test = report.startTest("Verify application URL");

	// test.log(LogStatus.INFO, "Browser started");
	//
	// driver.get("http://qa.com/");
	// Thread.sleep(100); // Let the user actually see something!
	// String currentURL = driver.getCurrentUrl();
	//
	// if (currentURL.equals("https://www.qa.com/")) {
	//
	// test.log(LogStatus.PASS, "URL has been verified.");
	// File driverFile = ((TakesScreenshot)
	// driver).getScreenshotAs(OutputType.FILE);
	// FileUtils.copyFile(driverFile, new
	// File("C:\\ExtentReports\\checkURLQA\\screenshot\\img.jpg"));
	// String image =
	// test.addScreenCapture("C:\\ExtentReports\\checkURLQA\\screenshot\\img.jpg");
	//
	// } else {
	//
	// test.log(LogStatus.FAIL, "URL has been verified.");
	//
	// }
	//
	// report.endTest(test);
	// report.flush();
	//
	// Thread.sleep(5000);
	//
	// // WebElement searchBox = driver.findElement(By.name("q"));
	// // searchBox.sendKeys("ChromeDriver");
	// // searchBox.submit();
	// // Thread.sleep(5000); // Let the user actually see something!
	// driver.quit();
	//
	// }

	@Test

	public void qaURLff() throws InterruptedException, IOException {

		int choice = 99;

		System.out.println("Test on:");
		System.out.println("1. Firefox \n2. Chrome");
		Scanner s = new Scanner(System.in);
		choice = s.nextInt();
		switch (choice) {
		case 1:
			System.setProperty("webdriver.gecko.driver", "C:/SeleniumDriver/geckodriver.exe");

			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			break;

		case 2:
			System.setProperty("webdriver.chrome.driver", "C:/SeleniumDriver/chromedriver.exe");

			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
			options.addArguments("--disable-infobars");
			driver = new ChromeDriver(options);
			break;
		}

		report = new ExtentReports("C:\\ExtentReports\\checkURLQA\\automationreport.html", true);
		test = report.startTest("Verify application URL");
		test.log(LogStatus.INFO, "Browser started");

		driver.get("http://qa.com/");
		Thread.sleep(100); // Let the user actually see something!
		String currentURL = driver.getCurrentUrl();

		if (currentURL.equals("https://www.qa.com/")) {

			test.log(LogStatus.PASS, "URL has been verified.");
			File driverFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(driverFile, new File("C:\\ExtentReports\\checkURLQA\\screenshot\\img.jpg"));
			String image = test.addScreenCapture("C:\\ExtentReports\\checkURLQA\\screenshot\\img.jpg");

		} else {

			test.log(LogStatus.FAIL, "URL has been verified.");

		}
		test.log(LogStatus.INFO, "Test end.");
		report.endTest(test);
		report.flush();

		Thread.sleep(5000);

		// WebElement searchBox = driver.findElement(By.name("q"));
		// searchBox.sendKeys("ChromeDriver");
		// searchBox.submit();
		// Thread.sleep(5000); // Let the user actually see something!
		driver.quit();

	}

}
