package seleniumTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class BrowserNameParamParallel {
	WebDriver driver;

	@Test
	public void f() {
		
	}

	@Parameters({ "browser" })
	@BeforeTest
	public void beforeTest(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			
			
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			
		}
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/newtours/");

	}

	@AfterTest
	public void afterTest() {
	}

}
