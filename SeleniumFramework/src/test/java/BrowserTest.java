import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {

	public static void main(String[] args) {
		
		String ProjectPath = System.getProperty("user.dir");
		System.out.println("ProjectPath");
		/*System.setProperty("webdriver.chrome.driver",
				"D:\\SELENIUM JAVA PROJECT\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();*/
		
		System.setProperty("webdriver.ie.driver",
				"D:\\SELENIUM JAVA PROJECT\\Driver\\IEDriverServer.exe");
		WebDriver d = new InternetExplorerDriver();
		
		

		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "C:\\Users\\anshu\\OneDrive\\Documents\\ECLIPSE-PROJECT\\SeleniumFramework\\Drivers\\geckodriver.exe"
		 * ); WebDriver d = new FirefoxDriver();
		 */
		d.get("https://www.winds.co.in/");

	}

}
