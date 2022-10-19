package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClick {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Actions act=new Actions(driver);
		
		WebElement button=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		
		act.contextClick(button).build().perform(); // Right click on the element
		
		driver.findElement(By.xpath("/html/body/ul/li[3]/span")).click(); //click the
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept(); //close the alert box
	}

}
