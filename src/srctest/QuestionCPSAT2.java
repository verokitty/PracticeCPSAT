package srctest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
public class QuestionCPSAT2 {

	WebDriver driver;

	  @Before
	  public void beforeTest() {
		  
		  System.setProperty("webdriver.gecko.driver","G:\\cpsatnewproject\\projectnew\\Drivers\\geckodriver.exe");//set the chrome driver
			driver=new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", "G:\\cpsatnewproject\\PracticeCPSAT\\Resource\\Drivers\\chromedriver.exe");;//set the chrome driver
		//driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); 
		  		  
			 
		    }

  @Test
  public void f() throws Exception {
	  driver.get("https://code.makery.ch/library/dart-drag-and-drop/");
	  WebDriverWait wait=new WebDriverWait(driver, 30);
	  
		 
  }
  
  @After

	public void closebrowser() {
		driver.close();
		
		
	}
}
