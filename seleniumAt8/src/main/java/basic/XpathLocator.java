package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathLocator {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/form-submit.php");
		WebElement firstName=driver.findElement(By.xpath("//input[@placeholder='First name']"));
		firstName.sendKeys("Priya");
		WebElement lastName=driver.findElement(By.xpath("//input[starts-with(@placeholder,'Last')]"));
		lastName.sendKeys("Mohan");
		WebElement userName=driver.findElement(By.xpath("//input[contains(@id,'ationCustomU')]"));
		userName.sendKeys("ItzMe");
		WebElement city=driver.findElement(By.xpath("//input[contains(@id,'Custom03')]"));
		city.sendKeys("TVM");
		WebElement state=driver.findElement(By.xpath("//input[@placeholder='State']"));
		state.sendKeys("Kerala");
		WebElement zip=driver.findElement(By.xpath("//input[@placeholder='Zip']"));
		zip.sendKeys("123456");
		WebElement terms=driver.findElement(By.xpath("//input[@type='checkbox']"));
		terms.click();
		WebElement submitButton=driver.findElement(By.xpath("//button[starts-with(text(),'Submit')]"));
		submitButton.click();

	}

}
