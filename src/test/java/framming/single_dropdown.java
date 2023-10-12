package framming;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class single_dropdown {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https:www.amazon.in/");
		//address of dropdown
		WebElement dD = driver.findElement(By.xpath("//select[@title='Search in']"));
		//handling dropdown
		Select s = new Select(dD);
		s.selectByIndex(7);
		Thread.sleep(3000);
s.selectByValue("search-alias=luggage");
Thread.sleep(3000);
s.selectByVisibleText("Baby");
System.out.println(s.isMultiple());
List<WebElement> value = s.getOptions();
System.out.println(value.size());
for(WebElement b:value) {
	System.out.println(b.getText());
	
}

	}
	

}
