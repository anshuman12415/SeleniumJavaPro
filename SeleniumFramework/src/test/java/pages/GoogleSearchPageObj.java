package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObj {

	WebDriver d = null;
	By textBox_search = By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input");
	By Button_search = By.name("btnK");
	
	public GoogleSearchPageObj(WebDriver d) {
		this.d=d;
		
		
	}

	public void setTextInSearch(String text) {
		d.findElement(textBox_search).sendKeys("text");

	}

	public void clickSearch() {
		d.findElement(Button_search).sendKeys(Keys.RETURN);

	}

}
