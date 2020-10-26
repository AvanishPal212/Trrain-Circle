package src;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base

{
	@org.testng.annotations.Test
	public static AndroidDriver capabilities() throws Exception
	{
		System.setProperty("webdriver.http.factory", "apache");
		AndroidDriver driver;
		
		File appDir = new File("src");
		File app = new File(appDir,"app-debug (2).apk");
		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setCapability("deviceName", "Android SDK built for X86");
		capability.setCapability("platformVersion", "8.1.0");
		capability.setCapability("platformName", "Android");
		capability.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 14);
		
		capability.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capability);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
		
		
		
		
		
		
	}

}
