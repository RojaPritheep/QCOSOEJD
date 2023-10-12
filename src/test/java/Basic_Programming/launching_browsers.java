package Basic_Programming;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class launching_browsers {

	public static void main(String[] args) throws Throwable {
		//driver related statement
		WebDriverManager.edgedriver().setup();
		
		//open empty browser
		WebDriver driver = new EdgeDriver();
		
		Thread.sleep(3000);
		//for maximizings
		driver.manage().window().maximize();

	}

}
