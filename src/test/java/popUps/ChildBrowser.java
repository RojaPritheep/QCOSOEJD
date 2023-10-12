package popUps;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		
		//open empty browser
		WebDriver driver = new EdgeDriver();
				
		//for maximizing
		driver.manage().window().maximize();
		//to open browser
		driver.get("https://www.skillrary.com/");
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		driver.findElement(By.xpath("(//a[@href='https://assess.skillrary.com/essay'])[2]")).click();
		//switch parent to child 
	Set<String> child = driver.getWindowHandles();
		for(String b:child)
		{driver.switchTo().window(b);
		}
		driver.findElement(By.id("mytext")).sendKeys("roja");
		Thread.sleep(3000);
		//switch child to parent
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
	
		}
	}



