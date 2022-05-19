package KYRACLINIC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage1 {
	
	public WebDriver driver;
	
	By username=By.xpath(".//*[@id='username']");
	By password=By.xpath(".//*[@id='password']");
	By login=By.xpath(".//*[@id='login']");
	
	
	public loginPage1(WebDriver driver)
	
	{
		this.driver=driver;
	}

	
	public WebElement getUsername()
	{
		return driver.findElement(username);
		
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(password);
		
	}
	
	public WebElement getLoginButton()
	{
		return driver.findElement(login);
	}
}