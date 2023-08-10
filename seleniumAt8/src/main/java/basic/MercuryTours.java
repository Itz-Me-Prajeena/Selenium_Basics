package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MercuryTours {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
		List<WebElement> gender=driver.findElements(By.name("inlineRadioOptions"));
		gender.get(0).click();
		boolean f=gender.get(0).isSelected();
		System.out.println(f);
		WebElement showSelectedButton = driver.findElement(By.id("button-one"));
		showSelectedButton.click();

		driver.get("https://demo.guru99.com/test/newtours/");
		WebElement carRentalPartial=driver.findElement(By.partialLinkText("Car"));
		carRentalPartial.click();
		WebElement username = driver.findElement(By.name("userName"));
		username.clear();
		Dimension d=username.getSize();
		System.out.println("Height = "+d.height+"Width = "+d.width);
		Point p=username.getLocation();
		System.out.println("X axis = "+p.x+"y axis ="+p.y);
		WebElement userInner=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[1]/font"));
		String innerText=userInner.getText();
		System.out.println("Inner text of username= "+innerText);
		WebElement signonLink=driver.findElement(By.linkText("SIGN-ON"));
		signonLink.click();
		
		
		username.sendKeys("tutorial");
		WebElement password = driver.findElement(By.name("password"));
		password.clear();
		password.sendKeys("tutorial");
		WebElement submit_button = driver.findElement(By.name("submit"));
		submit_button.click();
		// driver.close();

	}

}
