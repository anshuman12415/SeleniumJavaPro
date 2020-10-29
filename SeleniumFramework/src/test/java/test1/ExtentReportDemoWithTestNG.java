package test1;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPage;

public class ExtentReportDemoWithTestNG {
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	WebDriver d;

	@BeforeSuite
	public void setup() {

		htmlReporter = new ExtentHtmlReporter("extent.html");

		// create ExtentReports and attach reporter(s)
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

	}

	@BeforeClass
	public void Setuptest() {
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
	}

	@Test
	public void test() throws IOException {

		// creates a toggle for the given test, adds all log events under it
		ExtentTest test2 = extent.createTest("MyFirstTest", "Sample description");
		d.get("https://www.google.com/");
		// log(Status, details)
		test2.log(Status.INFO, "Navigated to google");
		GoogleSearchPage.textbox_search(d).sendKeys("anshuman");
		test2.pass("enter search box");
		GoogleSearchPage.button_search(d).sendKeys(Keys.RETURN);
		test2.pass("pressed keyboard");

		// info(details)
		test2.info("This step shows usage of info(details)");

		// log with snapshot
		test2.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());

		// test with snapshot
		test2.addScreenCaptureFromPath("screenshot.png");

	}

	@Test
	public void test1() throws IOException {

		// creates a toggle for the given test, adds all log events under it
		ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
		// log(Status, details)
		test.log(Status.INFO, "This step shows usage of log(status, details)");

		// info(details)
		test.info("This step shows usage of info(details)");

		// log with snapshot
		test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());

		// test with snapshot
		test.addScreenCaptureFromPath("screenshot.png");

	}
	
	@AfterTest
	public void teardownTest() {
		// calling flush writes everything to the log file
		d.close();
		d.quit();
		System.out.println("test completed");

	}

	@AfterSuite
	public void teardown() {
		// calling flush writes everything to the log file
		extent.flush();

	}

}