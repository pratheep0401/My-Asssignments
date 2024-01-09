package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
public static void main(String[] args) throws Exception {
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
	driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();
	driver.findElement(By.name("phoneCountryCode")).clear();
	//driver.findElement(By.name("phoneCountryCode")).sendKeys("91");
	//driver.findElement(By.name("phoneAreaCode")).sendKeys("001");
	//driver.findElement(By.name("phoneNumber")).sendKeys("8940380320");
	driver.findElement(By.name("phoneNumber")).sendKeys("99");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(3000);
	WebElement txt =driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
	String text1= txt.getText();
	System.out.println("ID" + text1);
	txt.click();
	driver.findElement(By.className("subMenuButtonDangerous")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("//input[@style='width: 212px;']")).sendKeys(text1);
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	WebElement element =driver.findElement(By.className("x-paging-info"));
	String text = element.getText();
	if (text.contains("No records")) {
		System.out.println("No records to display");
	}
	driver.close();
}
}
