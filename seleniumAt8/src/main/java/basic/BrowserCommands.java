package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();//to launch browser
		//Browser Commands
		driver.get("https://selenium.obsqurazone.com/index.php");  //website address(url) to load
		String title=driver.getTitle();  //retrieve the title of the current web page
		System.out.println("Title = "+title);
		String url=driver.getCurrentUrl();  //fetches the current URL which is opened in the browser
		System.out.println("Current url = "+url);
		String pagesource=driver.getPageSource();  //This method returns the source of the page(dom)
		System.out.println("Page source ="+pagesource);
		driver.close(); //Close the current window
		//driver.quit();  //close the entire browser

	}

}
