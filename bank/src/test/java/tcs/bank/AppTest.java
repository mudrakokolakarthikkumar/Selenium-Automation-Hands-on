package tcs.bank;

import static org.junit.Assert.assertTrue;

import java.awt.Dimension;
import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     * 
     */
	
	private WebDriver driver;
	  private Map<String, Object> vars;
	  JavascriptExecutor js;
	  @Before
	  public void setUp() {
		  try
		  {
			  System.setProperty("webdriver.chrome.driver", "D:\\Development\\Github\\Selenium-Automation-Hands-on\\chromedriver.exe");
			  driver = new ChromeDriver();
		  }
	   catch(Exception e)
		  {
		   System.out.println(e);		  }
	    //js = (JavascriptExecutor) driver;
	    vars = new HashMap<String, Object>();
	  }
	  @After
	  public void tearDown() {
	    driver.quit();
	  }
	  @Test
	  public void test1() {
	    driver.get("https://www.calculatorsoup.com/calculators/math/basic.php");
	   // driver.manage().window().setSize(new Dimension(1050, 708));
	    driver.findElement(By.name("three")).click();
	    driver.findElement(By.name("add")).click();
	    driver.findElement(By.name("three")).click();
	    driver.findElement(By.name("calculate")).click();
	    
	    driver.findElement(By.id("display")).click();
	    WebElement TxtBoxContent = driver.findElement(By.id("display"));
	    System.out.println("Printing " + TxtBoxContent.getAttribute("value"));
	    if(Integer.parseInt(TxtBoxContent.getAttribute("value"))==6)
	    	assertTrue(true);
	    else
	    	assertTrue(false);
	  }
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void printmsg()
    {
    	assertTrue(false);
    }
}
