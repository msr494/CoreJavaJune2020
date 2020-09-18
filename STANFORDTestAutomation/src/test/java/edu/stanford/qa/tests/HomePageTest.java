package edu.stanford.qa.tests;

import java.util.Properties;
import edu.stanford.qa.test.base.BasePage;
import edu.stanford.qa.test.pages.HomePage;
import edu.stanford.qa.test.util.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class HomePageTest {
	WebDriver driver;
	BasePage basePage;
	Properties prop;
	HomePage homePage;

	@BeforeTest
	public void setUp() {
		basePage = new BasePage();
		prop = basePage.init_properties();
		driver = basePage.init_driver(prop);
		homePage = PageFactory.initElements(driver, HomePage.class);
	}

	@Test()
	public void verifyHomePageAppLogo() {
		Assert.assertTrue(homePage.verifyApplicationLogo(), "Application logo is not present...");
	}

	@Test()
	public void verifyHomePageTitleTest() {
		String title = homePage.getHomePageTitle();
		System.out.println("home page title is: " + title);
		Assert.assertEquals(title, Constants.HOME_PAGE_TITLE, "Home Page Title doesn't match...");
	}


	@Test
	public void testSearchField() {
		homePage.checkSearchField();
	}


	@AfterTest
	public void quitBrowser() {
		driver.quit();
	}

}


