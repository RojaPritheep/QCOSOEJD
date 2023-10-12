package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_transversing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/s?k=mobile+phone&crid=INIT3BR6UMRD&sprefix=mobile%2Caps%2C305&ref=nb_sb_ss_ts-doa-p_3_6");
WebElement value= driver.findElement(By.xpath("//span[text()='Nokia G42 5G | Snapdragon® 480+ 5G | 50MP Triple AI Camera | 11GB RAM (6GB RAM + 5GB Virtual RAM) | 128GB Storage | 5000mAh Battery | 2 Years Android Upgrades | 20W Fast Charger Included | So Purple']/../../../../../..//span[@class='a-price-whole']"));
	System.out.println(value.getText());
	
	}}