package srcTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Pagefact {

	@FindBy(how=How.XPATH, using="/html[1]/body[1]")
    public static WebElement Frame1ele;
	@FindBy(how=How.XPATH, using="/html[1]/body[1]/div[1]")
    public static WebElement Frame2ele;
    		@FindBy(how=How.XPATH, using="/html[1]/body[1]")
    public static WebElement Frame3ele;
    		@FindBy(how=How.XPATH, using="/html[1]/body[1]")
    public static WebElement Frame4ele;
    
    @FindBy(how=How.XPATH, using="//frame[@name='frame-right']")//frame[@name='frame-right']
    public static WebElement Frame3;
    @FindBy(how=How.XPATH, using="//frame[@name='frame-middle']")
    public static WebElement Frame2;
    
    @FindBy(how=How.XPATH, using="//frame[@name='frame-left']")
    public static WebElement Frame1;
    @FindBy(how=How.XPATH, using="//frame[@name='frame-bottom']")
    public static WebElement Frame4;
    
  //frame[@name='frame-left']
     
    public static void PagefactAct(WebDriver driver){
    	driver.switchTo().frame(Frame1);
    	System.out.println("Frame1ele:"+Frame1ele.getText().toString());
    	driver.switchTo().defaultContent();
    	driver.switchTo().frame(Frame2);
    	System.out.println("Frame2ele:"+Frame2ele.getText().toString());
    	
    	driver.switchTo().defaultContent();
    	
    	driver.switchTo().frame(Frame3);
    	System.out.println("Frame3ele:"+Frame3ele.getText().toString());
    	driver.switchTo().defaultContent();
    	
    	driver.switchTo().frame(Frame4);
    	System.out.println("Frame1e4e:"+Frame4ele.getText().toString());
    	
         
    }
}

