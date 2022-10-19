package javaScriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleOfThePage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		
		//System.out.println(driver.getTitle());
		//By using java script method
		String title = JavaScriptUtil.getTitleByJS(driver);
		System.out.println(title);
		
		driver.close();
	}

}
