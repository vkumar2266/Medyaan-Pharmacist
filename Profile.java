package Pharmacist;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Profile {
	public static void main(String[] args) throws InterruptedException, AWTException {
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
		
		//Sign Page
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
		WebElement Profile = driver.findElement(By.xpath("(//a[@class='dropdown-item'])[6]"));
		Profile.click();
		Thread.sleep(2000);
		
		//Profile
		//Edit
		WebElement Edit = driver.findElement(By.xpath("//button[@class='btn submitbtn-color btn-secondary']"));
		Edit.click();
		//firstname
		WebElement firstname = driver.findElement(By.id("firstnames"));
		Thread.sleep(2000);
		firstname.clear();
		Thread.sleep(3000);
		firstname.sendKeys("Dharshan");
		//Lastname
		WebElement Lastname = driver.findElement(By.id("lastname"));
		Thread.sleep(2000);
		Lastname.clear();
		Thread.sleep(3000);
		Lastname.sendKeys("G");
		Thread.sleep(2000);		
		//dateofbirth 	
		WebElement dateofbirth = driver.findElement(By.id("dateofbirth"));
		Actions action = new Actions(driver);
		action.moveToElement(dateofbirth).perform();
		WebElement dateofbirthcancelicon = driver.findElement(By.xpath("(//i[contains(@class,'el-input__icon')])[2]"));
		action.moveToElement(dateofbirthcancelicon).click().perform();
		dateofbirth.click();
		driver.findElement(By.xpath("//span[text()='2024 ']")).click();
		driver.findElement(By.xpath("//button[@class='el-picker-panel__icon-btn el-date-picker__prev-btn el-icon-d-arrow-left']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='el-picker-panel__icon-btn el-date-picker__prev-btn el-icon-d-arrow-left']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='2000']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Jun']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//tbody/tr)[3]/td[7]")).click();		
//	    Method 2 
//		dateofbirth.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()='1995 ']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@class='el-picker-panel__icon-btn el-date-picker__next-btn el-icon-d-arrow-right']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[text()='2000']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[text()='Jun']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//tbody/tr)[3]/td[7]")).click();		
		//GenderDropdownElement
		WebElement GenderDropdownElement = driver.findElement(By.xpath("(//select[@class='custom-select'])[1]"));
		Select D1= new Select(GenderDropdownElement);
		D1.selectByValue("Male");
		//phonenumber
		WebElement phonenumber = driver.findElement(By.id("phonenumber"));
		Thread.sleep(2000);
		phonenumber.click();
		Thread.sleep(2000);
		phonenumber.clear();
		Thread.sleep(2000);	
		phonenumber.sendKeys("7868051895");
		Thread.sleep(2000);
		//EmergencyContact
		WebElement EmergencyContact = driver.findElement(By.xpath("//input[@class='form-control']"));
		EmergencyContact.click();
		Thread.sleep(2000);
		EmergencyContact.clear();
		Thread.sleep(2000);
		EmergencyContact.sendKeys("8056221601");
		Thread.sleep(2000);
		//Email
		WebElement Email = driver.findElement(By.id("email"));
		Email.click();
		Thread.sleep(2000);
		Email.clear();
		Thread.sleep(2000);
		Email.sendKeys("PD@gamil.com");
		Thread.sleep(2000);
		//Maritalstatus
		WebElement Maritalstatus = driver.findElement(By.id("maritalstatus"));
		Select D2 = new Select (Maritalstatus);
		D2.selectByValue("married");
		Thread.sleep(2000);
		//Language
		WebElement Language  = driver.findElement(By.id("language"));
		Select D3 = new Select (Language);
		D3.selectByValue("English");
		Thread.sleep(2000);
		//profilepic
		WebElement profilepic = driver.findElement(By.cssSelector("div.overlay"));
		action.moveToElement(profilepic).perform();
		Thread.sleep(3000);
		WebElement profilepicicon = driver.findElement(By.xpath("//div[@class='button']//span"));
		action.moveToElement(profilepicicon).click().build().perform();
		//dropzone for pic
		WebElement dropzone = driver.findElement(By.id("dropzone"));
		dropzone.click();
        // Profile pic upload
		String file = "C:\\Users\\PriyadharshanGanesh\\Downloads\\pharmacy_admin";		
		//C:\\Users\\priyadharshan\\Downloads\\pharmacy.jpg
		StringSelection selection = new StringSelection(file);
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Thread.sleep(3000);
	    //Robot Class for Performing the Keyboard actions
	    Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
	    Thread.sleep(3000);
	    robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(3000);
        //submit
        WebElement submit = driver.findElement(By.xpath("//button[@class='btn submit_btn primary_btn submitbtn-color btn-secondary']"));
        action.moveToElement(submit).perform();
        Thread.sleep(3000);
        submit.click();
		}
}
