package DataDriven;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reading_Propertyfile {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		Properties p=new Properties();
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Data.properties");
		p.load(fis);
		String urlApp = p.getProperty("url");
		String user = p.getProperty("username");
		String password = p.getProperty("password");
		String browser = p.getProperty("browser");
		WebDriver driver;
		if(browser.equals("edge")) {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		}
		else {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\SRIROJARAM\\eclipse-workspace\\QCO_SOEJVD_A2\\src\\main\\resources\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		
		
		WebDriverManager.edgedriver().setup();
		//WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		//implicit
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(urlApp);
		driver.findElement(By.id("email")).sendKeys(user);
driver.findElement(By.id("pass")).sendKeys(password);
		
		

	}

}
