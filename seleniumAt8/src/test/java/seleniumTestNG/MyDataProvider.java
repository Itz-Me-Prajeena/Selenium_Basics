package seleniumTestNG;

import org.testng.annotations.Test;

import basic.ExcelRead;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class MyDataProvider {
	WebDriver driver;

	@Test(dataProvider = "dp")
	//num of parameters=number of columns in excel
	// num of time @Test get executed = num of rows in excel
	public void f(String username, String password) {
		WebElement usernameField = driver.findElement(By.name("userName"));
		usernameField.sendKeys(username);
		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys(password);
		WebElement submitButton = driver.findElement(By.name("submit"));
		submitButton.click();
	}

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

	@DataProvider
	public Object[][] dp() throws InvalidFormatException, IOException {
		Object[][] data = ExcelRead.getDataFromExcel("C:\\Users\\praje\\OneDrive\\Desktop\\TestExcel.xlsx", "Guru99");//sheet name=Guru99
		return data;

	}
}
