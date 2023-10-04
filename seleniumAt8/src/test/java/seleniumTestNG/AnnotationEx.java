package seleniumTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class AnnotationEx {
  @Test
  public void firstTest() {
	  System.out.println("First test method");
  }
  @Test
  public void secondTest() {
	  System.out.println("Second test method");
	  
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
