package seleniumTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class MercuryTestNG {
	WebDriver driver;
	@Parameters({"username","password"})
  @Test
  public void f(String username,String password) {
	  WebElement usernameField=driver.findElement(By.name("userName"));
	  usernameField.sendKeys(username);
	  WebElement passwordField=driver.findElement(By.name("password"));
	  passwordField.sendKeys(password);
	  WebElement submitButton=driver.findElement(By.name("submit"));
	  submitButton.click();
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  //driver.close();
  }

}
