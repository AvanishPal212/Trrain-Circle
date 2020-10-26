package src;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class TrrainCircleLogin extends Base
{
	 public static AndroidDriver driver;
	 @Test(priority = 1)
	public static void Login() throws Exception 
	{
		
		driver = capabilities();
		driver.findElement(By.id("com.trraincircle.android:id/languageLayout")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.className("android.widget.Button"));
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.id("com.trraincircle.android:id/btn_continue")).click();
		for(int i=0;i<6;i++)
		{
	     	driver.findElement(By.id("com.trraincircle.android:id/btn_next")).click();;
		}
		driver.findElement(By.id("com.trraincircle.android:id/btn_login_now1")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.id("com.trraincircle.android:id/et_mobile")).sendKeys("8861344163");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		TrrainCircleLogin.scrollAndClick("SIGN IN");
		driver.findElement(By.id("com.trraincircle.android:id/et_password")).sendKeys("test123");
		driver.findElement(By.id("com.trraincircle.android:id/btn_log_in")).click();
		
		
		System.out.println("The test sucessfull");
	}
	 @Test(priority = 2)
	public static void scrollAndClick(String visibleText) 
	{
	     driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))").click();
	        }
	    }

