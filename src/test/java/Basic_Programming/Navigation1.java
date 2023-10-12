package Basic_Programming;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation1 {

	public static void main(String[] args) throws Throwable{
		// TODO Auto-generated method stub
		//driver related statement
				WebDriverManager.edgedriver().setup();
				
				//open empty browser
				WebDriver driver = new EdgeDriver();
				
				Thread.sleep(3000);
				//for maximizings
				driver.manage().window().maximize();

 driver.get("https://www.flipkart.com");
 Thread.sleep(3000);
 driver.navigate().to("https://www.facebook.com/");
Thread.sleep(3000);
 
driver.quit();
	}

}
