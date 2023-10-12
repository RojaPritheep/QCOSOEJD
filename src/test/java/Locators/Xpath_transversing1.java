package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_transversing1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/s?k=mobile&crid=3PIW8WS361057&sprefix=mobil%2Caps%2C356&ref=nb_sb_ss_ts-doa-p_2_5");
		WebElement value = driver.findElement(By.xpath("//span[text()='Redmi Note 12 5G Matte Black 4GB RAM 128GB ROM | 1st Phone with 120Hz Super AMOLED and Snapdragon® 4 Gen 1 | 48MP AI Triple Camera']/../../../../../..//span[@class='a-price-whole']"));
		System.out.println(value.getText());
				}}

