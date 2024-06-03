package Pharmacist;

import org.openqa.selenium.WebElement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Changepassword {
public static void main(String[]args) throws InterruptedException {
		
		//Chrome_Browser Launch
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
		
		//DashBoard	
		WebElement Profiledropdown =  driver.findElement(By.xpath("(//a[@class='nav-link dropdown-toggle'])[1]/.."));
		Profiledropdown .click();
		Thread.sleep(2000);
		WebElement Changepassword = driver.findElement(By.xpath("(//a[@class='dropdown-item'])[7]"));
		Changepassword.click();
		Thread.sleep(2000);	
		
		//Reset Password
		//Currentpassword
		WebElement Currentpassword = driver.findElement(By.xpath("(//div[@class='v-text-field__slot'])[1]"));	
		Actions action=new Actions(driver);
		action.moveToElement(Currentpassword).click().sendKeys("Admin@123").perform();
		Thread.sleep(2000);	
		//Newpassword
		WebElement Newpassword = driver.findElement(By.xpath("(//div[@class='v-text-field__slot'])[2]"));	
		action.moveToElement(Newpassword).click().sendKeys("Admin@1234").perform();
		Thread.sleep(2000);	
		//Conformpassword
		WebElement Conformpassword = driver.findElement(By.xpath("(//div[@class='v-text-field__slot'])[3]"));	
		action.moveToElement(Conformpassword).click().sendKeys("Admin@1234").perform();
		Thread.sleep(2000);
		//Proceed
//		WebElement Proceed = driver.findElement(By.xpath("//button[@class='btn proceed-btn submitbtn-color btn-secondary']"));
//		Proceed.click();
}
}
