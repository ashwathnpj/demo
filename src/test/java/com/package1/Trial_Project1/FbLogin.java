package com.package1.Trial_Project1;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FbLogin {
	@Test
	public void login_to_facebook() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		FbLoginPage fb = new FbLoginPage(driver);
		//FbLoginPage fb = new FbLoginPage();
		fb.un();
		fb.pw();
		fb.login();
		WebElement e1 = driver.findElement(By.xpath("//div[@class='pam uiBoxGray']"));
		//Assert.assertEquals(e1.isDisplayed(), true);
	}
}
