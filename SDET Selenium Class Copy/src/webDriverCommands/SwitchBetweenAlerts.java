package webDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchBetweenAlerts {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		//alert with OK button
		driver.findElement(By.xpath("//a[normalize-space()='Alert with OK']")).click(); 
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		System.out.println(driver.switchTo().alert().getText());
		//switch to alert box
		driver.switchTo().alert().accept(); //close the alert by clicking the OK button
		
	}

}
