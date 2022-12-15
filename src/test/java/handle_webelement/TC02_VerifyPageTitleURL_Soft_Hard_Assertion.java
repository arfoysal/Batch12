package handle_webelement;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utilities.DriverSetup;

public class TC02_VerifyPageTitleURL_Soft_Hard_Assertion extends DriverSetup{
	public String baseUrl="http://automationpractice.com/index.php";
	@Test(priority =1 )
	public void verifyPageTitle() {
		
		driver.get(baseUrl);
		String actualTitle = driver.getTitle();
//		if (actualTitle.equals("My Store")) {
//			System.out.println("Pass");
//		}else {
//			System.out.println("Not pass");
//		}
//		
		assertEquals(actualTitle, "My Store");
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actualTitle, "My Store");
		System.out.println("Soft Assertion");
		
	
		softAssert.assertAll();
		
	}
	
	@Test(priority = 2)
	public void verifyPageUrl() {
		System.out.println(driver.getCurrentUrl());
		assertNotEquals(driver.getCurrentUrl(), "http://automationpractice.com/index");;
		
	}
}
