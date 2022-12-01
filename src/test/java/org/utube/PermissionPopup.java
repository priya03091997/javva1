package org.utube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PermissionPopup {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Log in with Facebook']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("email")).sendKeys("priyadarsini3997@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Dharshu@8939");
		
		driver.findElement(By.id("loginbutton")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[@tabindex='0'])[14]")).click();
	}

}
