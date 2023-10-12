package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Preceding_siblings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		
		//open empty browser
		WebDriver driver = new EdgeDriver();
		
		
		//for maximizings
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/s?k=mobile&crid=3PIW8WS361057&sprefix=mobil%2Caps%2C356&ref=nb_sb_ss_ts-doa-p_2_5");
        driver.findElement(By.xpath("//a[@class='nav-a  '][5]/preceding-sibling::a[1]")).clear();

	}

}
