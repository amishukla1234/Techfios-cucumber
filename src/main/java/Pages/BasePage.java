package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {

	public static void waitForElement(WebElement element, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	
public static void equals(String reason, String actual, String expected) {
		
		if (!actual.equalsIgnoreCase(expected)) {
			throw new RuntimeException(reason);
		}
	}

	


	public static void contains(String reason, String expectedColor, String pageColor) {
		if (!expectedColor.contains(pageColor)) {
			throw new RuntimeException(reason);
		}
		
	}
	
	
}


