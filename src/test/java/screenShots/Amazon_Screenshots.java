package screenShots;

import java.io.File;
import java.util.concurrent.TimeUnit; 

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Amazon_Screenshots {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	//implicit wait
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.amazon.in/");
	//downcasting
	TakesScreenshot ts=(TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
File dest=new File("./Screenshots/amazon.png");
	FileUtils.copyFile(src,dest);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
