package seleniumTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AssertWebsite {
	WebDriver driver;

	@Test
	public void stringHardAssert() {
		String actualTitle = driver.getTitle();
		String expectedTitle = "Obsqura Testing";
		Assert.assertEquals(actualTitle, expectedTitle);
		WebElement messageField = driver.findElement(By.id("single-input-field"));
		messageField.sendKeys("Welcome");
		WebElement showMessageButton = driver.findElement(By.id("button-one"));
		showMessageButton.click();
		WebElement display = driver.findElement(By.id("message-one"));
		//String actualMsg = display.getText();
		//String expectedMsg = "Your Message : Welcome";
		//Assert.assertEquals(actualMsg, expectedMsg);
		boolean msg=display.isDisplayed();
		Assert.assertTrue(msg,"Message is displayed");
		Assert.assertFalse(msg,"Message is not displayed");

	}
	@Test (priority = 1)
	public void stringSoftAssert() {
		String actualTitle1 = driver.getTitle();
		String expectedTitle1 = "Obsqura Testing!";
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(actualTitle1, expectedTitle1,"Soft assert error msg customized");
		
		WebElement messageField = driver.findElement(By.id("single-input-field"));
		messageField.sendKeys("Welcome");
		WebElement showMessageButton = driver.findElement(By.id("button-one"));
		showMessageButton.click();
		WebElement display = driver.findElement(By.id("message-one"));
		//String actualMsg = display.getText();
		//String expectedMsg = "Your Message : Welcome";
		//Assert.assertEquals(actualMsg, expectedMsg);
		boolean msg=display.isDisplayed();
		soft.assertTrue(msg,"Message is displayed");
		soft.assertFalse(msg,"Message is not displayed");
		soft.assertAll();

	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");

	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
