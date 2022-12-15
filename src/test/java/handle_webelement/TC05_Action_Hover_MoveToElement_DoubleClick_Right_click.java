package handle_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import utilities.DriverSetup;

public class TC05_Action_Hover_MoveToElement_DoubleClick_Right_click extends DriverSetup {
	public String baseUrl = "https://demoqa.com/menu";

	@Test
	public void checkAction() throws InterruptedException {
		//driver.get(baseUrl);
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		WebElement mainManuElement = driver.findElement(By.xpath("//a[normalize-space()='Main Item 2']"));
		actions.clickAndHold(mainManuElement).build().perform();
		Thread.sleep(3000);
		WebElement submenuElement = driver.findElement(By.xpath("//body/div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']/div[@class='col-12 mt-4 col-md-6']/div[@class='nav-menu-container']/ul[@id='nav']/li/ul/li[2]/a[1]"));
		System.out.println(submenuElement.getText());
		submenuElement.click();
		
		actions.clickAndHold(driver.findElement(By.xpath("//a[normalize-space()='SUB SUB LIST »']"))).build().perform();
		Thread.sleep(3000);
		WebElement subsubmenuElement = driver.findElement(By.xpath("//a[normalize-space()='Sub Sub Item 2']"));
		System.out.println(subsubmenuElement.getText());
		subsubmenuElement.click();
		Thread.sleep(4000);
		
		driver.get("https://www.daraz.com.bd/");
		Thread.sleep(4000);
		WebElement catElement= driver.findElement(By.xpath("//a[normalize-space()='About Daraz']"));
		//actions.moveToElement(catElement).build().perform();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.switchTo().frame("iframeResult");
		Select select = new Select(driver.findElement(By.id("cars")));
		
		actions.keyDown(Keys.CONTROL).click(select.getOptions().get(1)).click(select.getOptions().get(3)).keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(4000);
	}
	
	
	@Test
	public void cellPhoneTest() {
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://training.nop-station.com/electronics");
		WebElement mainManuElement = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']"));
		actions.clickAndHold(mainManuElement).build().perform();
		WebElement cellphonElement = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']"));
		cellphonElement.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
