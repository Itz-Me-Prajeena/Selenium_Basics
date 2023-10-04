package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement singleCheckbox=driver.findElement(By.id("gridCheck"));
		singleCheckbox.click();
		List<WebElement> multiCheckBox=driver.findElements(By.className("check-box-list"));
		multiCheckBox.get(0).click();
		multiCheckBox.get(1).click();

	}

}
