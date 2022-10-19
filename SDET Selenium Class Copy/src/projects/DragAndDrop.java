package projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DragAndDrop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");
		
	}

}
