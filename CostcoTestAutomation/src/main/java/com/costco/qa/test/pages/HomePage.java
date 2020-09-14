package com.costco.qa.test.pages;

import com.costco.qa.test.base.BasePage;
import com.costco.qa.test.util.ElementUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	WebDriver driver;
	ElementUtil elementUtil;

	By logo = By.xpath("(//img[@class='logo__staplesLogoimg' and @alt='Staples Homepage'])[1]");

	@FindBy(xpath = "//input[@id='searchInput']")
	public static WebElement searchField;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
		elementUtil.waitForElementPresent(logo); // better to use something which is present in home page

	}

	public String getHomePageTitle() {
		return elementUtil.doGetTitle();
	}

	public boolean verifyApplicationLogo() {
		return elementUtil.doIsDisplayed(logo);
	}

	public void checkSearchField() {
		searchField.click();
	}

}
