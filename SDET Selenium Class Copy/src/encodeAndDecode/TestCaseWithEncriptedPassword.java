package encodeAndDecode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.lowagie.text.pdf.codec.Base64;

public class TestCaseWithEncriptedPassword {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("fhgfj@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(decodeString("TGc0NkpSNUBKcFJ2VGQ="));
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
		
		
	}
	
	static String decodeString(String password) {
		byte[] decodedString = Base64.decode(password);
		return(new String(decodedString));
	}

}
