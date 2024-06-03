package Pharmacist;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reorder {
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

		// DashBoard
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class=\"btn book-btn btn-secondary\"]")).click();

		// History
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn history-btn btn-secondary btn-sm']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("pharmacy-history-rendered")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn reference-btn btn-secondary']")).click();
//      Thread.sleep(2000);
//      driver.findElement(By.xpath("//button[@class='btn reference-btn btn-secondary']")).click();

		// Medicine search field
		driver.findElement(By.xpath("(//input[@class='form-medium-height form-control'])[1]")).sendKeys("25");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-secondary reference-btn btn-one']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='form-medium-height form-control'])[3]"))
				.sendKeys("Reference Code");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='ref-group btn-group btn-group-md'])[3]/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='form-medium-height form-control'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='form-medium-height form-control'])[4]")).sendKeys("150");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn submitbtn-color submit-height-one btn-primary']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='el-message-box__btns']//button[2]")).click();
		// Bill page
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[@type='button'])[21]")).click();
		// To navigating to Dashboard
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn close-btn btn-secondary btn-sm']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='el-message-box__btns']//button[2]")).click();

	}
}