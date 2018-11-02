package com.togel.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseTest {

	//AndroidDriver driver;
	//AppiumDriver<MobileElement> driver = null;
	public static WebDriver driver = null;
	public static Properties prop;
	private String propPath = "C:\\Users\\HP\\eclipse-workspace\\MobileAppTogel\\src\\main\\java\\com\\togel\\config\\config.properties";
	
	@BeforeTest
	public void baseTest() throws IOException, InterruptedException {
		//Set the Desired Capabilities
				DesiredCapabilities caps = new DesiredCapabilities();
				caps.setCapability("deviceName", "My Phone");
				caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
				caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0.1");
				caps.setCapability(MobileCapabilityType.UDID, "1ada9770");
				caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");				
				
				FileInputStream file = new FileInputStream(propPath);
				prop = new Properties();
				prop.load(file);
				
				//Instantiate Appium Driver
				URL url = new URL("http://0.0.0.0:4723/wd/hub");
				driver = new AndroidDriver(url, caps);
				driver.get(prop.getProperty("url"));
				System.out.println("URL open in Android Browser");
				
	}
	
	@AfterTest
	public void EndTest() {
		System.out.println("----------  In EndTest method.----------");
//		
//		extent.endTest(logger);
//		extent.flush();
//		driver.get(reportLocation);
		
		//driver.quit();
		
	}
	
}
