package wirknTest;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Helper.DataProv;
import Helper.Help;
import Pages.ProfilePage;
import Pages.SignUpInitPage;
import Pages.SignUpLoadDataPage;
import Pages.SignUpSelectPositionPage;
import Pages.WalkThroughPage;

public class _05_SignUpEmPass extends Init{
	
	@Test(groups = "mainPage")
	public void _01_T_SignUpTitle() throws InterruptedException, AWTException {
		
		WalkThroughPage walkThrough = new WalkThroughPage(driver);
		SignUpSelectPositionPage signUpSP = new SignUpSelectPositionPage(driver);
		SignUpInitPage signUpIP = new SignUpInitPage(driver);
		SignUpLoadDataPage signUpLoadData = new SignUpLoadDataPage(driver);
		
		
		walkThrough.sign_up_button.click();
		Thread.sleep(500);
		signUpSP.btnJobHunting.click();
		signUpIP.signUpLinkedText.click();
		
		Thread.sleep(1000);
		
		Assert.assertEquals(signUpLoadData.texts().get(9).getText(), "Personal Information");	

	}
	
	@Test(groups = "mainPage")
	public void _022_T_SignUpChangephoto() throws InterruptedException, AWTException {
		
		SignUpLoadDataPage signUpLoadData = new SignUpLoadDataPage(driver);
		signUpLoadData.uploadPhotoText.click();
		
		Thread.sleep(1000);
		System.out.println("context1 = " + driver.getContext());
		signUpLoadData.fromGallery.click();
		signUpLoadData.okFromGalleryButton.click();
		Thread.sleep(1000);
		System.out.println("context2 = " + driver.getContext());

	}
	
//	@Test(groups = "mainPage")
	public void _02_T_SignUpJobSeekingFalse() throws InterruptedException, AWTException {
		
		SignUpLoadDataPage signUpLoadData = new SignUpLoadDataPage(driver);
		
		String Email = DataProv.prop("Email");
				
		signUpLoadData.firstNameField.sendKeys("Sad");
		signUpLoadData.lastNameField.sendKeys("Fer");
		signUpLoadData.userEmailField.sendKeys(Email);
		signUpLoadData.passwordField.sendKeys("qwerty");
		// Thread.sleep(1000);
		signUpLoadData.submitButton.click();
		System.out.println("error massage = " + signUpLoadData.errorText.isDisplayed());
		Assert.assertEquals(signUpLoadData.errorText.getText(),
				"There has been an error in your sign up process.");
		signUpLoadData.errorMessageCloseButton.click();

	}
	
//	@Test(groups = "mainPage")
	public void _03_T_SignUpJobSeekingTrue() throws InterruptedException, AWTException {
		
		SignUpLoadDataPage signUpLoadData = new SignUpLoadDataPage(driver);
		
		signUpLoadData.firstNameField.sendKeys(Help.randomLogin(3, 3));
		signUpLoadData.lastNameField.sendKeys(Help.randomLogin(3, 3));
		signUpLoadData.userEmailField.sendKeys(Help.randomEmail(5, 8));
		signUpLoadData.passwordField.sendKeys("qwerty");
		
		Thread.sleep(1000);
		
		signUpLoadData.submitButton.click();
		
	}
	
	
//	@Test(groups = "mainPage")
	public void _04_T_SignUpRole() throws InterruptedException, AWTException {
		
		ProfilePage profile = new ProfilePage(driver);
		Assert.assertEquals(profile.userRole.getText(),
				"Employee | Job Seeking");
		
	}
	

}
