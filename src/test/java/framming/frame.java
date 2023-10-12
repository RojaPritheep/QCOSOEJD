package framming;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frame {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.snapdeal.com/");
		WebElement signIn = driver.findElement(By.xpath("//span[text()='Sign In']"));
		//creating an object for action class
		Actions a=new Actions(driver);
		a.moveToElement(signIn).perform();
		Thread.sleep(4000);
		//Address of register
		driver.findElement(By.xpath("//span[text()='Register'][1]")).click();
		//handling frame
		driver.switchTo().frame("loginIframe");
		//address of mobile number
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']")).sendKeys("ghvjh");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='rfloat closepopup']")).click();
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//input[@name='keyword'])[1]")).sendKeys("gfchg");
		
	}

}
