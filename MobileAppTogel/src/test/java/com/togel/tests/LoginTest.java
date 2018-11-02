package com.togel.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.togel.base.BaseTest;
import com.togel.pages.LoginPage;

public class LoginTest extends BaseTest {
	LoginPage login;
	@Test
	public void loginTest() throws InterruptedException {
		login = PageFactory.initElements(driver, LoginPage.class);
		login.loginPage();
	}
}
