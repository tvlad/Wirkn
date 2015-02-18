package wirknTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeTest;

import Helper.DataProv;


public class Init {

	public AppiumDriver driver;
	private String URL = DataProv.prop("URL");
	private String APK = DataProv.prop("APK");
	
	@BeforeClass
	public void setUp() throws Exception {
//		File appDir = new File("D://MyDoc//WirknTest");
//		File app = new File(appDir, "wir.apk");
		
//		File appDir = new File("../WirknTest");
//		File app = new File(appDir, "app-debug.apk");
		
		File appDir = new File(URL);
		File app = new File(appDir, APK);

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android"); // 192.168.56.101:5555
		cap.setCapability("deviceName", "selendroid");
		cap.setCapability("device", "selendroid");
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
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

	@AfterClass
	public void afterTest() {
		driver.quit();
	}

}
