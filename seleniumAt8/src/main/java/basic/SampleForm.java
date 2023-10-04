package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleForm {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		WebElement messageField=driver.findElement(By.id("single-input-field"));
		messageField.sendKeys("Welcome");
		WebElement showMessageButton=driver.findElement(By.id("button-one"));
		showMessageButton.click();
		WebElement display=driver.findElement(By.id("message-one"));
		String message=display.getText();
		System.out.println(message);
		WebElement valueA=driver.findElement(By.id("value-a"));
		valueA.sendKeys("5");
		WebElement valueB=driver.findElement(By.id("value-b"));
		valueB.sendKeys("10");
		WebElement totalButton=driver.findElement(By.id("button-two"));
		totalButton.click();
		WebElement calc=driver.findElement(By.id("message-two"));
		String result=calc.getText();
		System.out.println("Result = "+result);
	}

}
