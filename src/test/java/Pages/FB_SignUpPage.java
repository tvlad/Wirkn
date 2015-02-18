package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FB_SignUpPage{
	
private static WebDriver driver;
	
	public FB_SignUpPage(WebDriver _driver){
		driver = _driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "email")
	public WebElement emailLog;

	@FindBy(name = "pass")
	public WebElement passLog;
	
//	loginbutton
	
	@FindBy(name = "login")
	public WebElement loginButton;

}
