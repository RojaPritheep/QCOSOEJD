package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		        WebDriverManager.edgedriver().setup();
				WebDriver driver = new EdgeDriver();
				driver.manage().window().maximize();
				//implicit wait
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("https://www.facebook.com/login.php");
WebElement email = driver.findElement(By.id("email"));
email.sendKeys("kweknkj");
Thread.sleep(3000);
email.clear();

	}

}
