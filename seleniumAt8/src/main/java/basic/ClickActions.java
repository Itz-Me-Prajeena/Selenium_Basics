package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickActions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Actions actions=new Actions(driver);
		WebElement rightClickButton=driver.findElement(By.className("btn-neutral"));
		actions.contextClick(rightClickButton).perform(); //.contextClick() - to perform right click action
		
		//WebElement doubleClickButton=driver.findElement(By.)
		driver.quit();
		

	}

}
