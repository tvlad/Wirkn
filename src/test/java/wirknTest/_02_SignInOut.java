package wirknTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import Helper.DataProv;
import Pages.ProfilePage;
import Pages.SignInPage;
import Pages.WalkThroughPage;

public class _02_SignInOut extends Init {

	public static String Email = DataProv.prop("Email");;
	public static String Password;

	@Test(groups = "SignIn")
	public void _01_T_ForgotPass() throws InterruptedException {

		WalkThroughPage walkThrough = new WalkThroughPage(driver);
		SignInPage signIn = new SignInPage(driver);

		Thread.sleep(500);

		walkThrough.sign_in_button.click();

		Thread.sleep(500);
		signIn.forgotPasswordButton.click();
		Assert.assertEquals(signIn.resetPassTitle.getText(), "Reset Password",
				"-Wrong title for Reset Password-");

		signIn.cancelButton.click();

		Assert.assertEquals(signIn.signInTitle.getText(), "Sign In",
				"- Wrong title for Sign In -");
		Thread.sleep(500);

	}

	@Test(groups = "SignIn")
	public void _02_T_ForgotPassWrongEmail() throws InterruptedException {

		SignInPage signIn = new SignInPage(driver);
		signIn.forgotPasswordButton.click();
		signIn.emailField.sendKeys("asdsd@sdds.ghg");
		signIn.resetButton.click();
		Assert.assertEquals(signIn.emailError.getText(),
				"Email not recognized.", "- wrong email error -");

		Thread.sleep(1000);

		signIn.cancelButton.click();

		Assert.assertEquals(signIn.signInTitle.getText(), "Sign In",
				"- Wrong title for Sign In -");

	}

	@Test(groups = "SignIn")
	public void _03_T_ForgotPassTrueEmail() throws InterruptedException {

		SignInPage signIn = new SignInPage(driver);
		signIn.forgotPasswordButton.click();
		signIn.emailField.sendKeys(Email);
		signIn.resetButton.click();
		Thread.sleep(500);
		Assert.assertEquals(signIn.signInTitle.getText(), "Password sent",
				"- wrong title -");

		Thread.sleep(500);

		signIn.btnOkay.click();

		Assert.assertEquals(signIn.signInTitle.getText(), "Sign In",
				"- Wrong title for Sign In -");

	}

	@Test(groups = "SignIn")
	public void _04_T_SignInErrTitle() throws InterruptedException {

		SignInPage signIn = new SignInPage(driver);

		Thread.sleep(2000);

		signIn.signIn("asd@asd.we", "qwertygg");
		Thread.sleep(500);

		Assert.assertEquals(signIn.signInErrTitle.getText(), "Sign In Error",
				"Wrong error message title");
		Assert.assertEquals(
				signIn.signInErrText.getText(),
				"There’s an error signing in. Please check your username and password and try again.",
				"Wrong error message text");
		signIn.signInErrButton.click();
		Thread.sleep(1000);

	}

	@Test(groups = "SignIn")
	public void _05_T_SignIn() throws InterruptedException {

		SignInPage signIn = new SignInPage(driver);
		ProfilePage profile = new ProfilePage(driver);
		Email = DataProv.prop("Email");
		Password = DataProv.prop("Password");

		Thread.sleep(500);

		signIn.signIn(Email, Password);

		Thread.sleep(500);

		Assert.assertTrue(profile.menu_button.isDisplayed());
		System.out.println("user name = " + profile.userName.getText());

	}

	@Test
	public void _06_T_SignOut() throws InterruptedException {
		
		WalkThroughPage walkThrough = new WalkThroughPage(driver);
		ProfilePage profile = new ProfilePage(driver);
		
		profile.signOut();

		Assert.assertEquals(
				"Leave your Resume at Home\nand Build a Dynamic Profile.",
				walkThrough.title_01.getText());

	}

}
