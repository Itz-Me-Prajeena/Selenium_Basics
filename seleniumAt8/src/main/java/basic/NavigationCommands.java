package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://selenium.obsqurazone.com/index.php");
		driver.navigate().to("https://selenium.obsqurazone.com/form-submit.php");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

	}

}
