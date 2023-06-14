package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTry {
	public static void main(String[] args) throws InterruptedException {

		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Launch website  
		driver.navigate().to("http://www.google.com/");

		// Click on the search text box and send value
		driver.findElement(By.id("APjFqb")).sendKeys("selenium sample");

		// Click on the search button
		driver.findElement(By.name("btnK")).click();

		//driver.wait(1000);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		//Verify
		if (driver.findElement(By.id("result-stats")).isDisplayed()) {
			System.out.println("Search result: " + driver.findElement(By.id("result-stats")).getText());
		} else {
			System.out.println("No result, not expected...");
		}
	}
}
