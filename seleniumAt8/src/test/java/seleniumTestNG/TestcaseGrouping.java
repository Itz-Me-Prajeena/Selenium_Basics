package seleniumTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestcaseGrouping {
  @Test(priority = 1,groups = {"regression"})
  public void register() {
	  System.out.println("Registration testcase");
  }
  @Test(priority = 2,groups = {"regression"})
  public void login() {
	  System.out.println("Login testcase");
  }
  @Test(priority = 3,groups = {"regression","smoke"})
  public void add() {
	  System.out.println("Add testcase");
  }
  @Test(priority = 4,groups = {"regression","smoke"})
  public void delete() {
	  System.out.println("Delete testcase");
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
