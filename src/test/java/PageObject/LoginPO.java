package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPO {

	WebDriver driver;

	@FindBy(id = "txtUsername")
	WebElement txtUsername;

	@FindBy(id = "txtPassword")
	WebElement txtPassword;

	@FindBy(id = "btnLogin")
	WebElement btnLogin;

	public void LoginOperation() {
		txtUsername.clear();
		txtUsername.sendKeys("admin");

		txtPassword.clear();
		txtPassword.sendKeys("admin123");

		btnLogin.click();

	}

}
