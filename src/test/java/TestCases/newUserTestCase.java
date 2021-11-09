package TestCases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BasePkg.BaseClass;
import ExcelOpeartions.ExcelOperation;
import PageObject.newUserPO;

public class newUserTestCase extends BaseClass {

	public newUserTestCase() throws FileNotFoundException, IOException {
		super();

	}

	@Test(dataProvider = "Data")
	public void registerUser(String userrole, String name, String username, String status, String pass,
			String confirmpass) throws InterruptedException {
		System.out.println("Inside Data provider");
		System.out.println(username + userrole + name +status +pass);

		newUserPO np = PageFactory.initElements(driver, newUserPO.class);
		np.addInfo(userrole, name, username, status, pass, confirmpass);
	}

	@DataProvider(name = "Data")
	public Object[][] data() throws IOException {
		ExcelOperation.totalRowsandColumns();
		Object[][] obj = ExcelOperation.readdata();
		return obj;
	}

}
