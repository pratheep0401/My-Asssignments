package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
	driver.manage().window().maximize();
	driver.switchTo().frame("frame1");
	WebElement element = driver.findElement(By.xpath("//input[@type='text']"));
	element.sendKeys("Assignment");
	driver.switchTo().frame("frame3");
	driver.findElement(By.xpath("//b[text()='Inner Frame Check box :']/following-sibling::input")).click();
	driver.switchTo().defaultContent();
	driver.switchTo().frame("frame2");
	WebElement element2 = driver.findElement(By.id("animals"));
	Select pet = new Select(element2);
	pet.selectByValue("babycat");
}
}
