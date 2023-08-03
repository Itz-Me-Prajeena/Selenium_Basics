package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SeleniumCommands {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String actual_title=driver.getTitle();
		System.out.println("Page Title = "+actual_title);
		//String expected_title="Obsqura zone";
		String expected_title="Obsqura Testing";
		Assert.assertEquals(actual_title, expected_title,"Invalid Title");
		driver.close();
		

	}

}
