package webDriverCommands;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSortingCheck {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/dropdown");
		
		driver.manage().window().maximize();
		
		WebElement element=driver.findElement(By.id("dropdown"));
		Select se=new Select(element);
		
		List originalList=new ArrayList();
		List tempList=new ArrayList();
		
		List <WebElement>options=se.getOptions();
		
		for(WebElement e:options) {
			originalList.add(e.getText());
			tempList.add(e.getText());
		}
		System.out.println(originalList);
		
		
		//tempList=originalList;
		
		//System.out.println(tempList);
		
		Collections.sort(tempList);
		
		System.out.println("After sorting temp list:"+tempList);
		
		if(originalList == tempList) {
			System.out.println("Dropdown sorted");
		}
		else {
			System.out.println("Dropdown Not sorted");
		}
		
		se.selectByIndex(2);
		
	}

}
