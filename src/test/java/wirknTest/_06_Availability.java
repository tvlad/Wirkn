package wirknTest;

import org.openqa.selenium.Point;
import org.testng.Assert;
import org.testng.annotations.Test;

import Helper.DataProv;
import Pages.AvailabilityPage;
import Pages.ProfilePage;
import Pages.SignInPage;
import Pages.WalkThroughPage;

public class _06_Availability extends Init{
	String Email = DataProv.prop("Email");
	String Password = DataProv.prop("Password");
	
	@Test(groups = "Availability")
	public void _01_T_Availability() throws InterruptedException {
		
		WalkThroughPage walkThrough = new WalkThroughPage(driver);
		SignInPage signIn = new SignInPage(driver);
		ProfilePage profile = new ProfilePage(driver);
		AvailabilityPage availability = new AvailabilityPage(driver);
		
		walkThrough.sign_in_button.click();

		Thread.sleep(500);
		signIn.signIn(Email, Password);
		Thread.sleep(500);
		Assert.assertTrue(profile.menu_button.isDisplayed());
		
//		System.out.println("asas - " + profile.sun.hashCode());
		
		profile.profileAvailability.click();
		Thread.sleep(3000);
		
		Assert.assertEquals(availability.avTitle.getText(), "Availability",
				"- Wrong view title -");
	}
	
	@Test(groups = "Availability")
	public void _02_T_AvailabilityClose() throws InterruptedException {
		
		ProfilePage profile = new ProfilePage(driver);
		AvailabilityPage availability = new AvailabilityPage(driver);
		
		availability.closeBtn.click();
		Assert.assertTrue(profile.menu_button.isDisplayed());
	}
	
	@Test(groups = "Availability")
	public void _03_T_AvailabilityAdd_01() throws InterruptedException {

		ProfilePage profile = new ProfilePage(driver);
		AvailabilityPage availability = new AvailabilityPage(driver);

		profile.profileAvailability.click();
		availability.avSet.click();
		availability.closeSet.click();
		Thread.sleep(1000);

	}

	@Test(groups = "Availability")
	public void _04_T_AvailabilityAdd_02() throws InterruptedException {
		AvailabilityPage availability = new AvailabilityPage(driver);
		
		for (int i = 0; i < 7; i++) {
			availability.dayOfWeek().get(i).click();
			Thread.sleep(500);
			availability.doneSet.click();
		}
		System.out.println("loc - " + availability.dayOfWeek().get(0).getLocation());
		Thread.sleep(1000);
	}
	
	@Test(groups = "Availability")
	public void _05_T_AvailabilityDelete() throws InterruptedException {
		AvailabilityPage availability = new AvailabilityPage(driver);
		
		for (int i = 0; i < 7; i++) {
			Point sd = availability.dayOfWeek().get(i).getLocation();
			Thread.sleep(500);
			driver.swipe(500, sd.y, 100, sd.y, 350);
			Thread.sleep(500);
			availability.deleteBtn().get(i).click();
			Thread.sleep(1000);
		}
		Thread.sleep(1000);
	}
	
	@Test(groups = "Availability")
	public void _06_T_AvailabilityAdd_03() throws InterruptedException {
		AvailabilityPage availability = new AvailabilityPage(driver);
		
		for (int i = 0; i < 7; i++) {
			availability.avSet.click();
			Thread.sleep(500);
			availability.dayDropDown.click();
			availability.dayOfWeekDropDown().get(i).click();
			
			availability.fromTime.click();
			availability.timePickerDoneBtn.click();
			
			availability.toTime.click();
			availability.timePickerDoneBtn.click();
			
			availability.doneSet.click();
						
			Thread.sleep(1000);
		}
		
		for (int i = 0; i < 7; i++) {
			Point sd = availability.dayOfWeek().get(i).getLocation();
			Thread.sleep(500);
			driver.swipe(500, sd.y, 100, sd.y, 350);
			Thread.sleep(500);
			availability.deleteBtn().get(i).click();
			Thread.sleep(1000);
		}
		Thread.sleep(1000);
		
	}

}
