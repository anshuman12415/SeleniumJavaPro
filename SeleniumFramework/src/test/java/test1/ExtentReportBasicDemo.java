package test1;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPage;

public class ExtentReportBasicDemo {
	private static WebDriver d = null;

	public static void main(String[] args) throws IOException {
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");

		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		// creates a toggle for the given test, adds all log events under it
		ExtentTest test = extent.createTest("Google Search test", "test to validate google search test");

		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.get("https://www.google.com/");
		test.pass("navigate to google.com");
		GoogleSearchPage.textbox_search(d).sendKeys("anshuman");
		test.pass("enter search box");
		GoogleSearchPage.button_search(d).sendKeys(Keys.RETURN);
		test.pass("pressed keyboard");
		// log(Status, details)
		test.log(Status.INFO, "This step shows usage of log(status, details)");

		// info(details)

		// log with snapshot
		//test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());

		// test with snapshot
		test.addScreenCaptureFromPath("screenshot.png");

		d.close();
		d.quit();
		test.pass("close browser");
		test.info("test completed");
		// calling flush writes everything to the log file
		extent.flush();
	}

}
