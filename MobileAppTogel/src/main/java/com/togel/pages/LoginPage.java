package com.togel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.togel.base.BaseTest;

public class LoginPage extends BaseTest {

	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH, using="//input[@id='username']")@CacheLookup	WebElement username;
	@FindBy(how=How.XPATH, using="//input[@id='password']")@CacheLookup	WebElement password;
	@FindBy(how=How.XPATH, using="//*[@type='submit']")@CacheLookup	WebElement loginButton;
	@FindBy(how=How.XPATH, using="//*[@type='submit']")@CacheLookup	WebElement agreeButton;
	
	public void loginPage() throws InterruptedException {
		
		username.sendKeys(prop.getProperty("Username"));
		password.sendKeys(prop.getProperty("Password"));
		Thread.sleep(10000);
		loginButton.click();
		Thread.sleep(5000);
		agreeButton.click();
	}
}
