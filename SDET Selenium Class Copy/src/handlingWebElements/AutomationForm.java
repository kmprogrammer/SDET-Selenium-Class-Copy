package handlingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class AutomationForm {

	public static void main(String[] args) {
		
		/* We are discussing here web element
		 * text box/input box
		 * button
		 * link
		 * radio buttons
		 * check boxes
		 * drop and down/list box/ combo box
		 * drag and drop
		 */
		
		System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		//first name, last name, email id 
		driver.findElement(By.id("firstName")).sendKeys("Pawan");
		driver.findElement(By.id("lastName")).sendKeys("Kumar");
		driver.findElement(By.id("userEmail")).sendKeys("pawan@gmail.com");
		
		//drop down box
		WebElement st=driver.findElement(By.xpath("//*[@id=\"state\"]"));
		Select s=new Select(st);
		s.selectByIndex(1); //by index
//		s.selectByValue("css-1uccc91-singleValue"); //by value
//		s.selectByVisibleText("Uttar Pradesh"); //by visible text
		
		s.getOptions().size(); //number of item present in the drop down box
		System.out.println(s.getOptions().size());
		
		//radio button selection
		System.out.println(driver.findElement(By.xpath("//label[@for='gender-radio-1']")).isSelected()); //false
		driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
		
		//check box selection
		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).click();
		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']")).click();
		
		//bigger text box or text area
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("testing");
		
		//link
		driver.findElement(By.linkText("//img[@alt='Katalon Acedemy']")).click();
		
	}

}
