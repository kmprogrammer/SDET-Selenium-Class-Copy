package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenerateAlertInRunTime {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		
		//loginBtn.click()
		WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"w3loginbtn\"]"));
		JavaScriptUtil.clickElementByJS(loginBtn, driver);
		
		//Generate alert
		JavaScriptUtil.generateAlert(driver, "You clicked on login button");
		
		
	}

}
