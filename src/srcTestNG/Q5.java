package srcTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Q5 {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  driver.get("http://www.nseindia.com/");
	         
	        PageFactory.initElements(driver, pagefactory.class);
	        PageFactory.initElements(driver, pagefactory.class);
	         
	        pagefactory.loginFunc();
	        if(driver.getPageSource().toString().contains("U S Dollar-Indian Rupee - USDINR"))
	 		   System.out.println("text  FOUND");
	 	   else System.out.println("textnot FOUND");
	 	   
	       // pagefactory.logOffFunc();
	         
	     
	     }


@BeforeTest
public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "G:\\cpsatnewproject\\PracticeCPSAT\\Resource\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); 
}

@AfterTest
public void afterTest() {
	  driver.close();
}
}
