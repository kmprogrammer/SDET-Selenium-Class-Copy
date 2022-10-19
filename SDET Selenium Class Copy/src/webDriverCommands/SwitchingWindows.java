package webDriverCommands;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchingWindows {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
		
		//System.out.println(driver.getTitle());
		
		Set <String> s=driver.getWindowHandles();
		
		for(String i:s) {
			System.out.println(i);
			String t=driver.switchTo().window(i).getTitle(); //Switch from one window to another window
			System.out.println(t);
			
			
			if(t.contains("Frames & windows")) { //close command for parent window
				driver.close();
			}
			if(t.contains("Selenium")) { //close command for child window
				driver.close();
			}
		}
		
	}

}
