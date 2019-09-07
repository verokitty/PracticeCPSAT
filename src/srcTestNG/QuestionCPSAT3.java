package srcTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;
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

public class QuestionCPSAT3 {

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
  public void f3() throws Exception {
	  driver.get("https://www.shoppersstop.com/");
	  WebDriverWait wait=new WebDriverWait(driver, 30);
	  
			 WebElement MEN_field=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txtsearch']")));
			 
			 Actions action = new Actions(driver);
			    action.moveToElement(MEN_field).clickAndHold().build().perform();
			    List <WebElement> menslist=driver.findElements(By.xpath("///html[1]/body[1]/main[1]/nav[1]/div[2]/div[1]/ul[1]/li[4]/div[1]/div[1]/ul[1]/li"));
				  for(WebElement menslist1:menslist) {
					 
					  
					  System.out.println("menslist:"+menslist1.getText().toString());
					  if( menslist1.getText().toString().contains("Accessories")){
						  
						  System.out.println(" Found/Verified");
						 
						  }

						  else

						  System.out.println(" NOT Found/Verified");
						  
						  List <WebElement> Accessories=driver.findElements(By.xpath("/html[1]/body[1]/main[1]/nav[1]/div[2]/div[1]/ul[1]/li[3]/div[1]/div[1]/ul[1]/li[5]/div[1]/ul[1]/li[1]/div[1]/ul[1]/li"));
						  for(WebElement Accessories1:Accessories) {
							  System.out.println("menslist:"+Accessories1.getText().toString());
							  
						  }

					  
					  
				  }	
				  WebElement allstore_field=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='text-right']//a[contains(text(),'All Stores')]")));
				  allstore_field.click();
				  
				  WebElement allstoreselect=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='city-name']")));
				 Select  s1=new Select(allstoreselect);
				s1.selectByVisibleText("Jaipur");
				 WebElement allstore=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='city-name']")));
				 Select  s2=new Select(allstore);
				 List <WebElement> storelist=driver.findElements(By.xpath("//select[@id='city-name']/option"));
				  for(WebElement storelist1:storelist) {
					 
					  
					  System.out.println("storelist1:"+storelist1.getText().toString());
					  	if( storelist1.getText().toString().contains("Mumbai")){
						  
						  System.out.println(" Found/Verified");
						 
						  }

						  else

						  System.out.println(" NOT Found/Verified");
					  	if( storelist1.getText().toString().contains("Delhi")){
							  
							  System.out.println(" Found/Verified");
							 
							  }

							  else

							  System.out.println(" NOT Found/Verified");
					  	if( storelist1.getText().toString().contains("Goa")){
							  
							  System.out.println(" Found/Verified");
							 
							  }

							  else

							  System.out.println(" NOT Found/Verified");
							  
							  
						  
				  }
				  System.out.println(driver.getTitle());
				  driver.navigate().back();
				  System.out.println(driver.getTitle());
		  
		 
		 
  }
  
  @AfterTest

	public void closebrowser() {
		driver.close();
		
		
	}}