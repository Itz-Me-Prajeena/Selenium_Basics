package seleniumTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class SoftAssertEx {
  @Test (priority = 2)
  public void soft() {
	  SoftAssert softassert=new SoftAssert();
	  String actual="Hello";
	  String expected="World";
	  softassert.assertEquals(actual, expected,"customized error msg 1");
	  System.out.println("Remaining statement 3");
	  System.out.println("Remaining statement 4");
	  boolean a=true;
	  softassert.assertTrue(a,"customized error msg true");
	  softassert.assertFalse(a,"customized error msg false");
	  System.out.println("Remaining statement 5");
	  System.out.println("Remaining statement 6");
	  
	  softassert.assertAll();
  }
  @Test (priority = 1)
  public void hard() {
	  
	  String actualMsg="Hello";
	  String expectedMsg="World";
	  Assert.assertEquals(actualMsg, expectedMsg,"customized hard assert error msg");
	  System.out.println("Remaining statement 1");
	  System.out.println("Remaining statement 2");
	  
  }
  @Test (priority = 3)
  public void hardboolean() {
	  
	  boolean b=true;
	  Assert.assertTrue(b,"customized error msg hard true");
	  Assert.assertFalse(b,"customized error msg hard false");
	  System.out.println("Remaining statement 5");
	  System.out.println("Remaining statement 6");
	  
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
