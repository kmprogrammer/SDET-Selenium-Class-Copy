package class20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class FileUploadUsingSikuli {

	public static void main(String[] args) throws InterruptedException, FindFailed {

		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("//*[@id=\"imagesrc\"]")).click();
		System.out.print("I am here");
		String imagesFilePath="Desktop";
		
		String inputFilePath="Desktop";
		
		Screen s=new Screen();
		
		Pattern fileInputTextBox=new Pattern(imagesFilePath+"box.PNG");
		Pattern openButton=new Pattern(imagesFilePath+"Open.PNG");
		
		//Thread.sleep(1000);
		
		s.wait(fileInputTextBox, 1);
		s.type(fileInputTextBox,inputFilePath+"box.jpg");
		s.click(openButton);
		
	}

}
