package StepDefinitions;

import org.testng.annotations.Test;
import Pages.Basepage;
import Pages.Homepage;

public class Basetest {

	@Test
	public void ValidateTest() throws InterruptedException {
		Basepage URL = new Basepage();
		URL.LaunchURL();
		
		Homepage scroll = new Homepage(URL.driver);
		scroll.UserIsAbleToDoActionsInHomepage();

		URL.driver.close();
		URL.driver.quit();
	}

}
