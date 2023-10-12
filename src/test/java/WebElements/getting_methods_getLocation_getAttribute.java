package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getting_methods_getLocation_getAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/login.php");
		 WebElement email = driver.findElement(By.id("email"));
		String attribute = email.getAttribute("type");
		System.out.println(attribute);
		Point coOrdination = email.getLocation();
		int x= coOrdination.getX();
		int y = coOrdination.getY();
		System.out.println(x);
		System.out.println(y);
		

		 

	}

}
