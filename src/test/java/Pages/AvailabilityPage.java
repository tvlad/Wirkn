package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AvailabilityPage {

	private static WebDriver driver;

	public AvailabilityPage(WebDriver _driver) {
		driver = _driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "android.widget.ImageButton")
	public WebElement closeBtn;

	@FindBy(xpath = "//android.widget.TextView[@index ='1']")
	public WebElement avTitle;

	@FindBy(id = "com.wirkn.wirkn:id/set_availability")
	public WebElement avSet;
	



//	--------------------------------------------------------
	
	@FindBy(id = "com.wirkn.wirkn:id/close_setting_availability")
	public WebElement closeSet;
	
	@FindBy(id = "com.wirkn.wirkn:id/ll_act_bar_enter_avl")
	public WebElement doneSet;
	
	@FindBy(id = "com.wirkn.wirkn:id/spinner_item_tv")
	public WebElement dayDropDown;
	
	@FindBy(id = "com.wirkn.wirkn:id/from_time")
	public WebElement fromTime;
	
	@FindBy(id = "com.wirkn.wirkn:id/to_time")
	public WebElement toTime;
	
	@FindBy(id = "com.wirkn.wirkn:id/done_button")
	public WebElement timePickerDoneBtn;
	
//	com.wirkn.wirkn:id/tv_sunday
	
	public  List<WebElement> dayOfWeek() { 
	return driver.findElements(By.id("com.wirkn.wirkn:id/week_day_tv"));  
}
	public  List<WebElement> deleteBtn() { 
	return driver.findElements(By.id("com.wirkn.wirkn:id/availability_delete_button"));  
}
	
	public  List<WebElement> dayOfWeekDropDown() { 
		return driver.findElements(By.id("com.wirkn.wirkn:id/spinner_dropdown_item_tv"));  
	}
}
