package TestCases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BasePkg.BaseClass;
import PageObject.LoginPO;
import Screenshot.listeners;
@Listeners(Screenshot.listeners.class)
public class LoginTestCase extends BaseClass {

	public LoginTestCase() throws FileNotFoundException, IOException {
		super();
	}

	@Test
	public void Login() {

		LoginPO lp = PageFactory.initElements(driver, LoginPO.class);
		lp.LoginOperation();
	}
}
