package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsCommands {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/form-submit.php");
		WebElement first_name = driver.findElement(By.id("validationCustom01"));
		first_name.clear();
		first_name.sendKeys("Priya");
		boolean firstnamedispalyed = first_name.isDisplayed();
		System.out.println("is dispalyed = " + firstnamedispalyed);
		boolean firstnameenabled = first_name.isEnabled();
		System.out.println("is enabled = " + firstnameenabled);
		String tagname = first_name.getTagName();
		System.out.println("Tagname of first name =" + tagname);
		String class_attribute = first_name.getAttribute("class");
		System.out.println("first name field's class attribute =" + class_attribute);
		WebElement last_name = driver.findElement(By.id("validationCustom02"));
		last_name.sendKeys("Mohan");
		WebElement username = driver.findElement(By.id("validationCustomUsername"));
		username.sendKeys("priyamohan1");
		WebElement city = driver.findElement(By.id("validationCustom03"));
		city.sendKeys("TVM");
		WebElement state = driver.findElement(By.id("validationCustom04"));
		state.sendKeys("Kerala");
		WebElement zip = driver.findElement(By.id("validationCustom05"));
		zip.sendKeys("123456");
		WebElement terms_condition = driver.findElement(By.className("form-check-input"));
		terms_condition.click();
		WebElement submit_button = driver.findElement(By.className("btn"));
		submit_button.submit();
		

	}

}
