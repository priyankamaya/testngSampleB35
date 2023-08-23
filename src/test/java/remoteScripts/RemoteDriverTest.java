package remoteScripts;

import org.testng.annotations.Test;



import org.testng.AssertJUnit;
import java.net.MalformedURLException;
import java.net.URI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;


public class RemoteDriverTest {
	
	WebDriver driver;
@Test
  public void remoteTest() throws MalformedURLException {
	  
	  ChromeOptions options=new ChromeOptions();
	  options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
	  //options.setCapability(CapabilityType.BROWSER_VERSION, "116");
	  String strHub="http://172.31.11.43:4444/";
	  //driver= new RemoteWebDriver(new URI(strHub),options);
	  driver.get("http://www.google.com/");
	  WebElement srcBox=driver.findElement(By.name("q"));
	  srcBox.sendKeys("Selenium Tutorial");
	  srcBox.sendKeys(Keys.ENTER);
	  AssertJUnit.assertEquals(driver.getTitle(),"Selenium Tutorial - Google Search");
  }
}
