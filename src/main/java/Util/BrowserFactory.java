package Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

	static WebDriver driver;

	public static  WebDriver startBrowser() {
		// Setting properties for ChromeDriver
		System.setProperty("webdriver.chrome.driver", " \"Driver\\\\chromedriver.exe");
		
		// Create ChromeDriver object, launch Chrome browser
		 WebDriver driver = new ChromeDriver();
		 
		// Create ChromeDriver object, launch Chrome browser
		driver.get(" http://techfios.com/test/101/");
		return driver;
	}
	
}
