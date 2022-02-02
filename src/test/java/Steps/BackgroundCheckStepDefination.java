package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.BackGroundCheckPage;
import Pages.BackgroundPage;
import Pages.BasePage;
import Util.BrowserFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class BackgroundCheckStepDefination {
	WebDriver driver;
	BackGroundCheckPage backGroundCheckPage;
	BackgroundPage backgroundPage;

	@Before
	public void beforeRun() {
		driver = BrowserFactory.startBrowser();
		backGroundCheckPage = PageFactory.initElements(driver, BackGroundCheckPage.class);
		backgroundPage = PageFactory.initElements(driver, BackgroundPage.class);
	}

	@Given("^Set SkyBlue Background button exists$")
	public void set_SkyBlue_Background_button_exists() {
		
	}

	@When("^user click on the button$")
	public void user_click_on_the_button() throws InterruptedException {
		backGroundCheckPage.todo();
	}

	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() throws InterruptedException {
		String expectedColor = "background-color: skyblue;";
		BasePage.contains("Sky Blue color displayed!", expectedColor, backGroundCheckPage.getPageColor());
	}
	
	@Given("^Set White Background button exists$")
	public void set_White_Background_button_exists() throws InterruptedException {
		backGroundCheckPage.todo();
	}

	@Then("^the background color will change to white$")
	public void the_background_color_will_change_to_white() throws InterruptedException {
		String expectedColor = "background-color: white;";
		BasePage.contains("White color displayed!", expectedColor, backGroundCheckPage.getPageColor());
	}
	

	/*
	 * @After public void afterRun() { backGroundCheckPage.close(); }
	 */
}