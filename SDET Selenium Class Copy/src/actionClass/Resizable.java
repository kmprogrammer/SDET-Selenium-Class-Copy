package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://jqueryui.com/resizable/");
		
		driver.switchTo().frame(0);
		WebElement resizable=driver.findElement(By.xpath("/html/body/div/div[3]"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(resizable).dragAndDropBy(resizable, 150, 150).build().perform();
		Thread.sleep(3000);
	}

}
