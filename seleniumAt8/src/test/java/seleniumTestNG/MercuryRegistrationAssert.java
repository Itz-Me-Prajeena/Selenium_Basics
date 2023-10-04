package seleniumTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class MercuryRegistrationAssert {
	WebDriver driver;

	@Parameters({ "fName", "lName", "phNum", "emailID", "addrs", "cityName", "stateName", "poCode", "user", "passwrd",
			"confirmPasswrd" })
	@Test
	public void register(String fName, String lName, String phNum, String emailID, String addrs, String cityName,
			String stateName, String poCode, String user, String passwrd, String confirmPasswrd) {
		SoftAssert assertSoft = new SoftAssert();
		WebElement registerLink = driver.findElement(By.linkText("REGISTER"));
		boolean link = registerLink.isDisplayed();
		assertSoft.assertTrue(link);
		registerLink.click();
		String actualTitle = driver.getTitle();
		String expTitle = "Register";
		assertSoft.assertEquals(actualTitle, expTitle, "Expected title not found");
		WebElement firstName = driver.findElement(By.name("firstName"));
		firstName.sendKeys(fName);
		WebElement lastName = driver.findElement(By.xpath("//input[@name='lastName']"));
		lastName.sendKeys(lName);
		WebElement phone = driver.findElement(By.xpath("//input[@name='phone']"));
		phone.sendKeys(phNum);
		WebElement email = driver.findElement(By.xpath("//input[@id='userName']"));
		email.sendKeys(emailID);
		WebElement address = driver.findElement(By.xpath("//input[@name='address1']"));
		address.sendKeys(addrs);
		WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
		city.sendKeys(cityName);
		WebElement state = driver.findElement(By.xpath("//input[@name='state']"));
		state.sendKeys(stateName);
		WebElement postalCode = driver.findElement(By.xpath("//input[@name='postalCode']"));
		postalCode.sendKeys(poCode);
		// WebElement
		// countryDropdown=driver.findElement(By.xpath("//select[@name='country']"));
		// Select country=new Select(countryDropdown);
		Select country = new Select(driver.findElement(By.xpath("//select[@name='country']")));
		country.selectByVisibleText("INDIA");
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		username.sendKeys(user);
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(passwrd);
		WebElement confirmPassword = driver.findElement(By.xpath("//input[@name='confirmPassword']"));
		confirmPassword.sendKeys(confirmPasswrd);
		WebElement submitButton = driver.findElement(By.xpath("//input[@name='submit']"));
		submitButton.click();
		WebElement registerNote = driver.findElement(By.xpath("//b[contains(text(),'Note')]"));
		String regNote = registerNote.getText();
		String expNote = "Sample";
		assertSoft.assertEquals(regNote, expNote);
		assertSoft.assertAll();

	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
	}

	@AfterTest
	public void afterTest() {
	}

}
