package Demo;

import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DemoTest{
	
@Test
public void verify() throws IOException
{
	//configure the browser
	WebDriverManager.chromedriver().setup();
	//launch the the browser
	WebDriver driver=new ChromeDriver();
	//navigate to application
	driver.get("https://www.flipkart.com/");
	
	WorkbookFactory.create(false);
	
	
	
}

}
