package projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormFilling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Pawan");
		driver.findElement(By.id("LastName")).sendKeys("Kumar");
		
		WebElement date=driver.findElement(By.name("DateOfBirthDay"));
		Select d=new Select(date);
		d.selectByVisibleText("16");
		
		WebElement month=driver.findElement(By.name("DateOfBirthMonth"));
		Select m=new Select(month);
		m.selectByVisibleText("August");
		
		WebElement year=driver.findElement(By.name("DateOfBirthYear"));
		Select y=new Select(year);
		y.selectByValue("1994");
		
		driver.findElement(By.id("Email")).sendKeys("mynameis1@gmail.com");
		driver.findElement(By.id("Company")).sendKeys("Google");
		driver.findElement(By.id("Password")).sendKeys("mypasswordisxyz");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("mypasswordisxyz");
		
		driver.findElement(By.id("register-button")).click();
		
		if(driver.getTitle().contains("Register")==true) {
			System.out.println("Test is Passed");
			
		}
		driver.close();
		

	}

}
