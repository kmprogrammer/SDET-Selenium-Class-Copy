package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
//		//login
//		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
//		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Actions act=new Actions(driver);
		WebElement interaction=driver.findElement(By.xpath("//a[normalize-space()='Interactions']"));
		WebElement dragAndDrop=driver.findElement(By.xpath("//a[normalize-space()='Drag and Drop']"));
		WebElement Static=driver.findElement(By.xpath("//a[normalize-space()='Static']"));
		
		act.moveToElement(interaction).build().perform(); //mouse over to interaction tab
		act.moveToElement(dragAndDrop).build().perform(); //mouse over to drag and drop tab
		act.moveToElement(Static).click().build().perform(); //mouse over to static and click
		
		// We can write above three line in one line below;
//		act.moveToElement(interaction).moveToElement(dragAndDrop).moveToElement(Static).click().build().perform();
		
	}

}
