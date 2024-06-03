package Pharmacist;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PharmacistMainFlow {
	public static void main(String[] args) throws InterruptedException {

		// Chrome_Browser Launch
		WebDriver driver = new ChromeDriver();
		driver.get("https://development.medyaan.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

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
		Thread.sleep(2000);

		// Create New Order
//		driver.findElement(By.xpath("//button[@class='btn latest-btn btn-secondary btn-sm']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//button[@class='btn edit-btn btn-secondary'])[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//button[@class='btn cancel-color mr-3 btn-secondary btn-sm'])[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//button[@class='close text-dark'])[1]")).click();

		// History
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn history-btn btn-secondary btn-sm']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("pharmacyhistoryFilter")).sendKeys("8056221601");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='view-btn'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn cancelbtn-color btn-secondary']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='close text-dark'])[2]")).click();
		Thread.sleep(2000);

		// Add Patient Flow
		driver.findElement(By.xpath("//*[@class=\"btn add-med-btn mr-2 btn-secondary btn-sm\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("firstname")).sendKeys("Dharshan");
		Thread.sleep(2000);
		driver.findElement(By.id("lastname")).sendKeys("G");
		Thread.sleep(2000);
		// For Gender Dropdown
		WebElement dropdownElement = driver.findElement(By.id("gender"));
		Select Genderdropdown = new Select(dropdownElement);
		Genderdropdown.selectByValue("Male");
		WebElement calendarInput = driver.findElement(By.id("dob"));
		calendarInput.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()[normalize-space()='2']]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("mobilenumber")).sendKeys("8056222601");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("priyadharshan1006@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("companyname")).sendKeys("Medyaan");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn mr-4 cancelbtn-color btn-secondary']")).click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//button[@class='el-button el-button--default el-button--small el-button--primary ']"))
				.click();
//		Thread.sleep(2000);
		// driver.findElement(By.xpath("//*[@id=\"patientModalNew___BV_modal_body_\"]/div/div/div[3]/div/div/button[2]")).click();

		// Search Medicine
//	  //Reference Doctor cash
//	   //Patient search field
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='searchVal'])[1]")).sendKeys("8056221601");
		Thread.sleep(2000);
		driver.findElement(By.id("suggesionList")).click();
		// Medicine search field
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='searchVal'])[2]")).sendKeys("dolo");
		Thread.sleep(2000);
		driver.findElement(By.id("suggesionLists")).click();
		Thread.sleep(2000);
		// Drop down handle for selecting batch dropdown
		WebElement dropdownElements = driver.findElement(By.id("batchId"));
		Select Batchdropdown = new Select(dropdownElements);
		Batchdropdown.selectByValue("122222");
		// Medicine search field
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys("3");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='btn add-med-btn btn-secondary btn-sm'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='searchVal'])[2]")).sendKeys("crocin");
		Thread.sleep(2000);
		driver.findElement(By.id("suggesionLists")).click();
		Thread.sleep(2000);
		// Drop down handle for selecting batch dropdown
		WebElement DropdownElement = driver.findElement(By.id("batchId"));
		Select CrocinBatchdropdown = new Select(DropdownElement);
		CrocinBatchdropdown.selectByValue("098765");
		// Medicine search field
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='btn add-med-btn btn-secondary btn-sm'])[2]")).click();
		Thread.sleep(5000);
		// For Handling the Edit action
		driver.findElement(By.xpath("(//button[@class='btn edit-btn btn-secondary'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='quantity']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='btn add-med-btn btn-secondary btn-sm'])[2]")).click();
		Thread.sleep(2000);
		// For Handling the Delete action
		driver.findElement(By.xpath("(//button[@class='btn delete-btn btn-secondary'])[1]")).click();
		// Payment method
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='form-medium-height form-control'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='form-medium-height form-control'])[1]")).sendKeys("25");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-secondary reference-btn btn-one']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='form-medium-height form-control'])[3]"))
				.sendKeys("Reference Code");
		Thread.sleep(2000);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='ref-group btn-group btn-group-md'])[3]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='form-medium-height form-control'])[4]")).click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='form-medium-height form-control'])[4]")).sendKeys("200");
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
//		
//		//Search Medicine
//		  //Reference Doctor Card
//		   //Patient search field
//		//DashBoard
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class=\"btn book-btn btn-secondary\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='searchVal'])[1]")).sendKeys("8056221601");
		Thread.sleep(2000);
		driver.findElement(By.id("suggesionList")).click();
		// Medicine search field
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='searchVal'])[2]")).sendKeys("dolo");
		Thread.sleep(2000);
		driver.findElement(By.id("suggesionLists")).click();
		Thread.sleep(2000);
		// Drop down handle for selecting batch dropdown
		WebElement CashdropdownElements = driver.findElement(By.id("batchId"));
		Select CashBatchdropdown = new Select(CashdropdownElements);
		CashBatchdropdown.selectByValue("122222");
		// Medicine search field
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='btn add-med-btn btn-secondary btn-sm'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='form-medium-height form-control'])[1]")).click();
		Thread.sleep(2000);
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
		driver.findElement(By.xpath("(//input[@class='form-medium-height form-control'])[4]")).sendKeys("200");
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
//		
		// Search Medicine
		// Reference Doctor UPI
		// Patient search field
//		//DashBoard
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn book-btn btn-secondary']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='searchVal'])[1]")).sendKeys("8056221601");
		Thread.sleep(2000);
		driver.findElement(By.id("suggesionList")).click();
//		Medicine search field
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='searchVal'])[2]")).sendKeys("dolo");
		Thread.sleep(2000);
		driver.findElement(By.id("suggesionLists")).click();
		Thread.sleep(2000);
		// Drop down handle for selecting batch dropdown
		WebElement UPIdropdownElements = driver.findElement(By.id("batchId"));
		Select UPIBatchdropdown = new Select(UPIdropdownElements);
		UPIBatchdropdown.selectByValue("122222");
		// Medicine search field
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='btn add-med-btn btn-secondary btn-sm'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='form-medium-height form-control'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='form-medium-height form-control'])[2]")).sendKeys("2");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-secondary reference-btn btn-one']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='form-medium-height form-control'])[3]"))
				.sendKeys("Reference Code");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='ref-group btn-group btn-group-md'])[3]/button[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='form-medium-height form-control'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='form-medium-height form-control'])[4]")).sendKeys("200");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn submitbtn-color submit-height-one btn-primary']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='el-message-box__btns']//button[2]")).click();
//		//Bill page
//		Thread.sleep(8000);
//		driver.findElement(By.xpath("//button[@class='submit_btn primary_btn submitbtn-color']")).click();
//		driver.findElement(By.xpath("(//button[@type='button'])[21]")).click();
//		//To navigating to Dashboard
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@class='btn close-btn btn-secondary btn-sm']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@class='el-message-box__btns']//button[2]")).click();

//		Search Medicine
		// Reference Employee cash
		// Patient search field
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@class=\"btn book-btn btn-secondary\"]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//input[@id='searchVal'])[1]")).sendKeys("8056221601");
//		Thread.sleep(2000);
//		driver.findElement(By.id("suggesionList")).click();
//		//Medicine search field
//		Thread.sleep(2000);	
//		driver.findElement(By.xpath("(//input[@id='searchVal'])[2]")).sendKeys("dolo");
//		Thread.sleep(2000);	
//		driver.findElement(By.id("suggesionLists")).click();
//		Thread.sleep(2000);	
//		//Drop down handle for selecting batch dropdown
//		WebElement EmpCashdropdownElements = driver.findElement(By.id("batchId"));
//		  Select EmpCashBatchdropdown = new Select(EmpCashdropdownElements);
//		  EmpCashBatchdropdown.selectByValue("122222");
//		//Medicine search field
//		Thread.sleep(2000);	
//	    driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys("1");
//	    Thread.sleep(2000);	
//	    driver.findElement(By.xpath("(//button[@class='btn add-med-btn btn-secondary btn-sm'])[2]")).click();
//	    Thread.sleep(2000);
//		driver.findElement(By.xpath("(//input[@class='form-medium-height form-control'])[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//input[@class='form-medium-height form-control'])[1]")).sendKeys("25");

//		 For Choosing the Employee Code
//		Thread.sleep(8000);
//		driver.findElement(By.xpath("(//div[@class='ref-group btn-group btn-group-md']//button)[5]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//input[@class='form-medium-height form-control'])[3]")).sendKeys("Reference Code");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//div[@class='ref-group btn-group btn-group-md'])[3]/button[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//input[@class='form-medium-height form-control'])[4]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//input[@class='form-medium-height form-control'])[4]")).sendKeys("200");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@class='btn submitbtn-color submit-height-one btn-primary']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@class='el-message-box__btns']//button[2]")).click();
//		//Bill page
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("(//button[@type='button'])[21]")).click();
//		//To navigating to Dashboard
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@class='btn close-btn btn-secondary btn-sm']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@class='el-message-box__btns']//button[2]")).click();

//			
//			//Search Medicine
//			  //Reference Doctor Card
//			   //Patient search field
//			//DashBoard
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//*[@class=\"btn book-btn btn-secondary\"]")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("(//input[@id='searchVal'])[1]")).sendKeys("8056221601");
//			Thread.sleep(2000);
//			driver.findElement(By.id("suggesionList")).click();
//			//Medicine search field
//			Thread.sleep(2000);	
//			driver.findElement(By.xpath("(//input[@id='searchVal'])[2]")).sendKeys("dolo");
//			Thread.sleep(2000);	
//			driver.findElement(By.id("suggesionLists")).click();
//			Thread.sleep(2000);	
//			//Drop down handle for selecting batch dropdown
//			WebElement CashdropdownElements = driver.findElement(By.id("batchId"));
//			  Select CashBatchdropdown = new Select(CashdropdownElements);
//			  CashBatchdropdown.selectByValue("122222");
//			//Medicine search field
//			Thread.sleep(2000);	
//		    driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys("1");
//		    Thread.sleep(2000);	
//		    driver.findElement(By.xpath("(//button[@class='btn add-med-btn btn-secondary btn-sm'])[2]")).click();
//		    Thread.sleep(2000);
//			driver.findElement(By.xpath("(//input[@class='form-medium-height form-control'])[1]")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("(//input[@class='form-medium-height form-control'])[1]")).sendKeys("25");
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//button[@class='btn btn-secondary reference-btn btn-one']")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("(//input[@class='form-medium-height form-control'])[3]")).sendKeys("Reference Code");
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("(//div[@class='ref-group btn-group btn-group-md'])[3]/button[2]")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("(//input[@class='form-medium-height form-control'])[4]")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("(//input[@class='form-medium-height form-control'])[4]")).sendKeys("200");
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//button[@class='btn submitbtn-color submit-height-one btn-primary']")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//div[@class='el-message-box__btns']//button[2]")).click();
//			//Bill page
//			Thread.sleep(5000);
//			driver.findElement(By.xpath("(//button[@type='button'])[21]")).click();
//			//To navigating to Dashboard
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//button[@class='btn close-btn btn-secondary btn-sm']")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//div[@class='el-message-box__btns']//button[2]")).click();
//			
		// Search Medicine
		// Reference Doctor UPI
		// Patient search field
		// DashBoard
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//button[@class='btn book-btn btn-secondary']")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("(//input[@id='searchVal'])[1]")).sendKeys("8056221601");
//			Thread.sleep(2000);
//			driver.findElement(By.id("suggesionList")).click();
//			//Medicine search field
//			Thread.sleep(2000);	
//			driver.findElement(By.xpath("(//input[@id='searchVal'])[2]")).sendKeys("dolo");
//			Thread.sleep(2000);	
//			driver.findElement(By.id("suggesionLists")).click();
//			Thread.sleep(2000);	
//			//Drop down handle for selecting batch dropdown
//			WebElement UPIdropdownElements = driver.findElement(By.id("batchId"));
//			  Select UPIBatchdropdown = new Select(UPIdropdownElements);
//			  UPIBatchdropdown.selectByValue("122222");
//			//Medicine search field
//			Thread.sleep(2000);	
//		    driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys("1");
//		    Thread.sleep(2000);	
//		    driver.findElement(By.xpath("(//button[@class='btn add-med-btn btn-secondary btn-sm'])[2]")).click();
//		    Thread.sleep(2000);
//			driver.findElement(By.xpath("(//input[@class='form-medium-height form-control'])[1]")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("(//input[@class='form-medium-height form-control'])[2]")).sendKeys("2");
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//button[@class='btn btn-secondary reference-btn btn-one']")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("(//input[@class='form-medium-height form-control'])[3]")).sendKeys("Reference Code");
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("(//div[@class='ref-group btn-group btn-group-md'])[3]/button[3]")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("(//input[@class='form-medium-height form-control'])[4]")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("(//input[@class='form-medium-height form-control'])[4]")).sendKeys("200");
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//button[@class='btn submitbtn-color submit-height-one btn-primary']")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//div[@class='el-message-box__btns']//button[2]")).click();
//			//Bill page
//			Thread.sleep(8000);
//			driver.findElement(By.xpath("//button[@class='submit_btn primary_btn submitbtn-color']")).click();
//			driver.findElement(By.xpath("(//button[@type='button'])[21]")).click();
//			//To navigating to Dashboard
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//button[@class='btn close-btn btn-secondary btn-sm']")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//div[@class='el-message-box__btns']//button[2]")).click();		

	}

}
