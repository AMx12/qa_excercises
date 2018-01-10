package testSel.testSel;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class messengerText {

	@Test

	public void messengerTest() throws InterruptedException {

		// Optional, if not specified, WebDriver will search your path for chromedriver.
		System.setProperty("webdriver.chrome.driver", "C:/SeleniumDriver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.messenger.com/");
		Thread.sleep(5000); // Let the user actually see something!
		WebElement userNmLogin = driver.findElement(By.id("lgnjs"));
		userNmLogin.sendKeys("userName");
		Thread.sleep(500);
		WebElement userNmPass = driver.findElement(By.id("pass"));
		userNmPass.sendKeys("password");
		Thread.sleep(3000);

		// WebElement searchBox = driver.findElement(By.name("q"));
		// searchBox.sendKeys("ChromeDriver");
		// searchBox.submit();
		// Thread.sleep(5000); // Let the user actually see something!
		driver.quit();

	}

}
