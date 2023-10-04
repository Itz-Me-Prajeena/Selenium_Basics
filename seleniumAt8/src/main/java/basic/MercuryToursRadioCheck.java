package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MercuryToursRadioCheck {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/test/newtours/reservation.php");
		
		List<WebElement> flightTypeRadio=driver.findElements(By.name("tripType"));
		flightTypeRadio.get(1).click();
		
		boolean flightTypeSelection=flightTypeRadio.get(1).isSelected();
		System.out.println("Flight Type Selection status = "+flightTypeSelection);
		
		WebElement passengersDropdown=driver.findElement(By.name("passCount"));
		Select objPassengers=new Select(passengersDropdown);
		objPassengers.selectByIndex(2);
		System.out.println("List the available passenger count selection");
		
		List<WebElement> passengerCountList=objPassengers.getOptions();
		for(int i=0;i<passengerCountList.size();i++)
		{
			String countvalue=passengerCountList.get(i).getText();
			System.out.println(countvalue);
		}
		
		boolean passengersSelection=passengerCountList.get(2).isSelected();
		System.out.println("Passengers Selection status = "+passengersSelection);
		//WebElement depFromDropdown=driver.findElement(By.name("fromPort"));
		
		Select depFromDropdown=new Select(driver.findElement(By.name("fromPort")));//Can directly pass the findElement comment in Select class object creation
		depFromDropdown.selectByValue("Paris");
		
		WebElement monthDropdown =driver.findElement(By.name("fromMonth"));
		Select objmonthDropdown=new Select(monthDropdown);
		objmonthDropdown.selectByVisibleText("August");
		WebElement dateDropdown =driver.findElement(By.name("toDay"));
		Select objDateDropdown=new Select(dateDropdown);
		objDateDropdown.selectByVisibleText("20");
		List<WebElement> serviceClassradio=driver.findElements(By.name("servClass"));
		serviceClassradio.get(2).click();
		WebElement airlineDropdown=driver.findElement(By.name("airline"));
		Select objairlineDropdown=new Select(airlineDropdown);
		objairlineDropdown.selectByVisibleText("Blue Skies Airlines");
		WebElement continueButton=driver.findElement(By.name("findFlights"));
		continueButton.submit();
			

	}

}
