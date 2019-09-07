package srcTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class TestSuiteforTestng {
  @Test
  public void f() {
	  
	  
  }
  @BeforeSuite
  public void beforeTest() {
	  System.out.print("Test getting Executed");
  }

  @AfterSuite
  public void afterTest() {
	  System.out.print("Test getting Terminating Executed");
  }

}
