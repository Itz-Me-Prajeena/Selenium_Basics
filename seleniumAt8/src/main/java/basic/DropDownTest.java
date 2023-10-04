package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://selenium.obsqurazone.com/select-input.php");

		WebElement selectColorDropdown = driver.findElement(By.id("single-input-field")); // Inspecting dropdown

		Select objSelectColorDropdown = new Select(selectColorDropdown); // Using Select class and its object to select
																			// the options of the dropdown

		List<WebElement> optionList = objSelectColorDropdown.getOptions(); // To display the available options in the
																			// dropdown, first we get the webelements of
																			// each option and store it in a list

		for (int i = 0; i < optionList.size(); i++) // to display the options stored in list
		{
			String optionValue = optionList.get(i).getText(); // First we get the webelements of each option stored in
																// list and then get the innertext of each option
			System.out.println("Option " + i + " = " + optionValue);

		}

		objSelectColorDropdown.selectByIndex(1);
		// objSelectColorDropdown.selectByValue("Red");
		// objSelectColorDropdown.selectByVisibleText("Red");

		WebElement selected = objSelectColorDropdown.getFirstSelectedOption();
		String displaySelected = selected.getText();
		System.out.println("Selected option = " + displaySelected);
		driver.close();

	}

}
