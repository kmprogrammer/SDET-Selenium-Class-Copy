package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlashingTheElement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.twoplugs.com/");
		driver.findElement(By.xpath("//*[@id=\"details-button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"proceed-link\"]")).click();
		driver.manage().window().maximize();
		
		//Flashing 
		WebElement joinfree = driver.findElement(By.xpath("/html/body/div/header/div/ul/li[2]/a/span"));
		
		JavaScriptUtil.flash(joinfree, driver);
		
		
	}
	
	

}
