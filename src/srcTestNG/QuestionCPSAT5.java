package srcTestNG;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
public class QuestionCPSAT5 {

	WebDriver driver;

	  @BeforeTest
	  public void beforeTest() {
		  
		  System.setProperty("webdriver.gecko.driver","G:\\cpsatnewproject\\projectnew\\Drivers\\geckodriver.exe");//set the chrome driver
			driver=new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", "G:\\cpsatnewproject\\PracticeCPSAT\\Resource\\Drivers\\chromedriver.exe");;//set the chrome driver
		//driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); 
		  		  
			 
		    }

  @Test
  public void f5() throws Exception {
	  driver.get(" http://ataevents.agiletestingalliance.org/");
	  WebDriverWait wait=new WebDriverWait(driver, 30);
	  String MainWindow=driver.getWindowHandle();	
	  
	  WebElement Heading_field=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'ATA Events')]")));
	//h1[contains(text(),'ATA Events')]
	  System.out.println("Heading:"+Heading_field.getText().toString());
	  WebElement cpstlink_field=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/section[1]/article[1]/div[2]/div[2]/div[1]/a[1]/div[1]")));
	  cpstlink_field.click();
	  
	  
	     // To handle all new opened window.				
	        		
	  Set<String> s1=driver.getWindowHandles();		
	     Iterator<String> i1=s1.iterator();	
	     while(i1.hasNext())			
	     {		
	         String ChildWindow=i1.next();		
	         		
	         if(!MainWindow.equalsIgnoreCase(ChildWindow))			
	         {    		
	              
	                 // Switching to Child window
	                 driver.switchTo().window(ChildWindow);	                                                                                                           
	                                			
	                 List <WebElement> linklistata=driver.findElements(By.tagName("a"));
	           	  for(WebElement linklistata1:linklistata) {
	           		 
	           		 
	           		  System.out.println("listsize:"+linklistata.size());
	           	  }	
	                              
				// Closing the Child Window.
	                     driver.close();		
	         }		
	     }		
	     // Switching to Parent window i.e Main Window.
	         driver.switchTo().window(MainWindow);
	         System.out.println("mainpagetitlte:"+driver.getTitle().toString());
		 
  }
  
  @AfterTest

	public void closebrowser() {
		driver.close();
		
		
	}}
	 
