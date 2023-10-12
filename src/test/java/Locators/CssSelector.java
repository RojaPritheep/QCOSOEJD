package Locators;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		//driver related statement
				WebDriverManager.edgedriver().setup();
						
				//open empty browser
				WebDriver driver = new EdgeDriver();
						
				//for maximizings
				driver.manage().window().maximize();
				//to open browser
				driver.get("https://www.facebook.com/");
				//for email id
				driver.findElement(By.cssSelector("input[id='email']")).sendKeys("sriram");
				
			//for password 
				driver.findElement(By.cssSelector("input[type='password']")).sendKeys("12345");
				
				
				//for login button
		        driver.findElement(By.cssSelector("button[name='login']")).click();
		
				
		
				
			
				
				

	}

}
