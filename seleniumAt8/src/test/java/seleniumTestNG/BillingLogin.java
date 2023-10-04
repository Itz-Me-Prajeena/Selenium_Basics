package seleniumTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class BillingLogin {
	WebDriver driver;
  @Test
  public void f() {
	  SoftAssert sa=new SoftAssert();
	  WebElement pageHeading=driver.findElement(By.xpath("//h1[text()='Demo POS']"));
	  String actHeading=pageHeading.getText();
	  String expHeading="test";
	  sa.assertEquals(actHeading, expHeading);
	  WebElement username=driver.findElement(By.id("username"));
	  username.sendKeys("admin");
	  WebElement password=driver.findElement(By.id("password"));
	  password.sendKeys("123123");
	  WebElement rememberCheck=driver.findElement(By.xpath("//input[@name='remember']"));
	  rememberCheck.click();
	  WebElement loginButton=driver.findElement(By.xpath("//button[@type='submit']"));
	  loginButton.click();
	  WebElement pageHeading2=driver.findElement(By.xpath("//h1[starts-with(text(),'Welcome')]"));
	  String actHeading2=pageHeading2.getText();
	  String expgeading2="Welcome admin,";
	  sa.assertEquals(actHeading2, expgeading2);
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://qalegend.com/billing/public/login");
  }

  @AfterTest
  public void afterTest() {
	  //driver.close();
  }

}
