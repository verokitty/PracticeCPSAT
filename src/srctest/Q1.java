package srctest;


	

	import java.io.File;
import java.io.IOException;
import java.util.List;
	import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.After;
	import org.junit.Before;
	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class Q1 {
		WebDriver driver;
		@Before
		public void launchBrowser() {
			System.setProperty("webdriver.gecko.driver","G:\\cpsatnewproject\\projectnew\\Drivers\\geckodriver.exe");//set the chrome driver
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			//driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); 
		}
		@Test
		public void Q1test() throws IOException {
			driver.get(" http://www.shoppersstop.com");
			 System.out.println("3 articles in english A and THE");
			 WebDriverWait wait=new WebDriverWait(driver, 30);
			 
		  WebElement BRANDfield=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'BRANDS')]")));
		 BRANDfield.click();
			
		 WebElement HCfield=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/main/section/div/div/div/ul/li[1]/div/div[2]/a")));
		 HCfield.click();
		 
		 File photo=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(photo, (new File("G:\\cpsatnewproject\\PracticeCPSAT\\Target\\Screenshot\\Screenshot2.png")));
		 
		 
		 WebElement sfield=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/main[1]/footer[1]/div[1]/p[1]")));
			if(sfield.getText().toString().contains("start something new"))
			 System.out.println("Text present");
			 else
				 System.out.println("Text NOT present"); 
			 
			WebElement LINKfield=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/main[1]/footer[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]")));
			 System.out.println( LINKfield.getAttribute("href").toString());
		}
		

		@After

		public void closebrowser() {
		//	driver.close();
			
			
		}
		
		
		
	}


