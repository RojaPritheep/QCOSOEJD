package popUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HiddenDivisionPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.redbus.com/");
		//address of date
		driver.findElement(By.xpath("//label[text()=' date']")).click();
driver.findElement(By.xpath("(//div[@class='DayNavigator__CalendarHeader-sc-1tlckkc-1 ccLrBz'])[1]//..//span[@class='DayTiles__CalendarDaysSpan-sc-14em0t0-1 kseSaZ']")).click();

	}

}
