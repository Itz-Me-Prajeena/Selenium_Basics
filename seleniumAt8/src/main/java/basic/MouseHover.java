package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/menu/#");
		driver.manage().window().maximize();
		Actions actions=new Actions(driver);
		WebElement mainItem2=driver.findElement(By.linkText("Main Item 2"));
		actions.moveToElement(mainItem2).perform(); //.moveToElement() for mouse hover
		WebElement subItem=driver.findElement(By.linkText("SUB SUB LIST »"));
		actions.moveToElement(subItem).perform();
		WebElement subItem1=driver.findElement(By.linkText("Sub Sub Item 1"));
		actions.moveToElement(subItem1).click().build().perform(); //.build() using to combine multiple actions.
		
		 
		
		

	}

}
