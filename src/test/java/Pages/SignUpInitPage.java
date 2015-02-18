package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpInitPage {
	
	private static WebDriver driver;
	
	public SignUpInitPage(WebDriver _driver){
		driver = _driver;
		PageFactory.initElements(driver, this);
	}
	
//	com.wirkn.wirkn:id/fb_button	
	@FindBy(className = "android.widget.ImageButton")
	public WebElement backIcon;
	
	@FindBy(id = "com.wirkn.wirkn:id/tvSignIn")
	public WebElement signUpLinkedText;
	
	@FindBy(id = "com.wirkn.wirkn:id/fb_button")
	public WebElement signUpFB_Button;

}
