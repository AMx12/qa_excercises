package testSel.testSel;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class cookiesTest {

	WebDriver driver;
	String className = null;
	String userName;
	String password;

	@Test

	public void addCookie() throws InterruptedException, IOException, ParseException {

		String URL = "https://amazon.co.uk/";
		String URL2 = "http://go-corey.netlify.com/";

		System.out.println("What is your username?");
		Scanner s = new Scanner(System.in);
		userName = s.nextLine();
		System.out.println("What is your password?");
		password = s.nextLine();
		s.close();

		System.setProperty("webdriver.chrome.driver", "C:/SeleniumDriver/chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--disable-infobars");
		driver = new ChromeDriver(options);

		driver.navigate().to(URL);

		// logStatus();
		//
		// if (className.contains("logged-in")) {
		// logOut();
		// }
		//
		// logStatus();
		//
		// if (className.contains("logged-out")) {
		// logIn();
		// }

		Thread.sleep(2000);
		logIn();

		cookieWriter();

		Thread.sleep(500);

		logOut();

		// logStatus();
		//
		//
		//
		// if (className.contains("logged-in")) {
		// logOut();
		// }

		driver.navigate().to(URL2);
		Thread.sleep(1000);

		driver.navigate().to(URL);
		cookieReader();
		Thread.sleep(200);

	}

	public void logOut() throws InterruptedException {

		Actions builder = new Actions(driver);

		// WebElement dropMenu = driver.findElement(By.cssSelector("#user-links >
		// li:nth-child(3) > details > summary"));
		// dropMenu.click();
		// Thread.sleep(200);
		// WebElement signOut = driver.findElement(
		// By.cssSelector("#user-links > li:nth-child(3) > details > ul >
		// li:nth-child(9) > form > button"));
		// signOut.click();
		// Thread.sleep(200);

		WebElement dropMenu = driver.findElement(By.cssSelector("#nav-link-yourAccount > span.nav-line-2"));
		builder.moveToElement(dropMenu, 0, 0);
		Thread.sleep(200);
		WebElement signOut = driver.findElement(By.cssSelector("#nav-text-signout"));
		signOut.click();
		Thread.sleep(200);

	}

	public void logIn() throws InterruptedException {

		Actions builder = new Actions(driver);

		// WebElement loginBtn = driver.findElement(By.cssSelector(
		// "div.position-relative.js-header-wrapper > header > div >
		// div.HeaderMenu.HeaderMenu--bright.d-lg-flex.flex-justify-between.flex-auto >
		// div > span > div > a:nth-child(1)"));

		WebElement loginBtn = driver.findElement(By.cssSelector("#nav-link-yourAccount"));
		WebElement user = driver.findElement(By.cssSelector("#ap_email"));

		loginBtn.click();
		user.click();
		Thread.sleep(500);
		builder.sendKeys(userName).build().perform();
		Thread.sleep(100);
		builder.sendKeys(Keys.TAB).perform();
		builder.sendKeys(password).build().perform();
		Thread.sleep(100);
		builder.sendKeys(Keys.TAB).perform();
		builder.sendKeys(Keys.TAB).perform();
		builder.sendKeys(Keys.TAB).perform();
		builder.sendKeys(Keys.ENTER).perform();
		Thread.sleep(200);

	}

	public String logStatus() {

		List<WebElement> bodyClass = driver.findElements(By.tagName("body"));

		for (WebElement ele : bodyClass) {
			className = ele.getAttribute("class");
			System.out.println("Class name = " + className);
		}
		return className;

	}

	public void cookieWriter() throws IOException {

		File f = new File("browser.data");

		f.delete();
		f.createNewFile();
		BufferedWriter bos = new BufferedWriter(new FileWriter(f));

		for (Cookie am : driver.manage().getCookies()) {
			bos.write((am.getName() + ";" + am.getValue() + ";" + am.getDomain() + ";" + am.getPath() + ";"
					+ am.getExpiry() + ";" + am.isSecure()));
			bos.newLine();
		}
		bos.close();

	}

	public void cookieReader() throws ParseException, IOException {

		File f = new File("browser.data");
		DateFormat df = new SimpleDateFormat("EEE MMM dd hh:mm:ss zzz yyyy");

		BufferedReader br = new BufferedReader(new FileReader(f));
		String line;
		while ((line = br.readLine()) != null) {
			StringTokenizer str = new StringTokenizer(line, ";");
			while (str.hasMoreTokens()) {
				String name = str.nextToken();
				String value = str.nextToken();
				String domain = str.nextToken();
				String path = str.nextToken();
				Date expiry = null;
				String dt;

				if (!(dt = str.nextToken()).equals("null")) {
					expiry = df.parse(dt);
				}
				boolean isSecure = new Boolean(str.nextToken()).booleanValue();
				Cookie ck = new Cookie(name, value, domain, path, expiry, isSecure);
				driver.manage().addCookie(ck);
				System.out.println(line);
			}

		}
		br.close();
	}

}
