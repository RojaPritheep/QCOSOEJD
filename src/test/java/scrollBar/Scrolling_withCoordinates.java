package scrollBar;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolling_withCoordinates {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https:www.amazon.in/");
		WebElement career = driver.findElement(By.xpath("//a[text()='Careers']"));
		Point CoOrdinates = career.getLocation();
		int x=CoOrdinates.getX();
		int y=CoOrdinates.getY();
		
		//downcasting
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window,scrollBy("+x+","+y+")");
		Thread.sleep(3000);
		//for clicking exception
		//js.executeScript("arguments[0].click();",career);
		career.click();
		

	}

}
