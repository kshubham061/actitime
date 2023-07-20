package BasicTestScript;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import POMRepo.HomePage;
import POMRepo.LoginPage;

public class ToVerifyTheHomepageTitle {
	public static void main(String[] args) {
		String expectedHomePageTitle ="enter";
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.actitime.com/login.do");
		
		LoginPage login = new LoginPage(driver);
		login.loginAction("admin", "manager");
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleContains(expectedHomePageTitle));
		
		String actualHomePageTitle = driver.getTitle();
		if (actualHomePageTitle.contains(expectedHomePageTitle)) {
			System.out.println("pass: The home page title is verified");
			
		}
		
		else {
			System.out.println("fail: The home page title is not verified");
			HomePage home = new HomePage(driver);
			home.logoutAction();
			
			driver.quit();
			
			
		}
		
				
	}

}
