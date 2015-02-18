package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpLoadDataPage {
	private static WebDriver driver;
	
	public SignUpLoadDataPage(WebDriver _driver){
		driver = _driver;
		PageFactory.initElements(driver, this);
	}
	
		
	@FindBy(id = "android.widget.ImageButton")
	public WebElement closeIcon;
	
	@FindBy(id = "com.wirkn.wirkn:id/etFirstName")
	public WebElement firstNameField;
	
	@FindBy(id = "com.wirkn.wirkn:id/etLastName")
	public WebElement lastNameField;
	
	@FindBy(id = "com.wirkn.wirkn:id/etUserEmail")
	public WebElement userEmailField;
	
	@FindBy(id = "com.wirkn.wirkn:id/etPassword")
	public WebElement passwordField;
	
	@FindBy(id = "com.wirkn.wirkn:id/swNotificationsReceive")
	public WebElement swNotificationsReceive;
	
	@FindBy(className = "android.widget.ImageButton")
	public WebElement backButton;
	
	@FindBy(id = "com.wirkn.wirkn:id/tvTitle")
	public WebElement errorTitle;
	
	@FindBy(id = "com.wirkn.wirkn:id/tvDescription")
	public WebElement errorText;
	
	@FindBy(id = "com.wirkn.wirkn:id/btnOk")
	public WebElement errorMessageCloseButton;
	
	@FindBy(id = "com.wirkn.wirkn:id/confirm")
	public WebElement submitButton;

//	---------------------------------------------------
	
	@FindBy(id = "com.wirkn.wirkn:id/tvFullName")
	public WebElement uploadPhotoText;
	
	@FindBy(xpath = "//text[contains(@value,'gallery')]")
	public WebElement fromGallery;
	
	@FindBy(id = "android:id/button1")
	public WebElement okFromGalleryButton;
	
//	android:id/button1
	
	public List<WebElement> texts() { 
		return driver.findElements(By.className("android.widget.TextView"));  
		}

}
