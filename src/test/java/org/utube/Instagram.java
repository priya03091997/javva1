package org.utube;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Instagram {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Log in with Facebook']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("priyadarsini3997@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Dharshu@8939");
		driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
		driver.findElement(By.xpath("//h2[text()='Turn on Notifications']"));
		
	Robot robot=new Robot();
		
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
	//	robot.keyPress(KeyEvent.VK_TAB);
	//	robot.keyRelease(KeyEvent.VK_TAB);
		
	//	robot.keyPress(KeyEvent.VK_TAB);
	//	robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement key = driver.findElement(By.xpath("//input[@aria-label='Search input']"));
		key.sendKeys("ANAND");
		
		
		
		
		
		
		
		
	}

}
