package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SalesForceID {
public static void main(String[] args) {
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--disable-notifications");
	ChromeDriver driver = new ChromeDriver(option);
	driver.get("https://login.salesforce.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Qeagle@123");
	driver.findElement(By.xpath("//input[@id='Login']")).click();
	driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	driver.findElement(By.xpath("//button[text()='View All']")).click();
	driver.findElement(By.xpath("//p[text()='Sales']")).click();
	
	WebElement element = driver.findElement(By.xpath("//span[text()='Accounts']"));
	driver.executeScript("arguments[0].click();", element);
	driver.findElement(By.xpath("//div[text()='New']")).click();
	driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Pratheep");
	WebElement element2 = driver.findElement(By.xpath("//legend [text()='Shipping Address']"));
	Actions builder = new Actions(driver);
	builder.scrollToElement(element2).perform();
	
	driver.findElement(By.xpath("(//span[text()='--None--'])[3]")).click();
	driver.findElement(By.xpath("//span[text()='Public']")).click();
	driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
	String text = driver.findElement(By.xpath("//lightning-formatted-text[text()='pratheep']")).getText();
	if (text.equals("Pratheep")) {
		System.out.println("Account Verified");
	}else
		System.out.println("Account Not Verified");
}
}
