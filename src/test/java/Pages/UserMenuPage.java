package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserMenuPage {

	private static WebDriver driver;
	
	public UserMenuPage(WebDriver _driver){
		driver = _driver;
		PageFactory.initElements(driver, this);
	}
	
		
	@FindBy(id = "com.wirkn.wirkn:id/ivSetting")
	public WebElement settingButton;
	
	@FindBy(id = "com.wirkn.wirkn:id/iv_avatar")
	public WebElement userAvatar;
	
	@FindBy(id = "com.wirkn.wirkn:id/iv_avatar")
	public WebElement userName;
	
	@FindBy(id = "com.wirkn.wirkn:id/tv_email")
	public WebElement userMail;
	
	@FindBy(linkText = "Dashboard")
	public WebElement menuDashboard;
	
	@FindBy(linkText = "Find Jobs")
	public WebElement menuFindJobs;
	
	
	public static List<WebElement> menuItems() { 
	return driver.findElements(By.id("com.wirkn.wirkn:id/tv_menu_name"));  
}
	
//	com.wirkn.wirkn:id/tv_menu_name
}
