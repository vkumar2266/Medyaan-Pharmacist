package Pharmacist;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bill {
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

		// DashBoard
		WebElement createNewOrder = driver.findElement(By.xpath("//button[@class='btn book-btn btn-secondary']"));
		createNewOrder.click();
		Thread.sleep(2000);

		// Medicine page
		WebElement history = driver.findElement(By.xpath("//button[@class='btn history-btn btn-secondary btn-sm']"));
		history.click();
		Thread.sleep(2000);

		// History page
		WebElement search = driver.findElement(By.xpath("//input[@id='pharmacyhistoryFilter']"));
		search.sendKeys("27/10/2023");
		Thread.sleep(2000);
		// Xpath for view buttom
		WebElement view = driver
				.findElement(By.xpath("((//div[@class='ag-center-cols-container'])[2]/div/div)[6]//div/a"));
		// Sysout the order details
		List<WebElement> orderDetails = driver
				.findElements(By.xpath("(//div[@class='ag-center-cols-container'])[2]/div"));
		System.out.println(orderDetails.get(0).getText());

		// Action to click the view button
		for (int i = 0; i < orderDetails.size(); i++) {
			String toGetView = orderDetails.get(i).getText();
			if (toGetView.contains("Kamalakannan N"))
			{
				view.click();
				break;
			}
		}
		Thread.sleep(2000);
		// Sales history page
		WebElement bill = driver.findElement(By.xpath("//button[@class='btn reference-btn btn-two btn-secondary']"));
		bill.click();

	}
}