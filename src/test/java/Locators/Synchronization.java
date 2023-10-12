package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.edgedriver().setup();
		
		//open empty browser
		WebDriver driver = new EdgeDriver();
		
		
		//for maximizings
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//explicitly wait
		//WebDriverWait wait =new WebDriverWait(driver,10);
		WebDriverWait wait=new WebDriverWait(driver,10);
		
		
		driver.get("https://www.facebook.com/login/");
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		wait.until(ExpectedConditions.visibilityOf(email));
		email.sendKeys("sriram");
		WebElement button = driver.findElement(By.xpath("//button[@value='1']"));
		wait.until(ExpectedConditions.elementToBeClickable(button));
		button.click();
		
		
	

	}

}
