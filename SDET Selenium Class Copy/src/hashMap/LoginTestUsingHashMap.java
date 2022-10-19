package hashMap;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestUsingHashMap {
	
	static HashMap <String, String> logindata() {
		
		HashMap <String, String> hm = new HashMap <String, String>();
		hm.put("x", "mercury@mercury");
		hm.put("y", "mercury1@mercury1");
		hm.put("z", "mercury2@mercury2");
		
		return hm;
	
	
	
	}
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
//		//login x
//		String credentials = logindata().get("x");
//		
//		//login y
//		String credentials = logindata().get("y");
				
		//login z
		String credentials = logindata().get("z");
		 
		
		String arr[] = credentials.split("@"); // mercury mercury
		
		driver.findElement(By.name("userName")).sendKeys(arr[0]);
		driver.findElement(By.name("password")).sendKeys(arr[1]);
		
		driver.findElement(By.name("submit")).click();
		
		//validation
		if(driver.getTitle().equals("Login: Mercury Tours")) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test failed");
		}
		driver.findElement(By.linkText("Home")).click();
		
		Thread.sleep(1000);
		
		driver.close();
	}

}
