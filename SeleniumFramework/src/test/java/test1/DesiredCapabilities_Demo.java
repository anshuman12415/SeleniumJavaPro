package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilities_Demo {

	public static void main(String[] args) {
		String ProjectPath = System.getProperty("user.dir");
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings", true);
		caps.getCapability(ProjectPath);

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "D:\\SELENIUM JAVA PROJECT\\Driver\\chromedriver.exe"); WebDriver d = new
		 * ChromeDriver();
		 */

		System.setProperty("webdriver.ie.driver", "D:\\SELENIUM JAVA PROJECT\\Driver\\IEDriverServer.exe");

		WebDriver d = new InternetExplorerDriver();
		d.get("https://www.google.com/");
		d.findElement(By.name("q")).sendKeys("anshuman");
		d.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
	}

}
