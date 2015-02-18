package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpSelectPositionPage {
		
	private static WebDriver driver;
	
	public SignUpSelectPositionPage(WebDriver _driver){
		driver = _driver;
		PageFactory.initElements(driver, this);
	}
	
		
	@FindBy(className = "android.widget.ImageButton")
	public WebElement backButton;
	
//	com.wirkn.wirkn:id/btnManager
	
	@FindBy(id = "com.wirkn.wirkn:id/tv_employ_status")
	public WebElement titleText;
	
	@FindBy(id = "com.wirkn.wirkn:id/tv_description")
	public WebElement descriptionText;
	
	@FindBy(id = "com.wirkn.wirkn:id/btnJobHunting")
	public WebElement btnJobHunting;
	
	@FindBy(id = "com.wirkn.wirkn:id/btnHaveJob")
	public WebElement btnHaveJob;
	
	@FindBy(id = "com.wirkn.wirkn:id/btnManager")
	public WebElement btnManager;

}
