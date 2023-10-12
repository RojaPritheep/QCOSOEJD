package popUps;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import Generic_Libraries.WebDriverUtilities;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Alter_Popup {

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
		//switching the control
		//Alert a1=driver.switchTo().alert();
		WebDriverUtilities ut1=new WebDriverUtilities();
		ut1.alter(driver);
		//Thread.sleep(3000);
		//System.out.println(a1.getText());
		//for yes button
		//a1.accept();
		//for cancel button
		//a1.dismiss();
		
		

	}

}
