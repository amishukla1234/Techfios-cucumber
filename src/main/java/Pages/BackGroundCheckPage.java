package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class BackGroundCheckPage {

	WebDriver driver;

	
	public BackGroundCheckPage(WebDriver driver) {
		this.driver = driver;
	}

	// Elements Library
	@FindBy(how = How.XPATH, using = "//button[@type='button' and contains (text(),'Set SkyBlue Background')] ")
	WebElement SkybluebackgroundButton;
	@FindBy(how = How.XPATH, using = "//button[@type='button' and contains (text(),'Set White Background')] ")
	WebElement WhitebackgroundButton;

	
	public void todo() throws InterruptedException {
		SkybluebackgroundButton.click();
//		Thread.sleep(5000);
		WhitebackgroundButton.click();
	}

	public String getPageColor() {
		return driver.getTitle();
	}

	public void close() {
		driver.close();
	}
}