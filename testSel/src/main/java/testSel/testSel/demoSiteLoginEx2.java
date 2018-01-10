package testSel.testSel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class demoSiteLoginEx2 {

	@Test

	public void demoLogin() throws InterruptedException {

		// Optional, if not specified, WebDriver will search your path for chromedriver.
		System.setProperty("webdriver.chrome.driver", "C:/SeleniumDriver/chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-fullscreen");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://www.thedemosite.co.uk/");
		Thread.sleep(1000); // Let the user actually see something!
		String currentURL = driver.getCurrentUrl();
		assertEquals(currentURL, "http://www.thedemosite.co.uk/");
		WebElement newUser = driver.findElement(By.cssSelector("a[href='addauser.php']"));
		newUser.click();
		Thread.sleep(1000);
		WebElement userNmInput = driver.findElement(By.name("username"));
		WebElement userPwInput = driver.findElement(By.name("password"));
		userNmInput.sendKeys("seleniumTest");
		userPwInput.sendKeys("selenium");
		WebElement saveButton = driver.findElement(By.name("FormsButton2"));
		saveButton.click();
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.cssSelector("a[href='login.php']"));
		login.click();
		WebElement userNmLogin = driver.findElement(By.name("username"));
		WebElement userPwLogin = driver.findElement(By.name("password"));
		WebElement loginButton = driver.findElement(By.name("FormsButton2"));
		userNmLogin.sendKeys("seleniumTest");
		userPwLogin.sendKeys("selenium");
		Thread.sleep(2000);
		loginButton.click();
		Thread.sleep(2000);
		String bodyText = driver.findElement(By.tagName("body")).getText();
		assertTrue(bodyText.contains("**Successful Login**"));
		Thread.sleep(3000);

		// WebElement searchBox = driver.findElement(By.name("q"));
		// searchBox.sendKeys("ChromeDriver");
		// searchBox.submit();
		// Thread.sleep(5000); // Let the user actually see something!
		driver.quit();

	}

}
