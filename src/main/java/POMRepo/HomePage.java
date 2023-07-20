package POMRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(ChromeDriver driver) {
		PageFactory.initElements(driver, this);
		
		}
	@FindBy(linkText= "Logout")
	public WebElement logoutLink;
	
	public void logoutAction() {
		logoutLink.click();	
	}
	

}
