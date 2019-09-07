package srcTestNG;


	 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class pagefactory {
   
   @FindBy(how=How.XPATH, using="/html[1]/body[1]/div[2]/div[3]/div[3]/div[4]/div[2]/div[1]/ul[2]/li[1]/div[1]/ul[1]/li[1]/div[1]/div[1]")
   public static WebElement CURRENCY;
 //select[@id='QuoteSearch']
   @FindBy(how=How.ID, using="QuoteSearch")
   public static WebElement Drop_btn;
    
   public static void loginFunc(){
	   Select s=new Select(Drop_btn);
	   s.selectByValue("Currency Derivatives");
	   System.out.println(CURRENCY.getText().toString());
	   if(CURRENCY.getText().toString().contains("USDINR"))
		   System.out.println("USDINR FOUND");
	   else System.out.println("USDINR not FOUND"+CURRENCY.getText().toString());
	   
		   
        
   }
}
