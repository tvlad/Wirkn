package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingsPage {
	
	private static WebDriver driver;
	
	public SettingsPage(WebDriver _driver){
		driver = _driver;
		PageFactory.initElements(driver, this);
	}
	
		
	@FindBy(id = "android.widget.ImageButton")
	public WebElement closeIcon;
	
	@FindBy(id = "com.wirkn.wirkn:id/btn_sign_out")
	public WebElement signOutButton;
	
	@FindBy(id = "com.wirkn.wirkn:id/tvTitle")
	public WebElement titleOfWarning;
	
	@FindBy(id = "com.wirkn.wirkn:id/tvDescription")
	public WebElement textOfWarning;
	
	@FindBy(id = "com.wirkn.wirkn:id/btnCancel")
	public WebElement cancelButton;
	
	@FindBy(id = "com.wirkn.wirkn:id/btnOk")
	public WebElement okButton;
	

	
	
	public static List<WebElement> textInSettings() { 
	return driver.findElements(By.className("android.widget.TextView"));  
	}
	
	public static List<WebElement> switchersInSettings() { 
		return driver.findElements(By.id("com.wirkn.wirkn:id/sw_app_alerts"));  
		}
	
}


