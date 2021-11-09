package TestCases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BasePkg.BaseClass;
import PageObject.systemUserPO;
import Screenshot.listeners;

@Listeners(Screenshot.listeners.class)
public class systemUserTest extends BaseClass {

	public systemUserTest() throws FileNotFoundException, IOException {
		super();
	}

	@Test(enabled = false)
	public void deletuser() {

		systemUserPO sp = PageFactory.initElements(driver, systemUserPO.class);
		sp.deletuser(driver);
	}

	@Test
	public void Adduser() {

		systemUserPO sp = PageFactory.initElements(driver, systemUserPO.class);
		sp.addUser();
	}

}
