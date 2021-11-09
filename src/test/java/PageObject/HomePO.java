package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePO {

	@FindBy(xpath = "//*[text()='Admin']")
	WebElement txtAdmin;

	@FindBy(xpath = "//*[text()='User Management']")
	WebElement txtUsermgmt;

	@FindBy(xpath = "//*[text()='Users']")
	WebElement txtUser;

	public void clickonUser(WebDriver driver) {

		Actions a = new Actions(driver);
		a.moveToElement(txtAdmin).build().perform();
		a.moveToElement(txtUsermgmt).build().perform();
		a.moveToElement(txtUser).click().build().perform();

	}

	public void clickonJobTitle() {

	}

}
