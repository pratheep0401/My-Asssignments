package assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MergeContact {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.xpath("//a[text()='Contacts']")).click();
	driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
	driver.findElement(By.xpath("//img[@src='/images/fieldlookup.gif']")).click();
	String windowHandle = driver.getWindowHandle();
	Set<String> windowHandles = driver.getWindowHandles();
	List<String> first = new ArrayList<String>(windowHandles);
	driver.switchTo().window(first.get(1));
	System.out.println(driver.getTitle());
	Thread.sleep(600);
	WebElement element = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
	element.click();
	driver.switchTo().window(windowHandle);
	System.out.println(driver.getTitle());
	WebElement element2= driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]"));
	element2.click();
	Set<String> windowHandles2 = driver.getWindowHandles();
	List<String> second = new ArrayList<String>(windowHandles2);
	driver.switchTo().window(second.get(1));
	driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
	driver.switchTo().window(windowHandle);
	driver.findElement(By.className("buttonDangerous")).click();
	Alert alert = driver.switchTo().alert();
	alert.accept();
	if ((driver.getTitle()).contains("View Contact")) {
		System.out.println("Title verified");
	} else {
		System.out.println("Title is not verified");
	}
}
}
