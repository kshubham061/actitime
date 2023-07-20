package POMRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {
	public  GooglePage(ChromeDriver driver) {
		PageFactory.initElements(driver, this);
	}
     @FindBy(name="q")
     WebElement googleSearchBox;
     @FindBy(xpath="(//input[@value='Google Search'])[2]")
     WebElement googleSearchButton;
     
}
