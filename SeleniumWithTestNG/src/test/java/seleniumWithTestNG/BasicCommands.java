package seleniumWithTestNG;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicCommands {
	public WebDriver driver;

	public void testInitialize(String browser) {
		if (browser.equals("Chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("Edge")) {
			driver = new EdgeDriver();
		} else if (browser.equals("Firefox")) {
			driver = new FirefoxDriver();
		} else {
			try {
				throw new Exception("Invalid browser");
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

	}

	@BeforeMethod
	public void setup() {
		testInitialize("Chrome");
		System.out.println("BeforeMethod");
	}

	@AfterMethod
	public void teardown() {
		System.out.println("AfterMethod");
		// driver.close();
	}

	@Test
	public void tc001_VerifyObsquraTitle() {
		driver.get("https://selenium.obsqurazone.com/index.php");
		System.out.println("@Test - tc001");
		String act_title = driver.getTitle();
		String exp_title = "Obsqura Testing1";
		driver.findElement(By.className(exp_title));
		Assert.assertEquals(act_title, exp_title, "Invalid Title");
	}

	@Test
	public void tc002_VerifyLocators() {
		driver.get("https://demowebshop.tricentis.com/");
		WebElement registerLink = driver.findElement(By.linkText("Register"));
		registerLink.click();
		WebElement genderRadio = driver.findElement(By.id("gender-female"));
		genderRadio.click();
		WebElement fNameField = driver.findElement(By.name("FirstName"));
		fNameField.sendKeys("Priya");
		WebElement lNameFeild = driver.findElement(By.id("LastName"));
		lNameFeild.sendKeys("Mohan");
		WebElement emailField = driver.findElement(By.name("Email"));
		emailField.sendKeys("priyamklm3@gmail.com");
		WebElement passwordField = driver.findElement(By.id("Password"));
		passwordField.sendKeys("test123");
		WebElement cPasswordField = driver.findElement(By.cssSelector("#ConfirmPassword"));
		cPasswordField.sendKeys("test123");
		WebElement registerButton = driver.findElement(By.id("register-button"));
		registerButton.submit();
		WebElement continueButton=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[2]/input"));
		continueButton.click();
	}

}
