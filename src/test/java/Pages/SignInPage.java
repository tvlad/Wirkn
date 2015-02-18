package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wirknTest.Init;

public class SignInPage extends Init{
	
	private static WebDriver driver;
	
	public SignInPage(WebDriver _driver){
		driver = _driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "android.widget.ImageButton")
	public WebElement back_button;
	
	@FindBy(className = "android.widget.TextView")
	public WebElement signInTitle;
	
	@FindBy(id = "com.wirkn.wirkn:id/tvForgotPass")
	public WebElement forgotPasswordButton;
	
	@FindBy(id = "com.wirkn.wirkn:id/etEmail")
	public WebElement emailField;
	
	@FindBy(id = "com.wirkn.wirkn:id/etPass")
	public WebElement passwordField;
	
	@FindBy(id = "com.wirkn.wirkn:id/confirm")
	public WebElement submitButton;
	
	@FindBy(id = "com.wirkn.wirkn:id/tvTitle")
	public WebElement signInErrTitle;
	
	@FindBy(id = "com.wirkn.wirkn:id/btnOk")
	public WebElement signInErrButton;
	
	@FindBy(id = "com.wirkn.wirkn:id/tvDescription")
	public WebElement signInErrText;
	
	@FindBy(id = "com.wirkn.wirkn:id/tv_res_pass")
	public WebElement resetPassTitle;
	
	@FindBy(id = "com.wirkn.wirkn:id/btnReset")
	public WebElement resetButton;
	
	@FindBy(id = "com.wirkn.wirkn:id/btnCancel")
	public WebElement cancelButton;
	
	@FindBy(id = "com.wirkn.wirkn:id/tvError")
	public WebElement emailError;
	
	@FindBy(id = "com.wirkn.wirkn:id/btnOkay")
	public WebElement btnOkay;
	
	@FindBy(id = "android:id/message")
	public WebElement progressBarText;
	
	@FindBy(id = "android:id/progress")
	public WebElement progressBar;
	
	//android:id/progress
	
//	public static List<WebElement> emailFieldes() { 
//		return driver.findElements(By.id("com.wirkn.wirkn:id/etEmail"));  
//	}
	
	public void signIn(String email, String password) throws InterruptedException{
		emailField.sendKeys(email);
		Thread.sleep(500);
		passwordField.sendKeys(password);
		submitButton.click();
	}

}
