package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
//for email by using attribute name
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sriram");
//for password using xpath contains
driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("12345");
//for  forgotten using xpath contains  text
driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();



	}

}
