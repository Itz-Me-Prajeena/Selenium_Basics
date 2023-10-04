package basic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		
		TakesScreenshot scrnshot=(TakesScreenshot)driver; //typecast driver to TakesScreenshot
		File srcFile=scrnshot.getScreenshotAs(OutputType.FILE); //taking screenshot and saving it in srcFile
		//File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //Typecasting and taking screenshot and saving it in srcFile
		File destFile= new File("C:\\Users\\praje\\OneDrive\\Desktop\\Screenshot\\MyFirst1.png"); //specify the destination in local machine to copy the screenshot
		FileUtils.copyFile(srcFile, destFile); //Copying the screenshot from source to destination
		
				
				
		

	}

}
