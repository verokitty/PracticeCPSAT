package srcTestNG;


	//package srcTestNG;

	import org.testng.annotations.Test;

	import srctest.ReadWriteExcel1;

	import org.testng.annotations.BeforeTest;

import java.io.File;
import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Collections;
	import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.AfterTest;

	public class stadium {
		
		WebDriver driver;

WebElement abc;
		  @BeforeTest
		  public void beforeTest() {
			  		  System.setProperty("webdriver.chrome.driver", "G:\\cpsatnewproject\\PracticeCPSAT\\Resource\\Drivers\\chromedriver.exe");
				 driver=new ChromeDriver();
				driver.manage().window().maximize();
			    }//http://www.pepperfry.com/

	  @Test
	  public void f() throws Exception {
		  
		
		  driver.get("https://www.google.com/maps/");
		  WebDriverWait wait=new WebDriverWait(driver, 30);
		 
				 WebElement Search_field=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='searchboxinput']")));
				 //HClink.click();
			  System.out.println("searching");
			  Search_field.sendKeys("wankede stadium");
			  Search_field.sendKeys(Keys.ENTER); 
			  File photo=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				 FileUtils.copyFile(photo, (new File("G:\\cpsatnewproject\\PracticeCPSAT\\Target\\Screenshot\\Screenshot1.png")));
				 
						 WebElement Headfield=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/jsl[1]/div[3]/div[7]/div[11]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/h1[1]")));
					
				 if(Headfield.getText().toString().contains("Stadium")) 
					 
					  System.out.println("Stadium found");
					  
					  if(  driver.getTitle().toString().contains("Wankhede Stadium - Google Maps"))
						 System.out.println("Tittle verified found");
					  System.out.println("Stadium found");
					  
					  WebElement ratefield=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/jsl[1]/div[3]/div[7]/div[11]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/span[1]/span[1]/span[1]")));
					  
					  WebElement reviewfield=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"pane\"]/div/div[1]/div/div/div[3]/div[1]/div[2]/div/div[1]/span[2]/ul/li/span[2]/span[1]/button")));
					  
					  WebElement addfield=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/jsl[1]/div[3]/div[7]/div[11]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/span[3]/span[3]")));
					  WebElement phfield=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/jsl[1]/div[3]/div[7]/div[11]/div[1]/div[1]/div[1]/div[1]/div[11]/div[1]/div[1]/span[3]/span[3]")));
	 WebElement comfield=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/jsl[1]/div[3]/div[7]/div[11]/div[1]/div[1]/div[1]/div[1]/div[10]/div[1]/div[1]/span[3]/span[3]")));

					  
							 System.out.println("rate="+ratefield.getText().toString());
							 System.out.println("reviewfield="+reviewfield.getText().toString());
							 if( comfield.getText().toString().contains("mumbaicricket.com"))
								 System.out.println("mumbaicricket.com verified found");
							 System.out.println("addfield="+addfield.getText().toString());
							 if( phfield.getText().toString().contains("022 2279 5500"))
								 System.out.println("022 2279 5500 verified found");
							 File photo1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
							 FileUtils.copyFile(photo1, (new File("G:\\cpsatnewproject\\PracticeCPSAT\\Target\\Screenshot\\Screenshot2.png")));
							 
							  
							 
				 }
				 
			 
	 
		  
		
			
		  
	  
	  
	 
	  
	  

	  @AfterTest
	  public void afterTest() {
	  }
	
		 

}
