package locator_learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MySecondLocatorTest {
	@Test
	public void myFirstTest() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		// create a chromeDriver object named driver.
		WebDriver driver = new ChromeDriver();

		// go to google web page
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// Maximize the browser window
		driver.manage().window().maximize();
		
		// Locate webElement By Tag name
		WebElement header = driver.findElement(By.tagName("h1"));
		String textString =	header.getText();
		System.out.println(textString);
		
		// Locate webElement By CSSSelector -Tag name
		header = driver.findElement(By.cssSelector("h1"));
		textString = header.getText();
		System.out.println(textString);
		// Locate webElement By XPATH -Tag name
		header = driver.findElement(By.xpath("//h1"));
		textString =	header.getText();
		System.out.println(textString);
		
		// Locate webElement By CSSSelector -ID
		WebElement checkbox1 = driver.findElement(By.cssSelector("#checkBoxOption2"));
		checkbox1.click();
		// Locate webElement By CSSSelector -Class name
		WebElement tab = driver.findElement(By.cssSelector(".switch-tab"));
		System.out.println(tab.getText());
		
		// Locate webElement By XPATH -Direct Child
		WebElement radiobuttonExamplElement = driver.findElement(By.xpath("//fieldset /legend"));
		textString = radiobuttonExamplElement.getText();
		System.out.println(textString);
		
		// Locate webElement By CSSSelector -Direct Child
		radiobuttonExamplElement = driver.findElement(By.cssSelector("fieldset > legend"));
		textString = radiobuttonExamplElement.getText();
		System.out.println(textString);
		
		// Locate webElement By XPATH -Multiple Attributes -and/or
		WebElement radiobutton1 = driver.findElement(By.xpath("//input[@value='radio1' and @name='radioButton']"));
		radiobutton1.click();
		
		Thread.sleep(3000);
		// Locate webElement By CSSSelector -Multiple Attributes
		driver.findElement(By.cssSelector("input[value='radio2'][name='radioButton']")).click();
		
		Thread.sleep(3000);
		// Locate webElement By XPATH -Sub string of attribute value
		driver.findElement(By.xpath("//input[contains(@value,'adio3')]")).click();
		Thread.sleep(3000);
		
		
		// Locate webElement By CSSSelector -Sub string of attribute value
		driver.findElement(By.cssSelector("input[value*='adio1']")).click();

		// Locate webElement By XPATH -Start with string of attribute value
		driver.findElement(By.xpath("//input[starts-with(@id,'autocom')]")).sendKeys("Hello");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[starts-with(@id,'autocom')]")).clear();
		Thread.sleep(3000);
		
		// Locate webElement By CSSSelector -Start with string of attribute value
		driver.findElement(By.cssSelector("input[id^='autocom']")).sendKeys("Hello 2");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[starts-with(@id,'autocom')]")).clear();
		Thread.sleep(3000);
		
		// Locate webElement By XPATH -Ends with string of attribute value
//		driver.findElement(By.xpath("//input[ends-with(@id,'tocomplete')]")).sendKeys("Hello 3");
		Thread.sleep(3000);

		// Locate webElement By CSSSelector -Ends with string of attribute value
		driver.findElement(By.cssSelector("input[id$='mplete']")).sendKeys("Hello 3");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[id$='mplete']")).clear();
		Thread.sleep(2000);
		
		// Locate webElement By XPATH -Any tag
		driver.findElement(By.xpath("//*[@id='autocomplete']")).sendKeys("Hello 4");
		Thread.sleep(2000);
		
		// Locate webElement By XPATH -Following sibling
		textString = driver.findElement(By.xpath("//label[@for='radio2'] /following-sibling::label")).getText();
		System.out.println(textString);
		
		// Locate webElement By XPATH -Preceding sibling
		textString = driver.findElement(By.xpath("//label[@for='radio2'] /preceding-sibling::label")).getText();
		System.out.println(textString);
		
		// Locate webElement By XPATH -Child First/last/any position
		textString = driver.findElement(By.xpath("//fieldset /label[contains(@for,'radio')][last()]")).getText();
		System.out.println(textString);
		
		// Locate webElement By CSSSelector -Child First/last/any position
		textString = driver.findElement(By.cssSelector("fieldset label[for*='radio']:nth-child(2)")).getText();
		System.out.println(textString);
		
		// close the browser all active window
		driver.quit();
	}

}
