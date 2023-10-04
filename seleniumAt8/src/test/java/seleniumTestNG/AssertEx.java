package seleniumTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AssertEx {
	WebDriver driver;

	@Test(priority = 0)
	public void assertString() {
		System.out.println("0");
		String actualTitle = driver.getTitle();
		// String expectedTitle="Test";
		String expectedTitle = "Obsqura Testing";
		Assert.assertEquals(actualTitle, expectedTitle);

	}

	@Test(priority = 2)
	public void assertBooleanT() {
		System.out.println("2");
		// boolean a=true;
		boolean a = false;
		Assert.assertTrue(a);

	}

	@Test(priority = 1)
	public void assertBooleanF() {
		System.out.println("1");
		boolean a = true;
		// boolean a=false;
		Assert.assertFalse(a);

	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();

		driver.get("https://selenium.obsqurazone.com/index.php");
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
