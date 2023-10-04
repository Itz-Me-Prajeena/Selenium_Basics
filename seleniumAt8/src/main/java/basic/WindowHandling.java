package basic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.http.factory", "jdk-http-client");
		//System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/window-popup.php");
		WebElement facebookLink=driver.findElement(By.partialLinkText("Like us On Facebook"));
		facebookLink.click();
		String parent=driver.getWindowHandle();  //getting the window-handle of current controlling page
		System.out.println(parent);
		Set<String> child=driver.getWindowHandles(); //getting window-handles of all the windows opened by selenium webdriver
		Iterator<String> i=child.iterator();
		while(i.hasNext())
		{
			String currenttab=i.next();
			if(!currenttab.equals(parent))
			{
				driver.switchTo().window(currenttab);
				Thread.sleep(1000);
				WebElement email=driver.findElement(By.xpath("//input[@name='email' and @type='text']"));
				email.sendKeys("Priyamklm@gmail.com");
			}
			
			
		}
		driver.switchTo().window(parent);
		//driver.close();
	}

}
