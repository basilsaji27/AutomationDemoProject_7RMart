package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends Base{
	
	String username = "admin";
	String password = "admin";
	@Test
	public void loginPage() {
		WebElement uname = driver.findElement(By.name("username"));
		uname.sendKeys(username);
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys(password);
		WebElement signin = driver.findElement(By.xpath("//button[text() = 'Sign In']"));
		signin.click();
		
		
		//For Validation
		WebElement dashBoard = driver.findElement(By.xpath("//p[text() = 'Dashboard']"));
		Boolean homePage = dashBoard.isDisplayed();
		Assert.assertTrue(homePage);
	}
}
