package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.findElement(By.className("inputLogin")).sendKeys("Demosalesmanager");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Contacts")).click();
	driver.findElement(By.linkText("Create Contact")).click();
	driver.findElement(By.id("firstNameField")).sendKeys("Pratheep");
	driver.findElement(By.id("lastNameField")).sendKeys("T");
	driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Sethu");
	driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("vikram");
	driver.findElement(By.id("createContactForm_departmentName")).sendKeys("MECH");
	driver.findElement(By.id("createContactForm_description")).sendKeys("hey!.");
	driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("pratheep611719114304@gmail.com");
	WebElement element =driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
	Select state = new Select(element);
	state.selectByVisibleText("New York");
	driver.findElement(By.name("submitButton")).click();
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.id("updateContactForm_description")).clear();
	driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Willing to Work");
	driver.findElement(By.xpath("//input[@value='Update']")).click();
	System.out.println(driver.getTitle());
	
}
}
