package class18;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinks {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Open URL of the app
		driver.get("http://automationpractice.com/index.php");
		
		//wait
		Thread.sleep(2000);
		
		//capture links from a webpage
		List<WebElement> links=(List<WebElement>) driver.findElement(By.linkText("a"));
		
		//Number of links
		System.out.println(links.size());
		
		for(int i=0; i<links.size();i++) {
			//by using href attribute we can get URL of required link
			
			WebElement element=links.get(i);
			String url=element.getAttribute("href");
			
			URL link=new URL(url);
			//create a connection using url object 'link'
			HttpURLConnection httpConn =(HttpURLConnection) link.openConnection();
			
			//wait time 2 seconds
			Thread.sleep(2000);
			
			//establish connection
			httpConn.connect();
			
			int rescode=httpConn.getResponseCode(); //return response code. if res code is above 400: broken link
			
			if(rescode>=400) {
				System.out.println(url +" - "+ " is broken link");
				
			}
			
			else {
				System.out.println(url +" - " +" is valid link");
			}
			
		}

	}
}	
