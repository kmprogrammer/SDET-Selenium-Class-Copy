package scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingOfThePage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.countries-ofthe-world.com/");
		
		driver.manage().window().maximize(); //maximize browser window
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		//1. scrolling by using pixel
//		js.executeScript("window.scrollBy(0,1000)","");
		
//		//2. scrolling page till we find the element
//		WebElement flag = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/ul[3]/li[1]/a"));
//		js.executeScript("arguments[0].scrollIntoView()", flag);
		
		//3. scroll page till bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

}
