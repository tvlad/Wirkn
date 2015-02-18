package wirknTest;


import java.awt.AWTException;

import org.testng.annotations.Test;

import Pages.FB_SignUpPage;
import Pages.SignUpInitPage;
import Pages.SignUpSelectPositionPage;
import Pages.WalkThroughPage;

public class _03_SignUpFB extends Init{
	
	
	@Test(groups = "mainPage")
	public void _01_T_SignUpFB() throws InterruptedException, AWTException {
		
		WalkThroughPage walkThrough = new WalkThroughPage(driver);
		SignUpSelectPositionPage signUpSP = new SignUpSelectPositionPage(driver);
		SignUpInitPage signUpIP = new SignUpInitPage(driver);
		
		walkThrough.sign_up_button.click();
		Thread.sleep(500);
		signUpSP.btnJobHunting.click();
		signUpIP.signUpFB_Button.click();
		
		Thread.sleep(2000);
		
		driver.context("NATIVE_APP"); //window("WEBVIEW"); //driver.switchTo.context("WEBVIEW")
//		for(String winHandle : driver.getWindowHandles()){
//			driver.switchTo().window(winHandle);
//			}
		System.out.println("context = " + driver.getContext());		
		FB_SignUpPage fbSignUp = new FB_SignUpPage(driver);
		fbSignUp.loginButton.click();
		
		fbSignUp.emailLog.sendKeys("tvlad.test@gmail.com");
	}
}
