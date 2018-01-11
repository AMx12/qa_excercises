package testSel.testSel;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class mouseClicks {

	WebDriver driver;

	@Test

	public void mouseClicker() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/SeleniumDriver/chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--disable-infobars");
		driver = new ChromeDriver(options);

		driver.get("http://demoqa.com/");

		Thread.sleep(500);
		/////////////////
		WebElement draggable = driver.findElement(By.cssSelector("#menu-item-140"));
		draggable.click();

		Thread.sleep(500);
		Actions builder = new Actions(driver);
		WebElement dragBox = driver.findElement(By.cssSelector("#draggable"));
		builder.dragAndDropBy(dragBox, 50, 50).build().perform();
		////////////////
		Thread.sleep(500);

		WebElement constrain = driver.findElement(By.cssSelector("#ui-id-2"));
		constrain.click();

		Thread.sleep(500);

		WebElement dragBox1 = driver.findElement(By.cssSelector("#draggabl"));
		builder.dragAndDropBy(dragBox1, 0, 50).build().perform();
		Thread.sleep(10);
		WebElement dragBox2 = driver.findElement(By.cssSelector("#draggabl2"));
		builder.dragAndDropBy(dragBox2, 50, 0).build().perform();
		Thread.sleep(500);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,400)", "");

		Thread.sleep(100);

		WebElement dragBox3 = driver.findElement(By.cssSelector("#draggabl3"));
		builder.dragAndDropBy(dragBox3, 750, 0).build().perform();
		Thread.sleep(20);
		builder.dragAndDropBy(dragBox3, 400, 0).build().perform();
		Thread.sleep(100);
		WebElement dragBox4 = driver.findElement(By.cssSelector("#draggabl5"));
		builder.dragAndDropBy(dragBox4, 50, -250).build().perform();
		Thread.sleep(500);

		WebElement sortable = driver.findElement(By.cssSelector("#ui-id-5"));
		sortable.click();

		Thread.sleep(500);
		jse.executeScript("window.scrollBy(0,-400)", "");
		Thread.sleep(500);
		WebElement sortBoxes = driver.findElement(By.cssSelector("#draggablebox"));
		builder.dragAndDropBy(sortBoxes, 0, 30).build().perform();
		Thread.sleep(500);
		builder.dragAndDropBy(sortBoxes, 0, 80).build().perform();
		Thread.sleep(500);
		builder.dragAndDropBy(sortBoxes, 0, 120).build().perform();
		Thread.sleep(500);

	}

}
