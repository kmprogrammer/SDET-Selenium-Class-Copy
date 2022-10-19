package fileDownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFileUsingChrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		driver.findElement(By.xpath("//textarea[@id='textbox']")).sendKeys("testing");
		driver.findElement(By.id("createTxt")).click(); //generate download link
		driver.findElement(By.id("link-to-download")).click(); //display download and click
		
		//same thing for pdf file also
	}

}
