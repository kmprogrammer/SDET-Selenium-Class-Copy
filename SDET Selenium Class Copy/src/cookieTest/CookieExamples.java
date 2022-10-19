package cookieTest;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CookieExamples {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		 
		Set <Cookie> cookies = driver.manage().getCookies(); //capture all the cookies from the browser
		System.out.println("Size of cookies:"+cookies.size()); //print size of cookies
		
		/*//read and print all the cookies
		for(Cookie cookie:cookies) {
			System.out.println(cookie.getName()+":"+cookie.getValue());
		}*/
		
		
		/*
		//read the cookie by its name
		System.out.println(driver.manage().getCookieNamed("session-id-time"));
		*/
		
		//Add new cookie to the variable
		Cookie cobj = new Cookie("mycookie123", "12345689");
		driver.manage().addCookie(cobj);
		cookies = driver.manage().getCookies();
		
		for(Cookie cookie:cookies) //read and print all the cookies
		{
			System.out.println(cookie.getName()+":"+cookie.getValue()); //prints name and value of cookies	
		}
		
		
		//delete the cookie
		driver.manage().deleteCookie(cobj);
		cookies = driver.manage().getCookies();
		System.out.println("Size of the cookies	:"+cookies.size());
		
		//delete all cookies
		driver.manage().deleteAllCookies();
		cookies = driver.manage().getCookies();
		System.out.println("Size of the cookies	:"+cookies.size());
		
		driver.close();
	}

}
