package javaScriptExecutor;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DrawingBorder {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		
		//Drawing border & take screenshot
		WebElement joinfree = driver.findElement(By.xpath("/html/body/div[3]/div[2]/a[1]"));
		JavaScriptUtil.drawBorder(joinfree, driver);
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File trg = new File("C:\\Users\\krishna\\Desktop\\w3s.png");
		FileUtils.copyFile(src, trg);
	}

}
