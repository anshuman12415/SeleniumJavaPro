package test1;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPage;


public class GoogleSearchTest {
	private static WebDriver d=null;

	public static void main(String[] args) {
		googleSearch();
		
	}
	public static void googleSearch() {
		

		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		
		/*
		 * System.setProperty("webdriver.ie.driver",
		 * "D:\\SELENIUM JAVA PROJECT\\Driver\\IEDriverServer.exe"); WebDriver d = new
		 * InternetExplorerDriver();
		 */

		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "C:\\Users\\anshu\\OneDrive\\Documents\\ECLIPSE-PROJECT\\SeleniumFramework\\Drivers\\geckodriver.exe"
		 * ); WebDriver d = new FirefoxDriver();
		 */
		/*d.get("https://app.windseworld.com/");
		//d.findElement(By.xpath("//*[@id=\"root\"]/div[2]/nav/div[3]/ul/li[6]/a/img")).click();
		//d.findElement(By.id("username")).clear();
		//d.findElement(By.id("username")).sendKeys("7415919195");
		//d.findElement(By.id("password")).clear();
		d.findElement(By.id("password")).sendKeys("11111111");
		d.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div/form/div[4]/button/strong")).click();
		d.close();
*/
		 d.get("https://www.google.com/");
		 GoogleSearchPage.textbox_search(d).sendKeys("anshuman");
		 GoogleSearchPage.button_search(d).sendKeys(Keys.RETURN);
	}

}
