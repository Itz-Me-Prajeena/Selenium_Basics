package seleniumTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class SubmitForm {
	WebDriver driver;

	@Test
	public void f() {

		SoftAssert softAssert = new SoftAssert();
		String actTitle = driver.getTitle();
		String expTitle = "Obsqura Testing";
		softAssert.assertEquals(actTitle, expTitle);

		WebElement messageField = driver.findElement(By.id("single-input-field"));
		messageField.sendKeys("Welcome");
		WebElement showMessageButton = driver.findElement(By.id("button-one"));
		showMessageButton.click();
		WebElement display = driver.findElement(By.id("message-one"));
		boolean msgDisplayed = display.isDisplayed();
		softAssert.assertFalse(msgDisplayed, "Assert false error msg");

		WebElement valueA = driver.findElement(By.id("value-a"));
		valueA.sendKeys("5");
		WebElement valueB = driver.findElement(By.id("value-b"));
		valueB.sendKeys("10");
		WebElement totalButton = driver.findElement(By.id("button-two"));
		totalButton.click();
		WebElement calc = driver.findElement(By.id("message-two"));
		boolean msgDisplayed2 = display.isDisplayed();
		softAssert.assertFalse(msgDisplayed2, "Assert false error msg2");
		softAssert.assertAll();
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit wait
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");

	}

	@AfterTest
	public void afterTest() {
		//driver.quit();
	}

}
