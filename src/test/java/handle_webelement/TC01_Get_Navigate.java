package handle_webelement;

import org.testng.annotations.Test;

import utilities.DriverSetup;

public class TC01_Get_Navigate extends DriverSetup {
	
	public static String baseUrl = "https://www.w3schools.com";
	@Test
	public void getAWebPage() throws InterruptedException {
		driver.get("https://www.w3schools.com");
		System.out.println("This is GET");
		driver.navigate().to("https://www.w3schools.com/html/");
		System.out.println("This is navigate");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
	}
	
}
