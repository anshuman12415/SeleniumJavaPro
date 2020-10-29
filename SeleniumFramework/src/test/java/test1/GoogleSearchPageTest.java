package test1;

import javax.management.loading.PrivateClassLoader;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import pages.GoogleSearchPageObj;

public class GoogleSearchPageTest {
	private static WebDriver d = null;

	public static void main(String[] args) {

	}

	public void GoogleSearchTest() {
		String ProjectPath = System.getProperty("user.dir");
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\anshu\\OneDrive\\Documents\\ECLIPSE-PROJECT\\SeleniumFramework\\Drivers\\chromedriver.exe");
		d = new ChromeDriver();

		GoogleSearchPageObj gsobj = new GoogleSearchPageObj(d);

		gsobj.setTextInSearch("anshuman");
		gsobj.clickSearch();

	}

}
