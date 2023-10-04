package seleniumTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class XpathAxesMethod {
	WebDriver driver;
  @Test
  public void following() {
	  WebElement firstName=driver.findElement(By.xpath("//input[@id='validationCustom01']"));
	  firstName.sendKeys("Priya");
	  WebElement lastName=driver.findElement(By.xpath("//input[@id='validationCustom01']//following::input[1]"));
	  lastName.sendKeys("Mohan");
	  WebElement userName=driver.findElement(By.xpath("//input[@id='validationCustom01']//following::input[2]"));
	  userName.sendKeys("test@gmail.com");
	  WebElement cityName=driver.findElement(By.xpath("//input[@id='validationCustom01']//following::input[3]"));
	  cityName.sendKeys("TVM");
	  WebElement stateName=driver.findElement(By.xpath("//input[@id='validationCustom01']//following::input[4]"));
	  stateName.sendKeys("Kerala");
	  WebElement zipCode=driver.findElement(By.xpath("//input[@id='validationCustom01']//following::input[5]"));
	  zipCode.sendKeys("123456");
	  WebElement termsCheck=driver.findElement(By.xpath("//input[@id='validationCustom01']//following::input[6]"));
	  termsCheck.click();
	  WebElement submitButton=driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
	  submitButton.click();
  }
  @Test
  public void child() {
  
  }
	  
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://selenium.obsqurazone.com/form-submit.php");
  }

  @AfterTest
  public void afterTest() {
  }

}
