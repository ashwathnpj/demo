package com.package1.Trial_Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPage {
	// step 1 : locating each elements using @FindBy
	WebDriver driver;

	@FindBy(id = "email")
	WebElement username;

	@FindBy(id = "pass")
	WebElement password;

	@FindBy(name = "login")
	WebElement login_button;

	// step 2 : creating separate methods for each components
	public void un() {
		username.sendKeys("demo123@gmail.com");
	}

	public void pw() {
		password.sendKeys("1234@demo");
	}

	public void login() {
		login_button.click();
	}

	// step 3 : initializing the elements
	public FbLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
