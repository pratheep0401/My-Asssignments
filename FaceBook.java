package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
public static void main(String[] args) {
	 ChromeDriver driver= new ChromeDriver();	
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("https://www.facebook.com/");
	 driver.manage().window().maximize();
	 driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	 driver.findElement(By.name("firstname")).sendKeys("Pratheep");
	 driver.findElement(By.name("lastname")).sendKeys("T");
	 driver.findElement(By.name("reg_email__")).sendKeys("8940380320");
	 driver.findElement(By.id("password_step_input")).sendKeys("sethu007");
	 WebElement element= driver.findElement(By.name("birthday_day"));
	 Select date= new Select(element);
	 date.selectByIndex(3);
	 WebElement element1 = driver.findElement(By.id("month"));
	 Select month = new Select(element1);
	 month.selectByValue("1");
	 WebElement element2 = driver.findElement(By.id("year"));
	 Select year = new Select(element2);
	 year.selectByVisibleText("2001");
	 driver.findElement(By.xpath("//label[text()='Female']")).click();
	 
}
}
