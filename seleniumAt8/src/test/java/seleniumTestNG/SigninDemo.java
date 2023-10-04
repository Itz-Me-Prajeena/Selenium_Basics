package seleniumTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterTest;

public class SigninDemo {
	WebDriver driver;

	@Test
	public void f() throws InterruptedException {
		SoftAssert sa = new SoftAssert();
		String actTitle = driver.getTitle();
		String expTitle = "Demo CRM";
		sa.assertEquals(actTitle, expTitle);
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("admin@admin.com");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("12345678");
		WebElement signinButton = driver.findElement(By.xpath("//button[text()='Sign in']"));
		signinButton.click();
		// Thread.sleep(1000);
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);  //Fluent wait
		
		WebElement dashboard = driver.findElement(By.xpath("//span[text()='Dashboard']"));
		fluentWait.until(ExpectedConditions.visibilityOf(dashboard));
		String actDsah = dashboard.getText();
		String expDash = "test";
		sa.assertEquals(actDsah, expDash);

	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qalegend.com/crm/index.php/signin");
	}

	@AfterTest
	public void afterTest() {
		// driver.close();
	}

}
