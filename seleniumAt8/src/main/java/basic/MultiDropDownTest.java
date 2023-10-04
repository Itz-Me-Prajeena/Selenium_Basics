package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDownTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/select-input.php");
		
		WebElement multiDropDown=driver.findElement(By.id("multi-select-field"));
	
		Select multiSelect=new Select(multiDropDown);
		boolean multi=multiSelect.isMultiple();
		System.out.println("Multi drop down check = "+multi);
		
		multiSelect.selectByIndex(0);
		multiSelect.selectByIndex(2);
		multiSelect.deselectByValue("Red");
		multiSelect.selectByIndex(1);
		
		List<WebElement> selectedList=multiSelect.getAllSelectedOptions();
		for(int i=0;i<selectedList.size();i++)
		{
			String displaySelected=selectedList.get(i).getText();
			System.out.println("Selected option = "+displaySelected);
		}
		
		multiSelect.deselectAll();
		
		driver.close();
		

	}

}
