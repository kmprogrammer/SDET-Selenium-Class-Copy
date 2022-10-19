package webDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertWithTextBox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		//alert with Text box, OK and cancel button
		driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click(); 
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
		driver.switchTo().alert().sendKeys("Automation Testing user");
		driver.switchTo().alert().accept();
		
		String ExpString="Hello Automation Testing user How are you today";
		
		String ActString=driver.findElement(By.xpath("//p[@id='demo1']")).getText();
		
		if(ExpString.equals(ActString)==true) {
			System.out.println("Test is passed");
			
		}
		
		//Second time click
		driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click(); 
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		
	}

}
