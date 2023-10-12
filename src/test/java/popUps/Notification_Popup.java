package popUps;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Notification_Popup {

	public static void main(String[] args) {
		//EdgeOptions option=new EdgeOptions();
		ChromeOptions options=new ChromeOptions();
		//options.addArguments("--disable-notifications");
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SRIROJARAM\\eclipse-workspace\\QCO_SOEJVD_A2\\src\\main\\resources\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\SRIROJARAM\eclipse-workspace\QCO_SOEJVD_A2\src\main\resources\chromedriver.exe"));
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.redbus.com/");


	}

}
