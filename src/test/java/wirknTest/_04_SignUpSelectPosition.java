package wirknTest;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.SignUpSelectPositionPage;
import Pages.WalkThroughPage;

public class _04_SignUpSelectPosition extends Init{
	
	@Test(groups = "mainPage")
	public void _01_T_SelectPositionTitle() throws InterruptedException,
			AWTException {

		WalkThroughPage walkThrough = new WalkThroughPage(driver);
		SignUpSelectPositionPage signUpSP = new SignUpSelectPositionPage(driver);

		walkThrough.sign_up_button.click();
		Assert.assertEquals(signUpSP.titleText.getText(),
				"Your Employment Status");
	}
	
	@Test(groups = "mainPage")
	public void _02_T_SelectPositionDescription() throws InterruptedException,
			AWTException {

		SignUpSelectPositionPage signUpSP = new SignUpSelectPositionPage(driver);

		String s = new String(new char[] { 160, 160, 160 });
		Assert.assertEquals(
				signUpSP.descriptionText.getText(),
				"Select a status to begin your Wirkn journey.\nAre you currently working, on the hunt for a\n "
						+ s + "job or are you employed as a manager?");
	}
	
	@Test(groups = "mainPage")
	public void _03_T_SelectPositionFstButton() throws InterruptedException,
			AWTException {

		SignUpSelectPositionPage signUpSP = new SignUpSelectPositionPage(driver);

		Assert.assertEquals(signUpSP.btnJobHunting.getText(),
				"I'M JOB HUNTING");
	}
	
	@Test(groups = "mainPage")
	public void _04_T_SelectPositionSecondButton() throws InterruptedException,
			AWTException {

		SignUpSelectPositionPage signUpSP = new SignUpSelectPositionPage(driver);

		Assert.assertEquals(signUpSP.btnHaveJob.getText(),
				"I HAVE A JOB");
	}
	
	@Test(groups = "mainPage")
	public void _05_T_SelectPositionThirdButton() throws InterruptedException,
			AWTException {

		SignUpSelectPositionPage signUpSP = new SignUpSelectPositionPage(driver);

		Assert.assertEquals(signUpSP.btnManager.getText(),
				"I'M A MANAGER");
	}
		
	@Test(groups = "mainPage")
	public void _06_T_SelectPositionBackButton() throws InterruptedException,
			AWTException {

		SignUpSelectPositionPage signUpSP = new SignUpSelectPositionPage(driver);
		WalkThroughPage walkThrough = new WalkThroughPage(driver);

		signUpSP.backButton.click();
		 
		Assert.assertEquals(
				"Leave your Resume at Home\nand Build a Dynamic Profile.",
				walkThrough.title_01.getText());
	}
	
	


}
