package webElements1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autoSuggestion {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("phone");
	List<WebElement> allvalues = driver.findElements(By.xpath("//[li[@data-view-typr='1']"));
		Thread.sleep(4000);
		for(WebElement b:allvalues)
		{
			System.out.println(b.getText());
			
		}
Thread.sleep(4000);
driver.quit();
	}

}
