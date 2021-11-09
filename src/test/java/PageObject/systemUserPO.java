package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class systemUserPO {

	public static void finduser(WebDriver driver) {

		List<WebElement> totalrows = driver.findElements(By.xpath("//table[@id='resultTable']//tr"));

		System.out.println(totalrows.size());
		List<WebElement> totalcolumns = driver.findElements(By.xpath("//table[@id='resultTable']//tr[1]//td"));

		System.out.println(totalcolumns.size());

		for (int i = 1; i <= totalrows.size() - 1; i++) {
			for (int j = 1; j <= totalcolumns.size() - 1; j++) {

				WebElement username = driver
						.findElement(By.xpath("//table[@id='resultTable']//tr[" + i + "]//td[" + j + "]"));
				if (username.getText().contains("Nina.Patel")) {

					user2 = driver.findElement(By.xpath("//table[@id='resultTable']//tr[" + i + "]//td[1]"));
				}
			}
		}

	}

	public static WebElement user2;

	@FindBy(id = "btnDelete")
	WebElement btnDelete;

	@FindBy(id = "dialogDeleteBtn")
	WebElement btnAlertDelet;

	@FindBy(id = "btnAdd")
	WebElement btnAddUser;

	public void addUser() {
		btnAddUser.click();
	}

	public void deletuser(WebDriver driver) {
		finduser(driver);
		user2.click();
		btnDelete.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		btnAlertDelet.click();

	}

}
