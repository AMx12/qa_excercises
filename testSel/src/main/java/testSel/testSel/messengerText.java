package testSel.testSel;

import java.io.IOException;
import java.util.Scanner;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class messengerText {

	WebDriver driver;

	@Test

	public void messengerTest() throws InterruptedException, IOException {

		String userName = "";
		String password = "";
		String message = "";
		String friend = "";

		System.out.println("What is your username?");
		Scanner s = new Scanner(System.in);
		userName = s.nextLine();
		System.out.println("What is your password?");
		password = s.nextLine();
		System.out.println("Who is the friend?");
		friend = s.nextLine();
		System.out.println("What is the message you want to send?");
		message = s.nextLine();

		// Optional, if not specified, WebDriver will search your path for chromedriver.
		System.setProperty("webdriver.chrome.driver", "C:/SeleniumDriver/chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--disable-infobars");
		driver = new ChromeDriver(options);
		driver.get("https://www.messenger.com/");
		Thread.sleep(500); // Let the user actually see something!
		WebElement userNmLogin = driver.findElement(By.cssSelector("#email"));
		userNmLogin.sendKeys(userName);
		Thread.sleep(500);
		WebElement userNmPass = driver.findElement(By.cssSelector("#pass"));
		userNmPass.sendKeys(password);
		Thread.sleep(500);
		WebElement signIn = driver.findElement(By.cssSelector("#loginbutton"));
		signIn.click();

		Actions builder = new Actions(driver);
		String spanText = driver.findElement(By.cssSelector("#js_5 > span")).getText();
		if (spanText.contains(friend)) {
			System.out.println("contained Friend");
		}
		if (!spanText.contains(friend)) {
			System.out.println("else");
			WebElement friendSearch = driver
					.findElement(By.cssSelector("div > div > div._3rh8 > span._5iwm._150g._58ah > label > input"));
			// #js_9 > div > div > div._3rh8 > span._5iwm._5iwn._150g._58ah > label > input
			friendSearch.click();
			friendSearch.sendKeys(friend);
			Thread.sleep(1000);
			builder.moveByOffset(110, 130).click().build().perform();
		}

		Thread.sleep(500);
		System.out.println("Hello");
		for (int i = 0; i < 10; i++) {
			builder.sendKeys(message + " -AMx12").perform();
			builder.sendKeys(Keys.ENTER).perform();
		}
		Thread.sleep(100);

		// WebElement searchBox = driver.findElement(By.name("q"));
		// searchBox.sendKeys("ChromeDriver");
		// searchBox.submit();
		// Thread.sleep(5000); // Let the user actually see something!
		driver.quit();

	}

}
