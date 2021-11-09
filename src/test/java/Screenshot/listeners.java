package Screenshot;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import BasePkg.BaseClass;

public class listeners extends BaseClass implements ITestListener {

	public listeners() throws FileNotFoundException, IOException {
		super();
	}

	public static void takescreenshot() {

		SimpleDateFormat s = new SimpleDateFormat("dd-mm-yyyy hh-MM-ss");
		String date = s.format(new Date());

		TakesScreenshot ts = (TakesScreenshot) driver;
		File f = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(f,
					new File("F:\\JulyBatch\\POM-OrangeHRM\\src\\test\\resources\\Screenshot\\" + date + ".jpeg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onFinish(ITestContext arg0) {
		System.out.println("Test case execution has been finished");

	}

	public void onStart(ITestContext arg0) {
		System.out.println("Test case execution has been started");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName());

	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestSuccess(ITestResult result) {
		takescreenshot();

	}
}
