package src;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Home extends Base
{
	
	 public static AndroidDriver driver;
	 @Test
	public static void Home() throws Exception 
	{
		driver = capabilities();
		driver.findElement(By.id("com.trraincircle.android:id/largeLabel")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("com.trraincircle.android:id/item_label")).click();
	}

}
