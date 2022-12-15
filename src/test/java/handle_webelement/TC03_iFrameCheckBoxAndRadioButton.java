package handle_webelement;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utilities.DriverSetup;

public class TC03_iFrameCheckBoxAndRadioButton extends DriverSetup{
	public static String baseUrl = "https://jqueryui.com/checkboxradio";
	@Test
	public void checkIframe() throws InterruptedException {
		driver.get(baseUrl);
		By iframelocateBy = By.className("demo-frame");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.cssSelector("label[for='radio-1']")).click();
		
		driver.switchTo().defaultContent();
//		driver.findElement(By.xpath("//a[normalize-space()='Draggable']")).click();
	
		Thread.sleep(10000);
		
		driver.switchTo().frame(driver.findElement(iframelocateBy));
		driver.findElement(By.cssSelector("label[for='radio-2']")).click();
		// Check box
		driver.findElement(By.cssSelector("label[for='checkbox-1']")).click();
		driver.findElement(By.cssSelector("label[for='checkbox-3']")).click();

		Thread.sleep(10000);
		driver.switchTo().defaultContent();
		
		
	}
}
