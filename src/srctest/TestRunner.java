package srctest;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class TestRunner {
	   public static void main(String[] args) {
		      
		   Result result = JUnitCore.runClasses(Junitclass1.class);
		   System.out.println("Result: "+ result.wasSuccessful());

	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	     
	   }
}
