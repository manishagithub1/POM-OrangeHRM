package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class newUserPO {

	@FindBy(xpath = "//form[@id=\"frmSystemUser\"]//li[1]/select")
	WebElement drpdwnUserRole;

	@FindBy(id = "systemUser_employeeName_empName")
	WebElement txtEmpname;

	@FindBy(id = "systemUser_userName")
	WebElement txtUserName;

	@FindBy(id = "systemUser_status")
	WebElement drpdwnStatus;

	@FindBy(id = "systemUser_password")
	WebElement txtPassword;

	@FindBy(id = "systemUser_confirmPassword")
	WebElement txtConfirmPassword;

	public void addInfo(String userrole, String name, String username, String status, String pass, String confirmpass) throws InterruptedException {

		Thread.sleep(2000);
		Select s = new Select(drpdwnUserRole);
		s.selectByVisibleText("xyz");

		txtEmpname.clear();
		txtEmpname.sendKeys(name);

		txtUserName.clear();
		txtUserName.sendKeys(username);

		Select s1 = new Select(drpdwnStatus);
		s1.selectByVisibleText(status);

		txtPassword.clear();
		txtPassword.sendKeys(pass);

		txtConfirmPassword.clear();
		txtConfirmPassword.sendKeys(confirmpass);

	}

}
