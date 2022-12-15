package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetup {
	public WebDriver driver;
	
	@BeforeSuite
	public void setDriver() {
		WebDriverManager.chromedriver().setup();
		// create a chromeDriver object named driver.
		driver = new ChromeDriver();
	}
	
	@AfterSuite
	public void quitDriver() {
		driver.quit();
	}

}
