package srctest;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Question3 {
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
	public void Q1test() throws IOException {
	driver.get("http://mu.ac.in/");
		
		 WebDriverWait wait=new WebDriverWait(driver, 30);
		 
//	  
//		 
		WebElement sfield=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#menu-item-3694 > a")));
		//Select select =new Select(sfield);
		//sfield.click();
		Actions action=new Actions(driver);
action.moveToElement(sfield).clickAndHold(sfield);
WebElement sfield1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("#menu-item-3820 > a")));
action.moveToElement(sfield1).click().build();
action.perform();
List <WebElement> dfield=driver.findElements(By.xpath("//div[@class='gdl-column-item']//ul/li"));
for(WebElement abc:dfield) {
	
	  
	  System.out.println("dep="+abc.getText().toString());
}

	}
	@After

	public void closebrowser() {
	//	driver.close();
		
		
	}
////div[id="main-superfish-wrapper"]/ul/li[4]/a/span/span
}
