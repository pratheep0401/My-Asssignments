package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.findElement(By.className("inputLogin")).sendKeys("Demosalesmanager");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[3]")).click();
	driver.findElement(By.name("emailAddress")).sendKeys("abcefg@gmail.com");
	//driver.findElement(By.xpath("//input[@class=' x-form-text x-form-field ']")).sendKeys("abcefg@gmail.com");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(600);
	WebElement store = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"));
	String name=store.getText();
	System.out.println(name);
	store.click();
	driver.findElement(By.linkText("Duplicate Lead")).click();
	String txt =driver.getTitle();
	if (txt.contains("Duplicate Lead")) {
		System.out.println("Verified the Title as "+txt);
	}
	driver.findElement(By.xpath("//a[text()='Create Lead']"));
	if (name.equals("Karthik")) {
		System.out.println("Duplicate name is same as captured name");
	} else {
		System.out.println("Duplicate name is not same as captured name");
	}
	driver.close();
}
}
