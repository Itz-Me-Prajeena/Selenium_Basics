package seleniumTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class CrmProject {
	WebDriver driver;

	@Parameters({ "emailid", "pswd" })
	@Test(priority = 1)
	public void loginPage(String emailid, String pswd) {
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys(emailid);
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(pswd);
		WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
		submitButton.click();
		WebElement usernameDropdown=driver.findElement(By.xpath("//a[@id='user-dropdown-icon']//ancestor::li"));
		Select obj=new Select(usernameDropdown);
		List<WebElement> optionList=obj.getOptions();
		for (int i = 0; i < optionList.size(); i++) // to display the options stored in list
		{
			String optionValue = optionList.get(i).getText(); // First we get the webelements of each option stored in
																// list and then get the innertext of each option
			System.out.println("Option " + i + " = " + optionValue);

		}
		obj.selectByIndex(1);
	}

	@Parameters({ "emailid", "invalidpswd" })
	@Test(priority = 0)
	public void invalidCred(String emailid, String invalidpswd) {
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys(emailid);
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(invalidpswd);
		WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
		submitButton.click();
		WebElement errorMsg = driver.findElement(By.xpath("//span[text()='Authentication failed!']"));
		String error = errorMsg.getText();
		System.out.println("Error message = " + error);

	}
//	@Test(priority = 2)
//	public void myProfile() {
//		WebElement usernameDropdown=driver.findElement(By.xpath("//a[@id='user-dropdown-icon']//ancestor::li"));
//		Select obj=new Select(usernameDropdown);
//		List<WebElement> optionList=obj.getOptions();
//		for (int i = 0; i < optionList.size(); i++) // to display the options stored in list
//		{
//			String optionValue = optionList.get(i).getText(); // First we get the webelements of each option stored in
//																// list and then get the innertext of each option
//			System.out.println("Option " + i + " = " + optionValue);
//
//		}
//		obj.selectByIndex(0);
//		
//		
//	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://qalegend.com/crm/index.php/signin");
	}

	@AfterTest
	public void afterTest() {
	}

}
