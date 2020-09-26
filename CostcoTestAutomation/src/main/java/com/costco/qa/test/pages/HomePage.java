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

	By logo = By.xpath("//img[@class='bc-logo logo-us']//parent::a//parent::div[@class='table-cell logo hidden-xs hidden-sm hidden-md hidden-lg']");

	@FindBy(xpath = "//input[@id='search-field']")
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
