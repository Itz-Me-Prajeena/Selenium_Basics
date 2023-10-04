package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropHandling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		WebElement frame=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		WebElement draggableSource=driver.findElement(By.id("draggable"));
		String display1=draggableSource.getText();
		System.out.println(display1);
		WebElement droppableTarget=driver.findElement(By.id("droppable"));
		String display2=droppableTarget.getText();
		System.out.println(display2);
		Actions actions=new Actions(driver); //Actions class to perform keyboard and mouse interactions
		actions.dragAndDrop(draggableSource, droppableTarget).perform(); //perform() method to execute the actions performed using keyboard or mouse
		
		driver.switchTo().defaultContent();

	}

}
