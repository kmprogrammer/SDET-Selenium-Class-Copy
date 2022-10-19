package javaScriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshingThePage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		
		//refreshing the page by direct command
		driver.navigate().refresh();
		
		//By Java Script command
		JavaScriptUtil.refreshBrowserByJS(driver);
		
	}

}
