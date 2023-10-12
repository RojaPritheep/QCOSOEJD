package DataDriven;

import java.util.concurrent.TimeUnit;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reading_Worksheet {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
Workbook wb=WorkbookFactory.create(fis) ;
String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
String username = wb.getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
String password = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys(username);
         driver.findElement(By.id("pass")).sendKeys(password);
         String title = driver.getTitle();
         wb.getSheet("Sheet1").createRow(6).createCell(1).setCellValue(title);
        // wb.getSheet("Sheet1").createRow(4).createCell(8).setCellValue(title);
         FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\TestData.xlsx");
         wb.write(fos);
       
	}

}