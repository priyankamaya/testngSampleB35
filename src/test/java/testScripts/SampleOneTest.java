package testScripts;
import org.testng.AssertJUnit;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class SampleOneTest {
	WebDriver driver;
	@Parameters("browser")
	@BeforeMethod
	public void setup(String strBrowser)
	{
		
		if(strBrowser.equalsIgnoreCase("chrome"))
		{
			driver= new ChromeDriver();	
		}
		else if( strBrowser.equalsIgnoreCase("edge"))
		{
			driver= new EdgeDriver();	
		}
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.manage().window().maximize();	
	}	
  public void searchCypressTest() {
	  
	  
	  driver.get("http://www.google.com/");
	  WebElement srcBox=driver.findElement(By.name("q"));
	  srcBox.sendKeys("Cypress Tutorial");
	  srcBox.sendKeys(Keys.ENTER);
	  AssertJUnit.assertEquals(driver.getTitle(),"Cypress Tutorial - Google Search");
	  
	  
}
  
	 public void teardown(){
		 driver.close();
	 }
}
