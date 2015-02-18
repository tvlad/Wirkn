package wirknTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WirknTest {
	
	public AppiumDriver driver;

	
	
	@BeforeTest
	public void setUp() throws Exception {
		File appDir = new File("D://MyDoc//WirknTest");
		File app = new File(appDir, "wir.apk");

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android"); // 192.168.56.101:5555
		cap.setCapability("deviceName", "192.168.56.101:5555");
		cap.setCapability("platformVersion", "4.3");
		cap.setCapability("app-package", "com.wirkn.wirkn");
		cap.setCapability("app", app.getAbsolutePath());
		
		driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap) {
			
			public MobileElement scrollToExact(String arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public MobileElement scrollTo(String arg0) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	
	  @AfterTest
	  public void afterTest() {
		  driver.quit();
	  }
	  
	  @Test
	  public void f() throws InterruptedException {
		  // com.wirkn.wirkn:id/tv_title
		  Thread.sleep(3000);
		  WebElement signIn_title = driver.findElement(By.id("com.wirkn.wirkn:id/bt_sign_in"));
		  Assert.assertEquals("all bad", "SIGN IN", signIn_title.getText());
		  Thread.sleep(2000);
		  System.out.println("signIn_title = " + signIn_title.getText());
		  driver.swipe(500, 500, 100, 500, 200);
		  Thread.sleep(2000);
		  driver.swipe(500, 500, 100, 500, 200);
		  Thread.sleep(2000);
		  driver.swipe(500, 500, 100, 500, 200);
		  Thread.sleep(2000);
	  }
	  
}
