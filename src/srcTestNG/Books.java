package srcTestNG;

import org.testng.annotations.Test;

import srctest.ReadWriteExcel1;

import org.testng.annotations.BeforeTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Books {
	
	WebDriver driver;

	  @BeforeTest
	  public void beforeTest() {
		  		  System.setProperty("webdriver.chrome.driver", "G:\\cpsatnewproject\\PracticeCPSAT\\Resource\\Drivers\\chromedriver.exe");
			 driver=new ChromeDriver();
			driver.manage().window().maximize();
		    }

  @Test
  public void f() throws Exception {
	  driver.get("http://www.meripustak.com/");
	  WebDriverWait wait=new WebDriverWait(driver, 30);
	  ReadWriteExcel1.setExcelFile(costant.sheetpath,"Sheet3");
	  for(int i=0;i<3;i++) 
		 {Thread.sleep(2000);
			 String textfromexcel=ReadWriteExcel1.getCellData(i,0);
			 Thread.sleep(2000);
			 WebElement Search_field=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txtsearch']")));
			 //HClink.click();
			 
	
		  Search_field.sendKeys(textfromexcel);
		  Search_field.sendKeys(Keys.ENTER); 
		
			List <WebElement> pricelist =driver.findElements((By.xpath("//div[@id='book_list']/ul[1]/li")));
		int a=1;
			for(WebElement prices:pricelist) {
			WebElement pricename=prices.findElement(By.xpath("//span[@class='off_text']"));
			//System.out.print("***prices.getText().toString()");
				String prices1=pricename.getText().toString();
				System.out.println("--->DEF"+prices1);
				WebElement off=prices.findElement((By.xpath("//span[@itemprop='price']")));
				
				if(prices1.contains("OFF"))
					
					System.out.println("--->"+off.getText().toString());
				a++;
				if(a>10) break;
			}
		  System.out.println("************Book="+textfromexcel);
			 
		 }
	  
  }
  
 
  
  

  @AfterTest
  public void afterTest() {
  }
 
}
