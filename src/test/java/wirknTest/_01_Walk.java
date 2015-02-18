package wirknTest;


import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.WalkThroughPage;

public class _01_Walk extends Init {
	

	@Test(groups = "Walk")
	public void _01_T_Walk() throws InterruptedException {
		WalkThroughPage walkThrough = new WalkThroughPage(driver);
		Thread.sleep(1000);
		System.out.println("title = " + walkThrough.title_01.getText());
		Assert.assertEquals(
				"Leave your Resume at Home\nand Build a Dynamic Profile.",
				walkThrough.title_01.getText());
		Thread.sleep(1000);

	}

	@Test(groups = "Walk")
	public void _02_T_Walk() throws InterruptedException {
		WalkThroughPage walkThrough = new WalkThroughPage(driver);
		swipe_();
		Assert.assertEquals(
				"Showcase your Personality with\nvideo based applications.",
				walkThrough.title_01.getText());
		Thread.sleep(1000);
	}

	@Test(groups = "Walk")
	public void _03_T_Walk() throws InterruptedException {
		WalkThroughPage walkThrough = new WalkThroughPage(driver);
		swipe_();
		Assert.assertEquals(
				"Explore your working community\n and get hired fast.",
				walkThrough.title_01.getText());
		Thread.sleep(1000);
	}

	@Test(groups = "Walk")
	public void _04_T_Walk() throws InterruptedException {
		WalkThroughPage walkThrough = new WalkThroughPage(driver);
		swipe_();
		Assert.assertEquals(
				"Find and fill last minute shifts\nwith a powerful shift manager.",
				walkThrough.title_01.getText());
		Thread.sleep(1000);
	}

	@Test(groups = "Walk")
	public void _05_T_Walk() throws InterruptedException {
		WalkThroughPage walkThrough = new WalkThroughPage(driver);
		swipe_();
		Assert.assertEquals("Your  Workplace  Connected",
				walkThrough.title_end.getText());
		Thread.sleep(1000);
	}

	private void swipe_() throws InterruptedException {
		driver.swipe(500, 500, 100, 500, 350);
		Thread.sleep(500);

	}

}
