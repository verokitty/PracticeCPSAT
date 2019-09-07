package srcTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import java.util.concurrent.TimeUnit;

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
public class QustionCPSAT6 {

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
  public void f6() throws Exception {
	  driver.get("http://www.meripustak.com/");
	  WebDriverWait wait=new WebDriverWait(driver, 30);
	  String sheetpath="G://cpsatnewproject//PracticeCPSAT//Resource//QuestionCPSAT6.xls";
	  ReadWriteExcel.setExcelFile(sheetpath,"Sheet1");
	  for(int i=0;i<3;i++) 
		 {Thread.sleep(2000);
			 String textfromexcel=ReadWriteExcel.getCellData(i,0);
			 Thread.sleep(2000);
			 WebElement variable_field=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/center[1]/table[1]/tbody[1]/tr[1]/td[1]/table[2]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/form[1]/div[1]/center[1]/table[1]/tbody[1]/tr[1]/td[1]/input[1]")));
			 //HClink.click();
			 variable_field.clear();
			 variable_field.sendKeys(textfromexcel);
			if(i==0) {
				WebElement measure1_field=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/center[1]/table[1]/tbody[1]/tr[1]/td[1]/table[2]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/form[1]/div[1]/center[1]/table[1]/tbody[1]/tr[2]/td[1]/select[3]")));
			 measure1_field.click();
			 
			 WebElement measure2_field=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/center[1]/table[1]/tbody[1]/tr[1]/td[1]/table[2]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/form[1]/div[1]/center[1]/table[1]/tbody[1]/tr[2]/td[2]/select[1]/option[7]")));
			 measure2_field.click();
			 WebElement convert_field=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/center[1]/table[1]/tbody[1]/tr[1]/td[1]/table[2]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/form[1]/div[1]/center[1]/table[1]/tbody[1]/tr[3]/td[1]/input[1]")));
				convert_field.click();
				WebElement result_field=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/center[1]/table[1]/tbody[1]/tr[1]/td[1]/table[2]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/form[1]/div[1]/center[1]/table[1]/tbody[1]/tr[4]/td[1]/input[1]")));
				System.out.println("Keyword"+textfromexcel+"kilometers:"+textfromexcel+  "meters:"+result_field.getText().toString());
		 }
			
			if(i==1) {
				WebElement measure1_field=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/center[1]/table[1]/tbody[1]/tr[1]/td[1]/table[2]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/form[1]/div[1]/center[1]/table[1]/tbody[1]/tr[2]/td[1]/select[1]")));
			 measure1_field.click();
			 
			 WebElement measure2_field=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/center[1]/table[1]/tbody[1]/tr[1]/td[1]/table[2]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/form[1]/div[1]/center[1]/table[1]/tbody[1]/tr[2]/td[2]/select[1]/option[3]")));
			 measure2_field.click();
			 WebElement convert_field=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/center[1]/table[1]/tbody[1]/tr[1]/td[1]/table[2]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/form[1]/div[1]/center[1]/table[1]/tbody[1]/tr[3]/td[1]/input[1]")));
				convert_field.click();
				WebElement result_field=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/center[1]/table[1]/tbody[1]/tr[1]/td[1]/table[2]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/form[1]/div[1]/center[1]/table[1]/tbody[1]/tr[4]/td[1]/input[1]")));
				System.out.println("Keyword"+textfromexcel+"feet:"+textfromexcel+  "inch:"+result_field.getText().toString());
		 }
			if(i==2) {
				WebElement measure1_field=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/center[1]/table[1]/tbody[1]/tr[1]/td[1]/table[2]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/form[1]/div[1]/center[1]/table[1]/tbody[1]/tr[2]/td[1]/select[6]")));
			 measure1_field.click();
			 
			 WebElement measure2_field=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/center[1]/table[1]/tbody[1]/tr[1]/td[1]/table[2]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/form[1]/div[1]/center[1]/table[1]/tbody[1]/tr[2]/td[2]/select[1]/option[4]")));
			 measure2_field.click();
			 WebElement convert_field=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/center[1]/table[1]/tbody[1]/tr[1]/td[1]/table[2]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/form[1]/div[1]/center[1]/table[1]/tbody[1]/tr[3]/td[1]/input[1]")));
				convert_field.click();
				WebElement result_field=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/center[1]/table[1]/tbody[1]/tr[1]/td[1]/table[2]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/form[1]/div[1]/center[1]/table[1]/tbody[1]/tr[4]/td[1]/input[1]")));
				System.out.println("Keyword"+textfromexcel+"meters:"+textfromexcel+  "kilometers:"+result_field.getText().toString());
		 }
			
			
			}
		 
  }
  
  @AfterTest

	public void closebrowser() {
		driver.close();
		
		
	}

}
