package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingThePage {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		
		//scroll till selected image or any object
//		WebElement image = driver.findElement(By.xpath("//*[@id=\"Frontend\"]/img"));
//		JavaScriptUtil.scrollingView(image, driver);
		
		//Scroll down page till end
		JavaScriptUtil.scrollPageDown(driver);
	}

}
