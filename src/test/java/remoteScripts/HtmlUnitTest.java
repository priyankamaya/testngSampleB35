package remoteScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class HtmlUnitTest {
  @Test
  public void headlessTest() {
	  HtmlUnitDriver driver=new HtmlUnitDriver();
	 
	  driver.get("http://www.google.com/");
	  WebElement srcBox=driver.findElement(By.name("q"));
	  srcBox.sendKeys("Selenium Tutorial");
	  srcBox.submit();
	  AssertJUnit.assertEquals(driver.getTitle(),"Selenium Tutorial - Google Search");
  }
}
