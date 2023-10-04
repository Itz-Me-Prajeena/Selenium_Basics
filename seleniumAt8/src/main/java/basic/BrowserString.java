package basic;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserString {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter browser name: ");
		String browser=sc.next();
		sc.close();
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.co.in/");
			//driver.close();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.microsoft.com/");
			//driver.close();
		}
		else
		{
			//System.out.println("Invalid browser");
			throw new Exception("Invalid browser name : "+browser);
		}
	
		
	}

}
