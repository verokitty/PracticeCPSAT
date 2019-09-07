package srctest;




import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Q2 {
	WebDriver driver;
	@Before
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "G:\\cpsatnewproject\\PracticeCPSAT\\Resource\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); 
	}
	@Test
	public void Q1test() {
		driver.get("http://www.wikipedia.org");
		
		 WebDriverWait wait=new WebDriverWait(driver, 30);
		 
	  WebElement field=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/a[1]/small[1]/bdi[1]")));
	  System.out.println(field.getText());
		  WebElement field1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body.jsl10n-visible:nth-child(2) div.central-featured:nth-child(2) div.central-featured-lang.lang1:nth-child(1) a.link-box > strong:nth-child(1)")));
		field1.click();
		WebElement sfield=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='navbar-query']")));
		sfield.sendKeys("Gangs of New York");
		sfield.sendKeys(Keys.ARROW_DOWN);
		sfield.sendKeys(Keys.ENTER);
		WebElement RATE=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/strong[1]/span[1]")));
		  System.out.println(RATE.getText().toString());
		  
				  WebElement mppa=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]")));
			
		  
		  String name1=mppa.getText().toString();
		  if (name1.contains("R")) {
				  System.out.println("present R");
		  }else  System.out.println("R not present ");
		  
				  WebElement gen=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/a[1]")));
			
			  
			  String name=gen.getText().toString();
			  if (name.contains("Crime")) {
					  System.out.println("present gen crime name");
			  }else  System.out.println("gen crime not present name");
			  
WebElement time=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/time[1]")));
			
			  
			  String t1=time.getText().toString();
			  String [] data =t1.split("hrs"); //breaks the string using , and returns an array of substring
		        int actt=Integer.parseInt(data[0]); //first col username
		       
		       
				  String [] data1 =data[1].split("min");
				  int actt1=Integer.parseInt(data1[0]);
						  int value=actt+actt1;
				  
				  if (value==180) {
					  System.out.println("present time correct");
			  }else  System.out.println(" not time correct"+t1);
	
			  if (t1.contains("180min")) {
					  System.out.println("present time correct");
			  }else  System.out.println(" not time correct"+t1);
			  WebElement reviewfield1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[3]/div[2]/span[1]/a[1]")));
			  reviewfield1.click();
			  
			  int a=1;
			  List <WebElement> rev=driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/section[2]/ul[1]/div[1]/li"));
			  for(WebElement revact:rev) {
				
				  WebElement revname=  revact.findElement(By.tagName("a"));
				  System.out.println("revname=" +revname.toString());
				  a++;
				  if(a>=5)break;
				  }
	}
	

	@After

	public void closebrowser() {
	//	driver.close();
		
		
	}
	
	
	
}
