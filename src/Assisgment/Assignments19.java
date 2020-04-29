package Assisgment;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyTestListener.class)
public class Assignments19 {

	WebDriver driver;// ----------------------for click on particular web
	// element-----------------------------------------

	public static void sendKeysByJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);
	}

	@BeforeMethod
	public void setUp() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\SeleniumContent\\selenium assigment\\SeleniumAssigmentt\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("On script start" + new Date());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	// --------------------Write a script to Handle is seletable----------
	// ---------------------------
	@Test
	public void scriptOne() throws InterruptedException {

		driver.get("http://demo.automationtesting.in/Selectable.html");

		List<WebElement> list1 = driver.findElements(By.xpath("//ul[@class='deaultFunc']/li/b"));
		int size = list1.size();

		for (WebElement web : list1) {
			System.out.println(web.getText());
			System.out.println("------------------------------------------");
			System.out.println();
		}
		WebElement web = driver.findElement(By.xpath("(//li[@class='active'])[2]/a"));
		sendKeysByJS(web, driver);

		for (int i = 0; i < size; i++) {
			list1.get(i).sendKeys(Keys.CONTROL);
			list1.get(i).click();

		}
	}

	@AfterMethod
	public void tearDown() {
		// driver.quit();
	}

}
