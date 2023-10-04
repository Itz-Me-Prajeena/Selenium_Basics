package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollAction {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;// typecast driver to JavascriptExecutor
		js.executeScript("window.scrollBy(0,500)");// vertical down 500 pixel
		js.executeScript("window.scrollBy(0,-100)");// vertical scroll up 100 pixel
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");// scroll to the bottom of the page
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");// scroll to top of the page
		WebElement button = driver.findElement(By.id("button-two"));
		js.executeScript("arguments[0].scrollIntoView()", button);// scroll to the WebElement
		WebElement topButton=driver.findElement(By.id("button-one"));
		js.executeScript("arguments[0].scrollIntoView()",topButton);

	}

}
