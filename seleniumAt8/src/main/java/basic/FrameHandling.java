package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("frame1");//First way to switch control to iframe - By id
		//WebElement iFrame=driver.findElement(By.id("frame1"));//2nd way - Locate the iframe as webelement
		//driver.switchTo().frame(iFrame);//pass the iframe webelement
		//driver.switchTo().frame(3); // 3rd way- By index		
		
		WebElement sampleHeading=driver.findElement(By.id("sampleHeading"));
		String heading=sampleHeading.getText();
		System.out.println("Displaying Heading");
		System.out.println(heading);
		driver.switchTo().defaultContent(); //transfer control to main html document
		//driver.close();

	}

}
