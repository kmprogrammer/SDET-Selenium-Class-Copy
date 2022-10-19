package webDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertWithOkCancelButton {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		//alert with OK and cancel button
		driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click(); 
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		String ExpText="You pressed Ok";
		driver.switchTo().alert().accept();
		String ActText=driver.findElement(By.xpath("//p[@id='demo']")).getText();
		
		if(ExpText.equals(ActText)==true) {
			System.out.println("Test is passed");
		}
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		String ExpTextCancel="You Pressed Cancel";
		driver.switchTo().alert().dismiss();
		
		ActText=driver.findElement(By.xpath("//p[@id='demo']")).getText();
		if(ExpTextCancel.equals(ActText)==true) {
			System.out.println("Test is passed");
		}
	}

}
