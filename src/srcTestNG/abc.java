/*package srcTestNG;


import org.testng.annotations.Test;



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


public class abc {


	WebDriver driver;
	
	 int i=0;
	  int [] sort1=new int[30];
@BeforeTest
public void beforeTest() {
		  		  System.setProperty("webdriver.chrome.driver", "G:\\cpsatnewproject\\PracticeCPSAT\\Resource\\Drivers\\chromedriver.exe");
			 driver=new ChromeDriver();
			driver.manage().window().maximize();
		    }//http://www.pepperfry.com/

  //@Test(priority=)
  public void popupclose() throws Exception {
	  
	  	  
	  driver.get("http://www.pepperfry.com/");
	  WebDriverWait wait=new WebDriverWait(driver, 30);
		ReadWriteExcel.setExcelFile("G://cpsatnewproject//PracticeCPSAT//Resource//Test.xlsx", "Sheet1");
		Thread.sleep(5000);
		try {
		WebElement popuptest=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='signinupPopupBox']/div/div[1]/div[1]/h5")));
		if(popuptest.getText().contains("New Customer?"))
			{
			WebElement popuptest1=driver.findElement(By.xpath("//*[@id='signinupPopupBox']//a[@href='javascript:void(0);']"));
			popuptest1.click();
		
			} }
		catch(Exception e) {}
}

//@Test(priority=1)
public void f1ReadWriteExcel() throws Exception {
	 WebDriverWait wait=new WebDriverWait(driver, 30);
	 for(int j=0;j<3;j++) {
		String textfromexcel=ReadWriteExcel.getCellData(j,0);
		System.out.println("Price"+textfromexcel);
		  WebElement searchfield=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='search']")));
		  searchfield.clear();
		searchfield.sendKeys(textfromexcel);
		searchfield.sendKeys(Keys.ENTER);
		
		f2sortsearch();
		f3verifyorder();
	 }
}		


public void f2sortsearch() throws Exception {
	 WebDriverWait wait=new WebDriverWait(driver, 30);
	 WebElement filtermenu=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@id='curSortType']")));
		filtermenu.click();
		WebElement filtermenuselection=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Price: Low to High')]")));
		filtermenuselection.click();
		Thread.sleep(5000);
		List <WebElement> pricelist =driver.findElements((By.xpath("///span[@class='clip-offr-price']")));
	  try{
		for(WebElement prices:pricelist) {
			//WebElement pricename=prices.findElement(By.xpath("//span"));
			String prices1=prices.getText().replaceAll("[^0-9]","");
			System.out.print(","+prices1);
			try{
				//sort1[i]=0;
				int price=Integer.parseInt(prices1);
				sort1[i]=price;
				i++;
			}
			catch (NumberFormatException e) {System.out.println("@@###@@@###");}
			for (i=0;i<10;i++)
			System.out.println(sort1[i]);
		}}catch (Exception e) {}
		
}


public void f3verifyorder() throws Exception {
	  List<Integer> sort2 = new ArrayList<>();
		//int [] sort2=new int[30];
		for (i=0;i<10;i++)
		{
						
			sort2.add(sort1[i]);
			
		}
		
		 
		System.out.println("added to new list ");
		
		
		System.out.println(sort2);
		
		
		Collections.sort(sort2);
		System.out.println("sorted list ");
	
		System.out.println(sort2);
		
		for (i=0;i<10;i++)
		{
			
			
			if(sort2.get(i)!=sort1[i])
			{	System.out.println("Price not in Ascending order");
			break; }  
			else
				System.out.println("Price in Ascending order");
		}
		
}



@AfterTest

public void closebrowser() {
	driver.close();
	
	
}
}
*/