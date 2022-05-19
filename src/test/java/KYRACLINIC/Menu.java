package KYRACLINIC;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Menu  {

	WebDriver driver;
	


	@Test
	public void Menu1() {
		
		
		mainMenu mM=new mainMenu(driver);
		
		mM.getMainHome().click();
		
		
	}
}
