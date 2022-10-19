package autoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {

	

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//driver.findElement(By.id("input-4")).click();
		//When ever our above click method will not be working we will use an alternative method below
		
		WebElement button = driver.findElement(By.id("imagesrc"));
		
		 //By java script 
		 JavascriptExecutor js =(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();",button);
		 
//		Actions act = new Actions(driver);
//		act.moveToElement(button).click().perform();
		
		//execute autoIT exe File
		
		
		Runtime.getRuntime().exec("C:/Users/krishna/Desktop/update.exe");
		
//		Process p = Runtime.getRuntime().exec("C://Users//krishna//Desktop//update.exe");
//		
//		p.waitFor();
//		if (p.exitValue()==1) {
//		    System.out.println("YAY!");
//		}
//		else {
//		    System.out.println("boo");
//		}
	}

}
