package wirknTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import Helper.DataProv;
import Pages.SignInPage;
import Pages.WalkThroughPage;

public class _07_SignInDataCheck extends Init{
	
	private String Email;
	private String Password;
	
	@Test(groups = "SignInDataCheck")
	
	public void _01_T_SignInDataCheck_01() throws InterruptedException {
		WalkThroughPage walkThrough = new WalkThroughPage(driver);
		SignInPage signIn = new SignInPage(driver);
		Email = DataProv.prop("Email");
		Password = DataProv.prop("Password");

		Thread.sleep(500);

		signIn.signIn(Email, Password);
		Thread.sleep(1000);
		System.out.println("title = " + walkThrough.title_01.getText());
		Assert.assertEquals(
				"Leave your Resume at Home\nand Build a Dynamic Profile.",
				walkThrough.title_01.getText());
		Thread.sleep(1000);

	}

}
