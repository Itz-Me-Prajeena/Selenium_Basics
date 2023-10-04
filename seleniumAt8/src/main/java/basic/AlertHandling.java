package basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/javascript-alert.php");
		driver.manage().window().maximize();
		WebElement alertClick1=driver.findElement(By.className("btn-success"));
		alertClick1.click();
		Alert alert1=driver.switchTo().alert(); //To transfer control to the alert box
		String alert1Text=alert1.getText();
		System.out.println(alert1Text);
		alert1.accept();
		WebElement alertClick2=driver.findElement(By.className("btn-warning"));
		alertClick2.click();
		Alert alert2=driver.switchTo().alert();
		alert2.dismiss();
		WebElement displayAlert=driver.findElement(By.id("confirm-demo"));
		String display=displayAlert.getText();
		System.out.println(display);
		WebElement alertClick3=driver.findElement(By.className("btn-danger"));
		alertClick3.click();
		Alert alert3=driver.switchTo().alert();
		alert3.sendKeys("Priya");
		alert3.accept();
		WebElement displayText=driver.findElement(By.id("prompt-demo"));
		String display2=displayText.getText();
		System.out.println(display2);

	}

}
