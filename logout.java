package Pharmacist;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class logout {
	public static void main(String[] args) throws InterruptedException {

		// Chrome_Browser Launch
		WebDriver driver = new ChromeDriver();
		driver.get("https://development.medyaan.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));

		// Drop down handle in landing page
		driver.findElement(By.xpath("//*[@class=\"btn dropdown-toggle btn-secondary\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//ul[@class='dropdown-menu show']//a)[4]")).click();
		Thread.sleep(2000);

		// Sign in page
		driver.findElement(By.name("phone")).sendKeys("7868051895");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Admin@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class=\"btn login-button btn-secondary btn-block\"]")).click();
		Thread.sleep(2000);
		
		//Profile Drop down
		WebElement profilEDropDown = driver.findElement(By.xpath("//div[@class='nav-height']"));
		profilEDropDown.click();
		Thread.sleep(2000);
		//Xpath for Logout
		WebElement logOut = driver.findElement(By.xpath("(//ul[@class='dropdown-menu dropdown-menu-right show']//a[@class='dropdown-item'])[3]"));
		logOut.click();
	}
}
