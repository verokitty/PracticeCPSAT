package srcTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;



import org.testng.annotations.Test;



import org.testng.annotations.BeforeTest;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Q4 {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  driver.get("https://letterboxd.com/");
		
		 WebDriverWait wait=new WebDriverWait(driver, 30);
		 if(driver.getTitle().toString().contains("Letterboxd"))
	 		   System.out.println("text  FOUND");
	 	   else System.out.println("textnot FOUND");
		// ReadWriteExcel.setExcelFile("G://cpsatnewproject//PracticeCPSAT//Resource//Test1.xlsx","Sheet1");
		
	         /* WebElement field=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Open/Close menu')]")));
		  	if(field.isDisplayed())	
	  			field.click();
	          Thread.sleep(2000);*/
	        
	        		  WebElement field1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'People')]")));
	  		
	  			field1.click();
	  			Thread.sleep(2000);
	  			File photo=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  			 FileUtils.copyFile(photo, (new File("G:\\cpsatnewproject\\PracticeCPSAT\\Target\\Screenshot\\Screenshot3.png")));
	  			
	  		List <WebElement> revname=driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/ul[1]/li"));
	  	  for(WebElement revname1:revname) {
	  		  try {
	  		 // WebElement revname3= revname1.findElement(By.xpath("/h3[1]"));
	  		 WebElement revname2= revname1.findElement(By.tagName("a"));
	  		System.out.println(revname2.getText().toString());
	 
	  	  }
	  	  catch (StaleElementReferenceException e) {
	  		  
	  		  Thread.sleep(2000);
	  	  }
	  		 
	  	  }
	  	 WebElement revnameno= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/ul[1]/li[1]/p[1]/a[2]"));
 		  
	  		System.out.println(revnameno.getText().toString());
	  		
	  	  
	 
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
	 // driver.close();
  }

}
