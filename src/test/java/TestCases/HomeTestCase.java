package TestCases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BasePkg.BaseClass;
import PageObject.HomePO;
import Screenshot.listeners;

@Listeners(Screenshot.listeners.class)
public class HomeTestCase extends BaseClass {

	public HomeTestCase() throws FileNotFoundException, IOException {
		super();
	}

	@Test
	public void HomePageAdminOperation() {

		HomePO hp = PageFactory.initElements(driver, HomePO.class);
		hp.clickonUser(driver);
	}
}
