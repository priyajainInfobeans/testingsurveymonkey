package testingbrowserchromeieff;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ietesting
  {
      public static void main(String[] args) 
      {
		System.out.println("launching ie browser");
		System.setProperty("webdriver.ie.driver","C:\\Users\\minimall\\eclipse-workspace\\testingbrowser\\drivers\\IEDriverServer.exe"); 
		WebDriver driver = new InternetExplorerDriver(); 
		driver.manage().window().maximize();
	    driver.close();
	    
	    
				}
				       }




	