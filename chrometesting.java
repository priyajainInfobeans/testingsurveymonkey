package testingbrowserchromeieff;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrometesting 
{
  public static void main(String[] args)
  {
  System.out.println("launching chrome browser");
  System.setProperty("webdriver.chrome.driver","C:\\Users\\minimall\\eclipse-workspace\\testingbrowser\\drivers\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize(); 
  driver.close();
		}
		     }


