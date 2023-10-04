package basic;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class RadioXpath {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
		
		List<WebElement> genderRadio=driver.findElements(By.xpath("//input[@name='inlineRadioOptions']"));
		genderRadio.get(1).click();
		
		WebElement showButton=driver.findElement(By.xpath("//button[contains(text(),'Selected')]"));
		showButton.click();
		
		WebElement displayMessage1=driver.findElement(By.xpath("//div[contains(text(),'Radio button')]"));
		String message1=displayMessage1.getText();
		System.out.println(message1);
		
		List<WebElement> patientGenderRadio=driver.findElements(By.xpath("//input[@name='student-gender']"));
		patientGenderRadio.get(1).click();
		
		List<WebElement> ageGroupRadio=driver.findElements(By.xpath("//input[@name='student-age']"));
		ageGroupRadio.get(1).click();
		
		WebElement getResultsButton=driver.findElement(By.xpath("//button[contains(text(),'Results')]"));
		getResultsButton.click();
		
		WebElement resultMessage=driver.findElement(By.xpath("//div[starts-with(text(),'Gender')]"));
		String genderResult=resultMessage.getText();
		System.out.println(genderResult);
		
		//driver.close();
		
		
	}

}
