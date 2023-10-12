package screenShots;

import java.io.IOException;
import java.io.File;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal_SS {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.snapdeal.com/");
WebElement signin = driver.findElement(By.xpath("//span[text()='Sign In']"));
//creating an object for action class
Actions a = new Actions(driver);
a.moveToElement(signin).perform();
Thread.sleep(3000);
driver.findElement(By.xpath("//span[@class='newUserRegister']")).click();

//screenshot
TakesScreenshot ts=(TakesScreenshot) driver;

 File src =ts .getScreenshotAs(OutputType.FILE);
File desc = new File("./Screenshots/snapdeal.png");
FileUtils.copyFile(src, desc);

	}

}


