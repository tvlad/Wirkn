package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wirknTest.Init;

public class ProfilePage extends Init{
	
	private static WebDriver driver;
	
	public ProfilePage(WebDriver _driver){
		driver = _driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className = "android.widget.ImageButton")
	public WebElement menu_button;
	
	@FindBy(id = "com.wirkn.wirkn:id/ivAvatar")
	public WebElement userAvatar;
	
	@FindBy(id = "com.wirkn.wirkn:id/tvFullName")
	public WebElement userName;
	
	@FindBy(id = "com.wirkn.wirkn:id/tvRole")
	public WebElement userRole;
	
	@FindBy(id = "com.wirkn.wirkn:id/rtRecommendation")
	public WebElement rateStars;
	
	@FindBy(id = "com.wirkn.wirkn:id/rtRecommendation")
	public WebElement rateText;
	
	@FindBy(id = "com.wirkn.wirkn:id/ivPlay")
	public WebElement videoIcon;
	
	@FindBy(id = "com.wirkn.wirkn:id/progressBar")
	public WebElement videoIconProgressBar;
	
	@FindBy(id = "com.wirkn.wirkn:id/tvProfileDesc")
	public WebElement aboutBlock;
	
	@FindBy(id = "com.wirkn.wirkn:id/tvAvailability")
	public WebElement profileAvailability; 
	
	@FindBy(id = "com.wirkn.wirkn:id/tv_about_me")
	public WebElement profileAboutMe; 
	
	@FindBy(id = "com.wirkn.wirkn:id/tvEmployer")
	public WebElement profileEmployers; 
	
	@FindBy(id = "com.wirkn.wirkn:id/tvMore")
	public WebElement profileMore; 
	
//	------------------------------------------------
	
	@FindBy(id = "com.wirkn.wirkn:id/tv_sunday")
	public WebElement sun;
//	com.wirkn.wirkn:id/tvProfileDesc
	
	
	public void signOut() throws InterruptedException {
		UserMenuPage userMenu = new UserMenuPage(driver);
		SettingsPage settingsPage = new SettingsPage(driver);
		
		menu_button.click();
		Thread.sleep(500);

		userMenu.settingButton.click();
		settingsPage.signOutButton.click();
		settingsPage.okButton.click();
	}

}
