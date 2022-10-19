package ashotAPI;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class CaptureLogoImage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.manage().window().maximize();
		
	
		WebElement logoImageElement = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img"));
		
		Screenshot logoImageScreenshot = new AShot().takeScreenshot(driver, logoImageElement);
		
		try {
			ImageIO.write(logoImageScreenshot.getImage(), "png",new File("C://Users//krishna//Desktop//New folder//mylogo.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		File f = new File("C://Users//krishna//Desktop//New folder//mylogo.png");
		
		if(f.exists()) {
			System.out.println("Image File Captured");
		}
		else {
			System.out.println("Image File Not Exist");
			
		}
		driver.close();
	}

}
