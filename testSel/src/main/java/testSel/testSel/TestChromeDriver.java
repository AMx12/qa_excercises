package testSel.testSel;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChromeDriver {

	@Test
	public void testGoogleSearch() throws InterruptedException {
		// Optional, if not specified, WebDriver will search your path for chromedriver.
		System.setProperty("webdriver.chrome.driver", "C:/SeleniumDriver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/xhtml");
		Thread.sleep(500); // Let the user actually see something!
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Ben Swolo");
		searchBox.submit();
		Thread.sleep(500); // Let the user actually see something!
		WebElement imageBox = driver.findElement(By.className("qs"));
		imageBox.click();
		Thread.sleep(5000); // Let the user actually see something!
		driver.quit();
	}

}