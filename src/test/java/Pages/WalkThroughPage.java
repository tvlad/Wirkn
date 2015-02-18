package Pages;


//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wirknTest.Init;

public class WalkThroughPage extends Init {
	
//	By sign_in = By.id("com.wirkn.wirkn:id/bt_sign_in");
//	By sign_up = By.id("com.wirkn.wirkn:id/bt_sign_up");
	
//  com.wirkn.wirkn:id/bt_sign_in
//	com.wirkn.wirkn:id/iv_phone
//	com.wirkn.wirkn:id/tv_title - Leave your Resume at Home and Build a Dynamic Profile.
//	com.wirkn.wirkn:id/indicator
	private static WebDriver driver;
	
	public WalkThroughPage(WebDriver _driver){
		driver = _driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "com.wirkn.wirkn:id/bt_sign_in")
	public WebElement sign_in_button;
	
	@FindBy(id = "com.wirkn.wirkn:id/bt_sign_up")
	public WebElement sign_up_button;
	
	@FindBy(id = "com.wirkn.wirkn:id/tv_title")
	public WebElement title_01;
	
//	android.widget.TextView
	
	@FindBy(className = "android.widget.TextView")
	public WebElement title_end;
}
