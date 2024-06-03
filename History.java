package Pharmacist;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class History {
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

		// Dashboard
		WebElement CreateNewOrder = driver
				.findElement(By.xpath("//div[@class='booking-grid']//button[@class='btn book-btn btn-secondary']"));
		CreateNewOrder.click();
		Thread.sleep(2000);

		// History
		WebElement History = driver.findElement(
				By.xpath("//div[@class='options-div']//button[@class='btn history-btn btn-secondary btn-sm']"));
		History.click();
		Thread.sleep(2000);
		WebElement Search = driver.findElement(By.xpath("//input[@id='pharmacyhistoryFilter']"));
		Search.sendKeys("11/03/2024");
		Thread.sleep(2000);

		// SYSOUT FOR SEARCH BOX
		List<WebElement> Searchsize = driver
				.findElements(By.xpath("(//div[@class='ag-center-cols-container'])[2]/div"));
		int val = Searchsize.size();
		System.out.println(val);
		System.out.println(Searchsize.get(0).getText());

		// Action to click the view button
		for (int i = 0; i < val; i++) {
			String mobileText = Searchsize.get(i).getText();
			if (mobileText.contains("11/03/2024")) {
				driver.findElement(By.xpath("((//div[@class='ag-center-cols-container'])[2]/div/div)[6]//div/a"))
						.click();
				break;
			}

		}

	}
}
