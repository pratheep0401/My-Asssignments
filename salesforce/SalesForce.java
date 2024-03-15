package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SalesForce {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://login.salesforce.com");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ragunath.testleaf@gmail.com");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Testleaf@123");
	    driver.findElement(By.xpath("//input[@id='Login']")).click(); 
	    
	    driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	    driver.findElement(By.xpath("//button[text()='View All']")).click();
	    driver.findElement(By.xpath("//p[text()='Sales']")).click();
	    driver.findElement(By.xpath("//span[text()='Opportunities']")).click();
	    driver.findElement(By.xpath("//div[text()='New']")).click();
	    driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by Pratheep");
	    String opName = driver.findElement(By.xpath("//input[@name='Name']")).getText();
	    driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys("75000");
	    driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
	    driver.findElement(By.xpath("//button[text()='Today']")).click();
	    driver.findElement(By.xpath("//span[text()='--None--']")).click();
	    driver.findElement(By.xpath("//span[text()='Needs Analysis']")).click();
	    driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
	    String opName1 =driver.findElement(By.linkText("Salesforce Automation by Pratheep")).getText();
	    if(opName.equals(opName1)) {
	    	System.out.println("Opportunity name is verified");
	    }else
	    	System.out.println("Opportunity name is Not verified");
	}

}
