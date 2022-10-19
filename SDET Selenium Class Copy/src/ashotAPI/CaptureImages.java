package ashotAPI;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class CaptureImages {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.manage().window().maximize();
		
		BufferedImage expectedImage= ImageIO.read(new File("C:\\Users\\krishna\\Desktop\\New folder\\ohrm_branding.png"));
		
//		Thread.sleep(5000);
		
		WebElement logoImageElement = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[1]/img"));
		
		Screenshot logoImageScreenshot = new AShot().takeScreenshot(driver, logoImageElement);
		
		BufferedImage actulImage = logoImageScreenshot.getImage();
		
		ImageDiffer imgDiff = new ImageDiffer();
		ImageDiff diff = imgDiff.makeDiff(expectedImage, actulImage);
		
		if(diff.hasDiff()== true) {  //this will compare 2 images
			System.out.println("Image are not same");
		}
		else {
			System.out.println("Images are same");
		}
		driver.quit();
	}

}
