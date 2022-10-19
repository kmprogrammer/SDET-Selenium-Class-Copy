package robotAPI;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotAPIdemo {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button")).click();
		
		Robot robot=new Robot();
		
		//three times tab key then enter key
		robot.keyPress(KeyEvent.VK_TAB);
		
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		
	}

}
