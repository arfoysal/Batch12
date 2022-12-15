package handle_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import utilities.DriverSetup;

public class TC04_SelectTag_DropDown_MultiSelect extends DriverSetup {
	public static String baseUrl = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple";
	
	@Test
	public void selectMultiSelect() throws InterruptedException {
		
		driver.get(baseUrl);
		driver.switchTo().frame("iframeResult");
		
		Select select = new Select(driver.findElement(By.id("cars")));
		
		select.selectByIndex(0);
//		driver.findElement(By.cssSelector("option[value='volvo']")).click();
	    String textString = select.getFirstSelectedOption().getText();
	    Thread.sleep(2000);
	    System.out.println(textString);
	    select.selectByValue("opel");
	    
	    select.selectByVisibleText("Audi");
	    select.deselectAll();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		
	}
}
