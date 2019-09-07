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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Question2 {
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
		driver.get("https://www.google.com/maps");
		
		 WebDriverWait wait=new WebDriverWait(driver, 30);
		 
//	  
//		 
		WebElement sfield=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='searchboxinput']")));
		sfield.sendKeys("st crispin school");
		sfield.sendKeys(Keys.ENTER);
		WebElement addfield=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/jsl[1]/div[3]/div[7]/div[11]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/span[3]/span[3]")));
		  System.out.println(addfield.getText());
		  
		  
		  File photo=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(photo, (new File("G:\\cpsatnewproject\\PracticeCPSAT\\Target\\Screenshot\\Screenshot1.png")));
			
			 
			 WebElement field1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body.keynav-mode-off.screen-mode:nth-child(2) div.vasquette.pane-open-mode div.widget-pane.widget-pane-visible div.widget-pane-content.scrollable-y:nth-child(1) div.widget-pane-content-holder div.section-listbox.section-listbox-root div.section-listbox.section-listbox-space-between.section-listbox-flex-vertical.section-listbox-flex-horizontal:nth-child(5) div.iRxY3GoUYUY__actionicon.iRxY3GoUYUY__actionicon-text.iRxY3GoUYUY__promoted.iRxY3GoUYUY__high-contrast:nth-child(1) div.iRxY3GoUYUY__taparea button.iRxY3GoUYUY__button.gm2-hairline-border.section-action-chip-button > img.iRxY3GoUYUY__icon:nth-child(1)")));
				field1.click();
				//WebElement moto=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[@id='bodyContent']/div[1]/div[1]/div[1]/table[@class='infobox vcard']/tbody[1]/tr[2]/td[1]")));
				WebElement sfield1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']")));
				sfield1.sendKeys("Rewari sweets");
				sfield1.sendKeys(Keys.ENTER);
				
				//WebElement field2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='-directions-trip-0']/div[2]/div[3]/div[4][@data-value='Directions']/button")));
				WebElement field2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#section-directions-trip-0 > div.section-directions-trip-description > div:nth-child(3) > div:nth-child(4) > button")));
				field2.click();
				  List <WebElement> abc1=driver.findElements(By.xpath("//div[@class='directions-non-hideable-group']/div/div"));
		  for(WebElement abc:abc1) {
			  
			  String name=abc.getText().toString();
			  
					  System.out.println("add="+name);
			  
			  
			  }
	}
	////*[@id="section-directions-trip-0"]/div[2]/div[3]/div[4]/button

	@After

	public void closebrowser() {
		//driver.close();
		
		
	}
	
	
	
}
