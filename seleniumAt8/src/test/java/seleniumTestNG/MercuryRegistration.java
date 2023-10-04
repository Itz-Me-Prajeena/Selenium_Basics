package seleniumTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class MercuryRegistration {
	WebDriver driver;

  @Test
  public void f() {
	  WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10)); //Explicit wait
	  WebElement firstName=driver.findElement(By.xpath("//input[@name='firstName']"));
	  wait.until(ExpectedConditions.visibilityOf(firstName));
	  firstName.sendKeys("Priya");
	  WebElement lastName=driver.findElement(By.xpath("//input[@name='lastName']"));
	  wait.until(ExpectedConditions.visibilityOf(lastName));
	  lastName.sendKeys("Mohan");
	  WebElement phone=driver.findElement(By.xpath("//input[@name='phone']"));
	  phone.sendKeys("1234567890");
	  WebElement email=driver.findElement(By.xpath("//input[@id='userName']"));
	  email.sendKeys("test@gmail.com");
	  WebElement address=driver.findElement(By.xpath("//input[@name='address1']"));
	  address.sendKeys("test");
	  WebElement city=driver.findElement(By.xpath("//input[@name='city']"));
	  city.sendKeys("TVM");
	  WebElement state=driver.findElement(By.xpath("//input[@name='state']"));
	  state.sendKeys("Kerala");
	  WebElement postalCode=driver.findElement(By.xpath("//input[@name='postalCode']"));
	  postalCode.sendKeys("123456");
	  //WebElement countryDropdown=driver.findElement(By.xpath("//select[@name='country']"));
	  //Select country=new Select(countryDropdown);
	  Select country=new Select(driver.findElement(By.xpath("//select[@name='country']")));
	  country.selectByVisibleText("INDIA");
	  WebElement username=driver.findElement(By.xpath("//input[@name='email']"));
	  username.sendKeys("tutorial");
	  WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
	  password.sendKeys("tutorial");
	  WebElement confirmPassword=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
	  confirmPassword.sendKeys("tutorial");
	  WebElement submitButton=driver.findElement(By.xpath("//input[@name='submit']"));
	  wait.until(ExpectedConditions.elementToBeClickable(submitButton));
	  submitButton.click();
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/register.php");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
