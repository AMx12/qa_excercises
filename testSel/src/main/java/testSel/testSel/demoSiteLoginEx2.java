package testSel.testSel;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class demoSiteLoginEx2 {

	ExtentReports report;
	ExtentTest test;
	WebDriver driver;

	@Test

	public void demoLogin() throws InterruptedException, IOException {

		int choice = 99;
		String browser = null;
		String userName = "AMx12";
		String password = "123456";

		System.out.println("Test on:");
		System.out.println("1. Firefox \n2. Chrome");
		Scanner s = new Scanner(System.in);
		choice = s.nextInt();
		switch (choice) {
		case 1:
			System.setProperty("webdriver.gecko.driver", "C:/SeleniumDriver/geckodriver.exe");
			browser = " Firefox";
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			break;

		case 2:
			System.setProperty("webdriver.chrome.driver", "C:/SeleniumDriver/chromedriver.exe");
			browser = " Chrome";
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
			options.addArguments("--disable-infobars");
			driver = new ChromeDriver(options);
			break;
		}
		report = new ExtentReports("C:\\ExtentReports\\demoSite\\automationreport.html", true);
		test = report.startTest("Verify application URL");
		test.log(LogStatus.INFO, "Browser started");
		test.log(LogStatus.INFO, "Browser in use:" + browser);

		driver.get("http://www.thedemosite.co.uk/");
		Thread.sleep(1000); // Let the user actually see something!
		String currentURL = driver.getCurrentUrl();

		if (currentURL.equals("http://www.thedemosite.co.uk/")) {

			test.log(LogStatus.PASS, "URL has been verified.");
			File driverFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(driverFile, new File("C:\\ExtentReports\\demoSite\\screenshot\\img.jpg"));
			String image = test.addScreenCapture("C:\\ExtentReports\\demoSite\\screenshot\\img.jpg");

		} else {

			test.log(LogStatus.FAIL, "URL has not been verified.");

		}

		WebElement newUser = driver.findElement(By.cssSelector("a[href='addauser.php']"));
		newUser.click();
		Thread.sleep(2000);
		WebElement userNmInput = driver.findElement(By.name("username"));
		WebElement userPwInput = driver.findElement(By.name("password"));
		userNmInput.sendKeys(userName);
		userPwInput.sendKeys(password);
		WebElement saveButton = driver.findElement(By.name("FormsButton2"));
		saveButton.click();

		String createUser = driver.findElement(By.cssSelector(
				"body > table > tbody > tr > td.auto-style1 > blockquote > blockquote:nth-child(2) > blockquote"))
				.getText();

		System.out.println(createUser);

		if (createUser.contains(userName) && createUser.contains(password)) {

			test.log(LogStatus.PASS, "User creation successful.");
			File driverFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(driverFile1, new File("C:\\ExtentReports\\demoSite\\screenshot\\img1.jpg"));
			String image1 = test.addScreenCapture("C:\\ExtentReports\\demoSite\\screenshot\\img1.jpg");
		} else {

			test.log(LogStatus.FAIL, "User creation unsuccessful.");

		}

		Thread.sleep(2000);

		WebElement login = driver.findElement(By.cssSelector("a[href='login.php']"));
		login.click();
		WebElement userNmLogin = driver.findElement(By.name("username"));
		WebElement userPwLogin = driver.findElement(By.name("password"));
		WebElement loginButton = driver.findElement(By.name("FormsButton2"));
		userNmLogin.sendKeys(userName);
		userPwLogin.sendKeys(password);
		Thread.sleep(500);

		File driverFile2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(driverFile2, new File("C:\\ExtentReports\\demoSite\\screenshot\\img2.jpg"));
		String image2 = test.addScreenCapture("C:\\ExtentReports\\demoSite\\screenshot\\img2.jpg");

		loginButton.click();
		Thread.sleep(2000);
		String bodyText = driver.findElement(By.tagName("body")).getText();

		if (bodyText.contains("**Successful Login**")) {

			test.log(LogStatus.PASS, "Login has been successful.");
			File driverFile3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(driverFile3, new File("C:\\ExtentReports\\demoSite\\screenshot\\img3.jpg"));
			String image3 = test.addScreenCapture("C:\\ExtentReports\\demoSite\\screenshot\\img3.jpg");

		} else {

			test.log(LogStatus.FAIL, "Login has been unsuccessful.");

		}
		Thread.sleep(3000);
		test.log(LogStatus.INFO, "Test end.");
		report.endTest(test);
		report.flush();

		// WebElement searchBox = driver.findElement(By.name("q"));
		// searchBox.sendKeys("ChromeDriver");
		// searchBox.submit();
		// Thread.sleep(5000); // Let the user actually see something!
		driver.quit();

	}

}
