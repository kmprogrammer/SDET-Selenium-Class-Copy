package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAlternativeMethod {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		
		//If direct click method is not working on any place so we will use the java script method
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[3]/div[2]/a[1]"));
		JavaScriptUtil.clickElementByJS(loginBtn, driver);
	}

}
