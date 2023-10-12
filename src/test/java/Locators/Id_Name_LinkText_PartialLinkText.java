package Locators;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Id_Name_LinkText_PartialLinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//driver related statement
				WebDriverManager.edgedriver().setup();
						
				//open empty browser
				WebDriver driver = new EdgeDriver();
						
				//for maximizing
				driver.manage().window().maximize();
				//to open browser
				driver.get("https://www.facebook.com/");
				//address of email text field
				driver.findElement(By.id("email")).sendKeys("sriram");
				//address of password text field
				driver.findElement(By.name("pass")).sendKeys("1234");
				//address of login button
				driver.findElement(By.name("login")).click();
				//address of forgotten password link
				//driver.findElement(By.linkText("Forgotten password?")).click();
				driver.findElement(By.partialLinkText("Forgotten")).click();
				
				

	}

}
