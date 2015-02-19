import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.mands.pageObjects.ReusableHelperClass;


@RunWith(Cucumber.class)

@Cucumber.Options( tags={"@firstTest", "~@todo", "~@wip", "~@ignore"},format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"})

public class RunnerTest_mands extends ReusableHelperClass
{	
	@BeforeClass
	public static void setup()
	{		
		driver = new FirefoxDriver();	
		System.out.println("Browser Used is: FIREFOX");   
		driver.manage().window().maximize();
		driver.get("http://www.marksandspencer.com/");
		try {Thread.sleep(5000);} catch (InterruptedException e) {e.printStackTrace();}
	}
	
	@AfterClass
	public static void teardown()
	{
		driver.quit();
	}

}
