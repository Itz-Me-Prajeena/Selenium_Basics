package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFileUpload {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		WebElement chooseFile=driver.findElement(By.id("uploadfile_0"));
		chooseFile.sendKeys("C:\\Users\\praje\\Desktop\\TestExcel.xlsx");
		WebElement termsCheckBox=driver.findElement(By.id("terms"));
		termsCheckBox.click();
		WebElement submitButton=driver.findElement(By.id("submitbutton"));
		submitButton.click();

	}

}
