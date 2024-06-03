package Pharmacist;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Retune {

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
		driver.findElement(By.id("pharmacyhistoryFilter")).sendKeys("8056221601");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='view-btn'])[2]")).click();

		// Reorder
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn reference-btn btn-one btn-secondary']")).click();

		// Sales return
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='ag-center-cols-viewport'])[4]//div[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='ag-center-cols-viewport'])[4]//div[3]")).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By.id("cancelReason")).sendKeys("Automation purpose");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn submitbtn-color submit-height-one btn-primary']")).click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//button[@class='el-button el-button--default el-button--small el-button--primary '] "))
				.click();

	}

}
