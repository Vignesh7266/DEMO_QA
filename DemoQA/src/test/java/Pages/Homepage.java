package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	WebDriver driver;
	By JoinNow = By.xpath("//a//img[contains(@class, 'banner-image')]");
	public Homepage(WebDriver driver) {
		this.driver = driver;
	}

	public void UserIsAbleToDoActionsInHomepage() throws InterruptedException {
		WebElement joinnowlink = driver.findElement(JoinNow);
		if (joinnowlink.isEnabled()) {
			System.out.println("Joinnowlink is clicked successfully");
		}else{
			System.out.println("Joinnowlink is not clicked successfully");
		}
		driver.findElement(JoinNow).click();
		Thread.sleep(2000);
		//driver.switchTo().window()
	}
}
