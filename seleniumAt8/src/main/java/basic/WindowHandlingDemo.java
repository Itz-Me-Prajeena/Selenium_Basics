package basic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingDemo {

	public static void main(String[] args) throws InterruptedException {
		
        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        // Navigate to the website
        driver.get("https://demo.guru99.com/popup.php");
        // Locate the element that says "Click Here" and click on it
        WebElement clickHere = driver.findElement(By.linkText("Click Here"));
        clickHere.click();
        // Get the current window handle
        String mainWindow = driver.getWindowHandle();
        // Get all the window handles
        Set<String> allWindows = driver.getWindowHandles();
        // Iterate over the window handles and switch to the new window
        for (String window : allWindows) {
            if (!window.equals(mainWindow)) {
                driver.switchTo().window(window);
                // Locate the elements for email and enter some values
                WebElement email = driver.findElement(By.name("emailid"));
                email.sendKeys("test@test.com");
                //WebElement password = driver.findElement(By.name("passwd"));
                //password.sendKeys("test123");
                // Locate the element for login button and click on it
                WebElement submitButton = driver.findElement(By.name("btnLogin"));
				submitButton.click();
                // Switch back to the original window
                driver.switchTo().window(mainWindow);
                // Close the browser
                driver.close();
            }
        }
//		WebDriver driver = new ChromeDriver();
//		// driver.manage().window().maximize();
//		driver.get("https://demo.guru99.com/popup.php");
//		WebElement clickLink = driver.findElement(By.linkText("Click Here"));
//		clickLink.click();
//		String parentWindow = driver.getWindowHandle();
//		Set<String> childWindow = driver.getWindowHandles();
//		Iterator<String> i = childWindow.iterator();
//		while (i.hasNext()) {
//			String currentTab = i.next();
//			if (!currentTab.equals(parentWindow)) {
//				driver.switchTo().window(currentTab);
//				Thread.sleep(1000);
//				WebElement emailid = driver.findElement(By.name("emailid"));
//				emailid.sendKeys("test@gmail.com");
//				WebElement submitButton = driver.findElement(By.name("btnLogin"));
//				submitButton.click();
//				//String currentParent=driver.getWindowHandle();
//				
//				WebElement click2 = driver.findElement(By.linkText("Click Here"));
//				click2.click();
//
//			}
//		}
//		driver.switchTo().window(parentWindow);

	}

}
