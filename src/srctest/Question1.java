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

public class Question1 {
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
		 System.out.println("3 articles in english A and THE");
		 WebDriverWait wait=new WebDriverWait(driver, 30);
		 
	  WebElement field=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/a[1]/small[1]/bdi[1]")));
	  System.out.println(field.getText());
		  WebElement field1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body.jsl10n-visible:nth-child(2) div.central-featured:nth-child(2) div.central-featured-lang.lang1:nth-child(1) a.link-box > strong:nth-child(1)")));
		field1.click();
		WebElement sfield=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='searchInput']")));
		sfield.sendKeys("Anna university");
		sfield.sendKeys(Keys.ENTER);
		WebElement moto=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='mw-content-text']//table[@class='infobox vcard']/tbody/tr[2]/td/i")));
		  System.out.println(moto.getText());
		  //WebElement field2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("//span[@id='Notable_people']")));
			//field2.click();///div[@class='mw-parser-output']
				  List <WebElement> abc1=driver.findElements(By.xpath("//div[@id='content']/div[@id='bodyContent']/div[@id='mw-content-text']/div[@class='mw-parser-output']/ul/li"));
		  for(WebElement abc:abc1) {
			  
			  String name=abc.getText().toString();
			  if (name.contains("Shiv Nadar")) {
					  System.out.println("present name");
			  }else  System.out.println("not present name");
			  
			  }
	}
	

	@After

	public void closebrowser() {
	//	driver.close();
		
		
	}
	
	
	
}
