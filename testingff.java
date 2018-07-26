package testingbrowserchromeieff;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testingff 
  {
   public static void main(String[] args) 
   {
	 System.out.println("launching ff browser");
	 System.setProperty("webdriver.gecko.driver","C:\\Users\\minimall\\eclipse-workspace\\testingbrowser\\drivers\\geckodriver.exe"); 
	 System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
	 WebDriver driver = new FirefoxDriver(); 
	 driver.manage().window().maximize(); 
	 driver.close();
		 }
       }