package webElements1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class doubleClick {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		//implicit
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/product.php?product=java");
		WebElement plus = driver.findElement(By.xpath("//i[@ class='fa fa-plus']"));
		Thread.sleep(3000);
		Actions a=new Actions(driver);
		
		a.doubleClick(plus).perform();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		
		

	}

}
