package TestNG_Parallel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Compatability {
	@Parameters({"browsername"})
	@Test
	public void fb(String browser) {
		WebDriver driver;
		if(browser.equals("edge"))
		{
			//open  empty broser
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver(); 
		}
		else {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SRIROJARAM\\eclipse-workspace\\QCO_SOEJVD_A2\\src\\main\\resources\\chromedriver.exe");	
		driver=new ChromeDriver();
		
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/login/");
		
		}

}
