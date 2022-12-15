package locator_learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirstLocatorTest {
	@Test
	public void myFirstTest() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		// create a chromeDriver object named driver.
		WebDriver driver = new ChromeDriver();

		// go to google web page
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// Maximize the browser window
//		driver.manage().window().maximize();

		// wait for 5 seconds
//		
		// Locate webElement by HTML Tag name  
		WebElement header = driver.findElement(By.tagName("h1"));
		String textString =	header.getText();
		System.out.println(textString);
		
		// Locate webElement By attribute ID
		WebElement checkbox1 = driver.findElement(By.id("checkBoxOption2"));
		checkbox1.click();
		
		// Locate webElement By attribute Class name
		WebElement tab = driver.findElement(By.className("switch-tab"));
		System.out.println(tab.getText());

		// Locate webElement By Link text
		WebElement linkElement = driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material"));
		System.out.println("Link Tag Name " +linkElement.getTagName());
		
		// Locate webElement By Partial Link Text
		WebElement linkElement1 = driver.findElement(By.partialLinkText("Free Access to InterviewQues"));
		System.out.println("Link Text" +linkElement1.getText());
		
		// Locate webElement By XPATH
		WebElement inputtextElement = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		inputtextElement.sendKeys("Test Text");
	
		// Locate webElement By CSSSelector
		WebElement inputtext = driver.findElement(By.cssSelector("input[name='enter-name']"));
		inputtext.sendKeys("Test Text");
		Thread.sleep(3000);
		
		// Locate webElement By CSSSelector
		WebElement selectItemElement = driver.findElement(By.cssSelector("select[name='dropdown-class-example']"));
//		WebElement selectItemElement = driver.findElement(By.className("dropdown-class-example"));
		selectItemElement.click();
		Thread.sleep(3000);
		// Locate webElement By XPATH
		WebElement option2 = driver.findElement(By.xpath("//option[@value='option2']"));
		option2.click();
		Thread.sleep(3000);
		
		
		// close the browser all active window
		driver.quit();
	}

}
