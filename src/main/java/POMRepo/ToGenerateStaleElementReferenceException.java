package POMRepo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGenerateStaleElementReferenceException {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		WebElement googleSearchBox = driver.findElement(By.name("q"));
		googleSearchBox.sendKeys("selenium");
		driver.navigate().refresh();
		Thread.sleep(2000);
		googleSearchBox.sendKeys("Automation");
		
		
	}

}
