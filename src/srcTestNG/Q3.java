/*package srcTestNG;

import org.testng.annotations.Test;

import projectnew.ReadWriteExcel;

import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Q3 {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  driver.get("https://www.firstcry.com/m/");
		
		 WebDriverWait wait=new WebDriverWait(driver, 30);
		 ReadWriteExcel.setExcelFile("G://cpsatnewproject//PracticeCPSAT//Resource//Test1.xlsx","Sheet1");
		 for (int iRow = 0;iRow < 3;iRow++){
	         String  actionKeyword = ReadWriteExcel.getCellData(iRow, 0);
	          //args1=costant.URL.toString();
	         // args2=obj.getProperty("Titleobj");
	          System.out.println(iRow+actionKeyword);
	            //use the concept of reflection to call the methods associated with the
	          Thread.sleep(2000);
	          
	        		  WebElement field1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[22]/div[2]/div[3]/div[2]/div[1]/div[1]/div[3]/a[1]")));
	  		if(field1.isDisplayed())
	  			field1.click();
	  		
	        		  WebElement sfield=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='search_box']")));
	  		sfield.sendKeys(actionKeyword);
	  		//sfield.sendKeys(Keys.ARROW_DOWN);
	  		sfield.sendKeys(Keys.ENTER);
	  		 WebElement pricesort=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='lft shortby sortpr']//a[contains(text(),'Price')]")));
		  		
	  		pricesort.click();
	  		int j=1;
	  		String a[];
	  		List <WebElement> pri=driver.findElements(By.xpath("/html[1]/body[1]/div[9]/div[2]/div[1]/div[2]/div[4]/div[1]/div[3]/div"));
	  	  for(WebElement pri1:pri) {
	  		  try {
	  		  WebElement pricce2= pri1.findElement(By.xpath("/div[1]/div[1]/div[6]/span[1]/a[1]"));
	  		  
	  	 a[j]=pricce2.getText().toString();
	 
	  		  j++;
	  	  if(j>5) break;
	  	  }
	  	  catch (StaleElementReferenceException e) {
	  		  
	  		  Thread.sleep(2000);
	  	  }
	  		 
	  	  }}}
	  	
	  		///html[1]/body[1]/div[9]/div[2]/div[1]/div[2]/div[4]/div[1]/div[3]/div[1]/div[1]/div[1]/div[6]/span[1]/a[1]
		 
	 // WebElement field=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/a[1]/small[1]/bdi[1]")));
  
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
*/