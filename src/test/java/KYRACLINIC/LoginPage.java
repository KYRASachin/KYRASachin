package KYRACLINIC;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;






public class LoginPage extends Resource
{
	WebDriver driver;
@Test


public void homePageNavigation() throws IOException, InterruptedException

{
	driver=initializeDriver();
	driver.get("https://emr21wesley.emerging.com.au/ehs/core/");
	Thread.sleep(2000);
	loginPage1 lg=new loginPage1(driver);
	
	lg.getUsername().sendKeys("ehsadmin");
	lg.getPassword().sendKeys("E35@dmin");
	lg.getLoginButton().click();
	
	Thread.sleep(2000);
	mainMenu mM=new mainMenu(driver);
	mM.getMainHome().click();
	
}


@AfterTest
public void closeBrower() {
	driver.close();
}

}
