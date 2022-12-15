package handle_webelement;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utilities.DriverSetup;

public class TC06_Allerts_Window_JS_Scroll_waits extends DriverSetup {
	
	@Test
	public void handleAlert() throws InterruptedException {

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(3000);

		String resultString = driver.findElement(By.id("result")).getText();
		assertEquals(resultString, "You successfully clicked an alert");

		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(3000);

		resultString = driver.findElement(By.id("result")).getText();
		assertEquals(resultString, "You clicked: Ok");

		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
		System.out.println(alert.getText());
		alert.dismiss();
		Thread.sleep(3000);

		resultString = driver.findElement(By.id("result")).getText();
		assertEquals(resultString, "You clicked: Cancel");

		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		System.out.println(alert.getText());
		alert.sendKeys("Hello");
		alert.accept();
		Thread.sleep(3000);

		resultString = driver.findElement(By.id("result")).getText();
		assertTrue(resultString.contains("Hello"));
	}

	@Test
	public void handleBrowserWindow() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(3000);
		// driver.quit();
		// driver.close();
		Thread.sleep(5000);

		Thread.sleep(2000);
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://google.com");
		Thread.sleep(2000);

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		driver.findElement(By.id("opentab")).click();

		driver.findElement(By.id("openwindow")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());

		List<String> handelsList = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(handelsList.size());
		driver.switchTo().window(handelsList.get(1));
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());

		Thread.sleep(2000);
	}

	@Test
	public void useJsInAutomation() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0);");
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.id("mousehover"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", element);
		Thread.sleep(2000);
	}
	
	
	@Test
	public void diffWait() throws InterruptedException {
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get("https://qavbox.github.io/demo/delay/");
		driver.findElement(By.id("loaderStart")).click();
		System.out.println();
//		String text = driver.findElement(By.id("loaderdelay")).getText();
		By elementBy = By.id("loaderdelay");
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loaderdelay")));
		System.out.println(element.getText());
		assertTrue(element.getText().contains("I appeared after 5 sec loading"));
	}
	
	@Test
	public void useCommonMethod() throws InterruptedException {
		driver.get("https://qavbox.github.io/demo/delay/");
		clickOnElement(By.id("loaderStart"));
		assertTrue(getElementText(By.id("loaderdelay")).contains("I appeared after 5 sec loading"));
	}
	
	public WebElement getElemnt(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public void clickOnElement(By locator) {
		getElemnt(locator).click();
	}
	
	public String getElementText(By locator) {
		return getElemnt(locator).getText();
	}

}
