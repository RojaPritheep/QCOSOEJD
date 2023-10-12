package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_ancestors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//driver related statement
				WebDriverManager.edgedriver().setup();
				
				//open empty browser
				WebDriver driver = new EdgeDriver();
				
			
				//for maximizings
				driver.manage().window().maximize();
				driver.get("https://www.amazon.in/s?k=mobile&crid=3PIW8WS361057&sprefix=mobil%2Caps%2C356&ref=nb_sb_ss_ts-doa-p_2_5");
		WebElement price=driver.findElement(By.xpath("//span[text()='Redmi 12C (Matte Black, 4GB RAM, 64GB Storage) | High Performance Mediatek Helio G85 | Big 17cm(6.71) HD+ Display with 5000mAh(typ) Battery']/ancestor::div[@class='sg-col sg-col-4-of-12 sg-col-8-of-16 sg-col-12-of-20 sg-col-12-of-24 s-list-col-right']//span[@class='a-price-whole']"));
				System.out.println(price.getText());

	}

}
