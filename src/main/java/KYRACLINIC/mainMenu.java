package KYRACLINIC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mainMenu {
	public WebDriver driver;
	
	By home = By.xpath("//*[contains(text(),'Home')]");








public mainMenu(WebDriver driver) {
		// TODO Auto-generated constructor stub
this.driver=driver;
	}





public WebElement getMainHome()
{
	return driver.findElement(home);
}	
}